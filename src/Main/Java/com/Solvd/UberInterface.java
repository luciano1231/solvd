package Main.Java.com.Solvd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Main.Java.com.Solvd.generics.MyGeneric;

import java.util.Scanner;

public class UberInterface {
	private final static Logger LOGGER = LogManager.getLogger(UberInterface.class);

	public static void main(String[] args) {
	
		Scanner myEscaner = new Scanner (System.in);
		
		LOGGER.info(" ---       UBER       ---");
		LOGGER.info(" --- Please Register ---");
			
		LOGGER.info(" --- Enter your Name ---");
		String userName = myEscaner.next();
							
		LOGGER.info(" --- Enter a new ID number ---\n");
		int userID = myEscaner.nextInt();
			
		LOGGER.info(" --- Enter email ---");
		String userEmail = myEscaner.next();
			
		LOGGER.info(" --- Enter contact number ---");
		int userContact = myEscaner.nextInt();
		Client newClient= new Client(userID,userName, userEmail, userContact);
		
		
		//GENERIC object Client
		MyGeneric <Client> genClient= new MyGeneric<Client>(userID,userName, userEmail, userContact);		
		genClient.showType();
		
		
		//Create a new Client object with those parameters
		LOGGER.info(" --- Enter your home location with number ---");
		int userLocation = myEscaner.nextInt();
		
		LOGGER.info(" --- Enter your destination with numbers ---");
		int userDestination = myEscaner.nextInt();
		int amount;
		
		LOGGER.info(" --- Enter your destination with numbers --- \n");
		amount = Math.abs(userDestination - userLocation);
		
		LOGGER.info("- The mount is: $" + amount);
		

		//Creating a list with Drivers
		Driver[] drivers = new Driver[10];
		drivers[0] = new Driver(0002,"Jason King", "jsonking@outlook.com", 3352211,8528524, 50);
		drivers[1] = new Driver(0003,"Snow Kevin", "jsonking@outlook.com", 2113352,5248528, 100);
		drivers[2] = new Driver(0004,"George Lucas", "jsonking@outlook.com", 3352211,5288524, 150);
		drivers[3] = new Driver(0005,"Terry Bogard", "jsonking@outlook.com", 5223311,1028524, 250);
		drivers[4] = new Driver(0006,"Iory Yagami", "jsonking@outlook.com", 2233511,5111524, 80);
		drivers[5] = new Driver(0007,"Johnny Cage", "jsonking@outlook.com", 1152211,0000024, 30);
		drivers[6] = new Driver(0000,"Chris Redfield", "jsonking@outlook.com", 999211,9858824, 10);
		drivers[7] = new Driver(0001,"Clark Kent", "jsonking@outlook.com", 4442211,2232214, 150);
		
		
		//Seeking for the nearest driver in a list of Drivers		
		int min = 999;
		int chosen=0;	 
		int i=0;
		for ( i =0; i<=6 ;i++) {
			
			if (i == 7) {
				 i=0;
			 } 
			//Compares distances
			if (Math.abs(drivers[i].calculateDistance(drivers[i].getCurrentDistance(), userLocation)) <= min) {
				 min =Math.abs(drivers[i].calculateDistance(drivers[i].getCurrentDistance(), userLocation));	
			
				 chosen=i;
				 }
				 else {
					 i++; 
				 }			
			}
		myEscaner.close();
		LOGGER.info("- The nearest driver is "+drivers[chosen].getName());
		LOGGER.info("- License Nº: " + drivers[chosen].getLicenceNumber());
		String response = "Yes";
		LOGGER.info("\n How do you wanna use Credit or Debit? use C or D");
		response = myEscaner.next();
		
		if (response == "D") {
			Debit newDebit= new Debit("Debit",amount);
			LOGGER.info("The amount is: "+ (newDebit.calculate(amount)));
		}else {
			CreditCard newCredit= new CreditCard("Credit",amount);
			LOGGER.info("The Mount is: "+newCredit.calculate(amount));
		}
		}
		
	}
		
		
		
		
		

