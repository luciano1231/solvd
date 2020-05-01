package main.java.com.solvd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Driver extends User{

	private final static Logger LOGGER = LogManager.getLogger(Driver.class);

	private int licenceNumber;
	private int currentDistance;
	public Driver(int userID, String userName, String userEmail, int userContact, int licenceNumber, int currentDistance) {
		super(userID, userName, userEmail, userContact);
		this.setLicenceNumber(licenceNumber);
		this.setCurrentDistance(currentDistance);
	}

	public Driver() {
		// TODO Auto-generated constructor stub
	}

	private void setCurrentDistance(int currentDistance) {
		this.currentDistance = currentDistance;	
	}

	public int getLicenceNumber() {
		return licenceNumber;
	}
	public int getCurrentDistance() {
		return currentDistance;
	}


	public void setLicenceNumber(int licenceNumber) {
		this.licenceNumber = licenceNumber;
	}

	@Override
	public void showDetails() {
		LOGGER.fatal("- The Driver is:" + this.getName());
	}
	public int calculateDistance (int currentDistance, int a) {
		return a - currentDistance;
	}

	public Driver[] driverList() {
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

		return drivers;
	}
	public Driver nearDriver(Driver[] drivers,int userLocation) {
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
		LOGGER.fatal("- The nearest driver is "+drivers[chosen].getName());
		LOGGER.fatal("- License Nº: " + drivers[chosen].getLicenceNumber());
		return drivers[chosen];
	}

}
