package com.solvd.mavenUberCarService.jaxb;

import java.io.File;
import java.util.LinkedList;

import com.solvd.mavenUberCarService.carServices.Driver;
import com.solvd.mavenUberCarService.carServices.DriversList;
import javax.xml.bind.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.persistence.jaxb.MarshallerProperties;



public class JaxbDrivers {
	private final static Logger LOGGER = LogManager.getLogger(JaxbDrivers.class);

	public JaxbDrivers() {		
	}
	
	
	public static void createXML() {
		try {
				
			LinkedList<Driver> driversLL = Driver.driverList();
			
			System.out.println("Created a linked List with Drivers");
			
			DriversList driverList = new DriversList();
			
			driverList.setDrivers(driversLL);
			
			System.out.println(driverList.getDrivers().size());
			
			JAXBContext ctx = JAXBContext.newInstance(DriversList.class);
			
			Marshaller ms = ctx.createMarshaller();
			
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			//Converting to XML
			ms.marshal(driverList, new File("C:\\logs\\users.xml"));
			
			LOGGER.fatal("finished Creating XML file");
			
		} catch (JAXBException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
	}
	
	public static void readXML() {
		try {
			//creating context JAXB
			JAXBContext ctx = JAXBContext.newInstance(DriversList.class);
			Unmarshaller ums = ctx.createUnmarshaller();
			
			LOGGER.fatal("unmarshaleado1");
			
			DriversList driversList = (DriversList)ums.unmarshal(new File("C:\\logs\\drivers2.xml"));
			
			LOGGER.fatal("unmarshaleado");
			//My logic error
			
//			for (Driver driver: driversList.getDrivers()) {
//				System.out.println(driver.getName() +" "+driver.getLicenceNumber()+" "+driver.getContact());
//			}
			
			
			
		}catch(JAXBException ex){
			ex.printStackTrace();
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		//createXML();
		readXML();
	}

}
