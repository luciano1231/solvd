package main.java.com.solvd;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ride {
	private final static java.util.logging.Logger LOGGER = LogManager.getLogger(Ride.class);
	private int origin;
	private int destination;
	private double distance;
	private double amount;

	
	public Ride(int origin, int destination, double amount, double distance, Driver newDriver, Payment newPayment,
			Client newClient) {
		this.origin = origin;
		this.destination = destination;
		this.amount = amount;
		this.distance = distance;
		

	}

	public Ride() {
		// TODO Auto-generated constructor stub
	}

	public int getOrigin() {
		return origin;
	}

	public void setOrigin(int origin) {
		this.origin = origin;
	}

	public int getDestination() {
		return destination;
	}

	public void setDestination(int destination) {
		this.destination = destination;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	//Create a new ride with a new client, also looks for the nearest driver
	public static void newRide() {
		
		//Showing actual date
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 10);
		Date date = calendar.getTime();
		String formattedDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
		LOGGER.info("Date: " +formattedDate);
		
		
		// Creating a new client
		Client aClient=Client.newClient();
		
		// GENERIC object Client
		// MyGeneric <Client> genClient= new
		// MyGeneric<Client>(newClient.getID(),newClient.getName(),
		// newClient.getEmail(),newClient.getContact());
		// genClient.showType();
		
		Scanner myScanner = new Scanner(System.in);
		
		// Creating a list of Drivers
		Driver driver = new Driver();
		Driver[] drivers = driver.driverList();
		
		// Looking for the nearest Driver
		int homeLocation=aClient.getHomeLocation();
		driver.nearDriver(drivers, homeLocation);
		
		LOGGER.info(" --- Enter your destination with numbers ---");
		int userDestination = myScanner.nextInt();;
		myScanner.nextLine();
		
		LOGGER.info("- The mount is: $" + userDestination);
		
		int finalAmount = Math.abs(userDestination - homeLocation);

		LOGGER.info("- The mount is: $" + finalAmount);
		
		String response = "Yes";
		LOGGER.info("\n How do you wanna use Credit or Debit? use C or D\n");
		response = myScanner.next();
		myScanner.next();

		if (response.equals("D")) {
			Debit newDebit = new Debit("Debit", finalAmount);
			LOGGER.info("The amount is: " + (newDebit.calculate(finalAmount)));
		} else {
			CreditCard newCredit = new CreditCard("Credit", finalAmount);
			LOGGER.info("The Mount is: " + newCredit.calculate(finalAmount));
		}
		
	}
	

}
