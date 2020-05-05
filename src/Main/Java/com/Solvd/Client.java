package main.java.com.solvd;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client extends User{
	private final static Logger LOGGER = LogManager.getLogger(Client.class);
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
	public static Client newClient() {
		Scanner myEscaner = new Scanner (System.in);
		LOGGER.info(" ---       UBER       ---");
		LOGGER.fatal(" --- Please Register ---");
			
		LOGGER.fatal(" --- Enter your Name ---");
		String userName = myEscaner.next();
							
		LOGGER.fatal(" --- Enter a new ID number ---\n");
		int userID = myEscaner.nextInt();
			
		LOGGER.fatal(" --- Enter email ---");
		String userEmail = myEscaner.next();
			
		LOGGER.fatal(" --- Enter contact number ---");
		int userContact = myEscaner.nextInt();
		
		Client newClient= new Client(userID,userName, userEmail, userContact);
		//myEscaner.close();
		return newClient;
		
	}
	public int getHomeLocation() {
		Scanner myEscaner = new Scanner (System.in);

		LOGGER.fatal(" --- Enter your home location with number ---");
		int homeLocation = myEscaner.nextInt();
		return homeLocation;
	}
	
	
		
}
