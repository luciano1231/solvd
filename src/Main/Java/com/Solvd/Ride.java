
package main.java.com.solvd;

import java.util.Scanner;

public class Ride {
	private int origin;
	private int destination;
	private double amount;
	private double distance;
	
	enum CStatus{
		WAITIN("Waiting for the driver"),
		FINISHED("Arrived");
		private CStatus(String st) {
			this.setSt(st);
		}		
		public String getSt() {
			return st;
		}
		public void setSt(String st) {
			this.st = st;
		}
		private String st;
	}

	public Ride(int origin, int destination, double amount, double distance, Driver newDriver, Payment newPayment, Client newClient) {
		this.origin = origin;
		this.destination = destination;
		this.amount = amount;
		this.distance = distance;
		
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
	
	public Ride newRide() {}
	//Creating a new client
			Client newClient = new Client();
			newClient.newClient();
			
			//GENERIC object Client
			//MyGeneric <Client> genClient= new MyGeneric<Client>(newClient.getID(),newClient.getName(), newClient.getEmail(),newClient.getContact());		
			//genClient.showType();

			Scanner myScanner = new Scanner (System.in);
			
			LOGGER.fatal(" --- Enter your destination with numbers ---");
			System.out.println("okokok");
			int userDestination =0;
			userDestination = myScanner.nextInt();
			System.out.println("okokok");
			int amount = Math.abs(userDestination - newClient.getUserLocation());
			
			LOGGER.fatal("- The mount is: $" + amount);
			
			//Creating a list of Drivers
			Driver driver = new Driver();
			Driver[] drivers = driver.driverList();
			
			//Looking for the nearest Driver
			driver.nearDriver(drivers, newClient.getUserLocation());
			
			String response = "Yes";
			LOGGER.fatal("\n How do you wanna use Credit or Debit? use C or D");
			response = myScanner.next();
			myScanner.close();
			
			if (response == "D") {
				Debit newDebit= new Debit("Debit",amount);
				LOGGER.fatal("The amount is: "+ (newDebit.calculate(amount)));
			}else {
				CreditCard newCredit= new CreditCard("Credit",amount);
				LOGGER.fatal("The Mount is: "+newCredit.calculate(amount));
			}

}
 