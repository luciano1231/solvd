package main.java.com.solvd;

public class Client extends User{

	public Client(int userID, String userName, String userEmail, int userContact) {
		super(userID, userName, userEmail, userContact);
		
	}	 

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showDetails() {
		System.out.println("- The Driver is:" + this.getName());
	}
}
