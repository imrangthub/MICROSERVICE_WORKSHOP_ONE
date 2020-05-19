package com.madbarsoft.moviecatalog.catalog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/catalog-webclient")
public class CatalogWithWebClientController {

//	@Autowired
//	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	

    @RequestMapping("/{userId}")
    public List<CatalogItemDto> getCatalog(@PathVariable("userId") String userId) {
    	
        List<RatingDto> ratingsList = Arrays.asList(
                new RatingDto("11111", 1),
                new RatingDto("22222", 2)
        );

        return ratingsList.stream()
                .map(rating -> {
                    // MovieDto movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), MovieDto.class);
                    
                    MovieDto movie = webClientBuilder.build()
                    		.get()
                    		.uri("http://localhost:8082/movies/"+rating.getMovieId())
                    		.retrieve()
                    		.bodyToMono(MovieDto.class)
                    		.block();
                    
                    return new CatalogItemDto(movie.getName(), "Description with Web Client", rating.getRating());
                })
                .collect(Collectors.toList());

    }
    
    

}
