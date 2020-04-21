
package Main.Java.com.Solvd;

public class Ride {
	private int origin;
	private int destination;
	private double amount;
	private double distance;
	
	enum CStatus{
		WAITIN("Waiting for the driver"),
		FINISHED("Arrived");
		private CStatus(String st) {
			this.st=st;
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

}
 