package com.madbarsoft.moviecatalog.catalog;

import java.util.List;

public class UserRatingDto {
	
	public UserRatingDto() {}
	
	private List<RatingDto> userRating;

	public List<RatingDto> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<RatingDto> userRating) {
		this.userRating = userRating;
	}
	
	

	@Override
	public String toString() {
		return "UserRatingDto [userRating=" + userRating + "]";
	}
	
	
	
	
	

}
