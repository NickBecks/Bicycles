package ua.belvit;

import java.util.Date;

public interface CommentsServiceInterface {
	
	public void addComment(int id, String text, Date date);
	public void removeComment(int id);
	public void changeComment(int id, String text, Date date);

}
