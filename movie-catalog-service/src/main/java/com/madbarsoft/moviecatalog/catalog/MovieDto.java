package com.madbarsoft.moviecatalog.catalog;

public class MovieDto {
	
	public MovieDto(){
		
	}
	
    private String movieId;
    private String name;

    public MovieDto(String movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
