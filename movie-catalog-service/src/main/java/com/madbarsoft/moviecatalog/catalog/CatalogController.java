package com.madbarsoft.moviecatalog.catalog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

	@Autowired
	private RestTemplate restTemplate;
	

    @RequestMapping("/{userId}")
    public List<CatalogItemDto> getCatalog(@PathVariable("userId") String userId) {
    	
        List<RatingDto> ratingsList = Arrays.asList(
                new RatingDto("1234", 3),
                new RatingDto("5678", 4)
        );

        return ratingsList.stream()
                .map(rating -> {
                    MovieDto movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), MovieDto.class);
                    return new CatalogItemDto(movie.getName(), "Description", rating.getRating());
                })
                .collect(Collectors.toList());

    }
    
    

}
