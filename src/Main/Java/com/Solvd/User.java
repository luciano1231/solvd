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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userID != other.userID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + 
				", userName=" + userName +
				", userEmail=" + userEmail +
				", userContact=" + userContact + "]";
	}
	

}
