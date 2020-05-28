package jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import carServices.Admin;

public class Conection {
	
	private final static Logger LOGGER = LogManager.getLogger(Admin.class);
	
	private static Conection instance; // for Singleton
	private Connection cnn;


	private Conection() {
						
		try {
			// Creating connection
			LOGGER.info("Try connection");		
			cnn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mydb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"lucianoArg", "1231");
			LOGGER.fatal("DB Successfully connected!!");

			Statement statement = cnn.createStatement();

			// Instruction SQL
			// ResultSet table form
			ResultSet myResulset = statement.executeQuery("SELECT * FROM mydb.models");

			while (myResulset.next()) {
				System.out.println(myResulset.getString("id") + " " + myResulset.getString("description"));
			}

		} catch (Exception e) {
			System.out.println(" ERROR ");
			e.printStackTrace();

		}

	}
	//Applying the Singleton pattern
	public synchronized static Conection curStatus() {
		if (instance == null) {
			instance = new Conection();
		}
		return instance;
	}

	public Connection getCnn() {
		return cnn;
	}
	public void closeConnection() {
		instance = null;
	}
	
}
