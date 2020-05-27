package com.madbarsoft.moviecatalog.catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class MovieInfoService {
	
	@Autowired
	private RestTemplate restTemplate;
	
//	@HystrixCommand(fallbackMethod="getFallBackMovieDto")
//	public MovieDto getMovieDto(RatingDto ratingObj) {
//		return restTemplate.getForObject("http://movie-info-service/movies/" + ratingObj.getMovieId(),
//				MovieDto.class);
//	}
//	
//	// 3
//	public MovieDto getFallBackMovieDto(RatingDto ratingObj) { 
//		System.out.println("#######################  Msg Form getFallBackMovieDto ##############################");
//		return new MovieDto("No Id", "No Name");
//	}
	
	

}
