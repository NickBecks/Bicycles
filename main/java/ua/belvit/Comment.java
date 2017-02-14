package ua.belvit;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Comment implements CommentsServiceInterface{

	@Size(max = 2000) @NotNull 
	private String text;
	@NotNull 
	private Date date;
	@NotNull 
	private int id;
	
	
	public void addComment(int id, String text, Date date) {
		// TODO Auto-generated method stub
		
	}
	public void removeComment(int id) {
		// TODO Auto-generated method stub
		
	}
	public void changeComment(int id, String text, Date date) {
		// TODO Auto-generated method stub
		
	}
	
}
