package main.java.com.solvd;

public abstract class User {
	private int userID;
	private String userName;
	private String userEmail;
	private int userContact;

	public User (int userID, String userName, String userEmail, int userContact) {
		this.setID (userID);
		this.setName (userName);
		this.setEmail (userEmail);
		this.setContact (userContact);
		
	}
	public User() {};
	//Setters	
	public void setID(int userID) {
		this.userID = userID;
	}
	public void setName(String userName) {
		this.userName = userName;
	}
	public void setEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public void setContact(int userContact) {
		this.userContact = userContact;
	}
	
	//Getters
	public int getID () {
		return this.userID;
	}
	public String getName() {
		return this.userName;
	}
	public String getEmail() {
		return this.userEmail;
	}
	public int getContact() {
		return this.userContact;
	}

	public void showDetails() {
	}

}
