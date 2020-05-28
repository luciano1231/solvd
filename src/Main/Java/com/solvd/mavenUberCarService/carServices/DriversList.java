package carServices;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jaxb.JaxbDrivers;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.LinkedList;
import java.util.List;
@XmlRootElement


public class DriversList {
	private final static Logger LOGGER = LogManager.getLogger(DriversList.class);
	private LinkedList<Driver> drivers;
	
	public DriversList() {
		// TODO Auto-generated constructor stub
	}	
	
	public List<Driver> getDrivers() {
		LOGGER.fatal("Driver added");
		return drivers;
	}
	@XmlElement (name="driver")
	public void setDrivers(LinkedList<Driver> drivers) {
		this.drivers = drivers;
	}
	

}
