package ua.belvit;

import java.util.Date;

public interface UsersServiceInterface {
	
	public void setName(String name);
	public void setEmail(String email);
	public void setLogin(String login);
	public void setPassword(String password);
	public void setRegDate(Date date);
	public void removeUser(User user);
	public void addUser(String name, String email, String password, String login, Date date);

}
