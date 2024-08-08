package in.sp.main.entity;

public class User {

	private String username;
	private String email;
	private String gender;
	private String location;
	
	
	
	public User(String username, String email, String gender, String location) {
	this.username=username;
	this.email=email;
	this.gender=gender;
	this.location=location;
}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
		
}
