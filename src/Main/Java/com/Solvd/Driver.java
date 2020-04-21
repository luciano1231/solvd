package Main.Java.com.Solvd;
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
		LOGGER.info("- The Driver is:" + this.getName());
	}
	public int calculateDistance (int currentDistance, int a) {
		return a - currentDistance;
	}
	
}
