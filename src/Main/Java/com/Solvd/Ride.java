package main.java.com.solvd;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ride {
	private final static Logger LOGGER = LogManager.getLogger(Ride.class);
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

	public static void newRide() {
		
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
		
		LOGGER.fatal(" --- Enter your destination with numbers ---");
		int userDestination = myScanner.nextInt();;
		myScanner.nextLine();
		
		LOGGER.fatal("- The mount is: $" + userDestination);
		
		int finalAmount = Math.abs(userDestination - homeLocation);

		LOGGER.fatal("- The mount is: $" + finalAmount);
		
		String response = "Yes";
		LOGGER.fatal("\n How do you wanna use Credit or Debit? use C or D\n");
		response = myScanner.next();
		myScanner.next();

		if (response.equals("D")) {
			Debit newDebit = new Debit("Debit", finalAmount);
			LOGGER.fatal("The amount is: " + (newDebit.calculate(finalAmount)));
		} else {
			CreditCard newCredit = new CreditCard("Credit", finalAmount);
			LOGGER.fatal("The Mount is: " + newCredit.calculate(finalAmount));
		}
	}

}
