package com.madbarsoft.ratingdata.rating;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingController {

	@GetMapping("/{movieId}")
	public RatingDto getRating(@PathVariable("movieId") String movieId) {

		return new RatingDto(movieId, 4);

	}

}
