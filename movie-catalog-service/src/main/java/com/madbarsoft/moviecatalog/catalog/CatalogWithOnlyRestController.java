package com.madbarsoft.moviecatalog.catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/catalog-only-rest")
public class CatalogWithOnlyRestController {

	@Autowired
	private RestTemplate restTemplate;
	
	
	
	

	@RequestMapping("/list/{userId}")
	public List<CatalogItemDto> listOfMovieCatalogItem(@PathVariable("userId") String userId) {

		List<CatalogItemDto> catalogItemList = new ArrayList<CatalogItemDto>();

		UserRatingDto userRating = restTemplate.getForObject("http://localhost:8083/ratingsdata/users2/foo", UserRatingDto.class);

		System.out.println("userRating res: " + userRating);

		for (RatingDto ratingObj : userRating.getUserRating()) {
			MovieDto movie = restTemplate.getForObject("http://localhost:8082/movies/" + ratingObj.getMovieId(), MovieDto.class);

			catalogItemList.add(new CatalogItemDto(movie.getName(), "Description", ratingObj.getRating()));
		}

		System.out.println("catalogItemList:" + catalogItemList);

		return catalogItemList;

	}
	
	
	
	
	
	

	
	
	@RequestMapping("/{userId}")
	public List<CatalogItemDto> getCatalog(@PathVariable("userId") String userId) {

		List<RatingDto> ratingsList2 = restTemplate.getForObject("http://localhost:8083/ratingsdata/users/foo",
				List.class);

		System.out.println("ratings res: " + ratingsList2);

		List<RatingDto> ratingsList = Arrays.asList(new RatingDto("11111", 1), new RatingDto("22222", 2));

		return ratingsList.stream().map(rating -> {
			MovieDto movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(),
					MovieDto.class);
			return new CatalogItemDto(movie.getName(), "Description", rating.getRating());
		}).collect(Collectors.toList());

	}

}
