package ua.belvit;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Track implements TracksServiceInterface{
	
	@NotNull @Size(max = 12)
	private String name;
	@NotNull 
	private double length;
	@NotNull @Max(value = 5) @Min(value = 1)
	private int rating;
	
	
	public void addTrack(String name, double length) {
		// TODO Auto-generated method stub
		
	}
	public void removeTrack(String name) {
		// TODO Auto-generated method stub
		
	}
	public void changeTrack(String name, double length, int rating) {
		// TODO Auto-generated method stub
		
	}
	public void rateTrack(String name, int rating) {
		// TODO Auto-generated method stub
		
	}

}
