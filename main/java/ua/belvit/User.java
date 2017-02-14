package ua.belvit;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User implements UsersServiceInterface{
	
	@NotNull @Size(max = 16)
	private String name;
	@NotNull @Size(max = 18) @Pattern(regexp = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*" + "@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")
    private String email;
	@NotNull
	private Date reg_date;
	@NotNull @Size(max = 12)
	private String login;
	@NotNull @Size(max = 10)
	private String password;
	
	
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		
	}
	public void setLogin(String login) {
		// TODO Auto-generated method stub
		
	}
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		
	}
	public void setRegDate(Date date) {
		// TODO Auto-generated method stub
		
	}

	public void removeUser(User user){
		
	}

	public void addUser(String name, String email, String password, String login, Date date){
		
	}
}
