package com.madbarsoft.movieinfo.movie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@GetMapping("/{movieId}")
	public MovieDto getMovieInfo(@PathVariable("movieId") String movieId) {

		return new MovieDto(movieId, "Name for " + movieId);

	}
	
	

}
