package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import carServices.Admin;

public class Conecta_pruebas {
	private final static Logger LOGGER = LogManager.getLogger(Admin.class);

	public Conecta_pruebas() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		try {
			//Creating connection
			LOGGER.debug("Try");
			LOGGER.info("Try connection");
			System.out.println("Try");
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","lucianoArg","1231");
			System.out.println("Connected");
			
			//Statement
			Statement miStatement= miConexion.createStatement();
			
			//SQL Commands
			//ResultSet  for table like model
			ResultSet miResulset= miStatement.executeQuery("SELECT * FROM mydb.models");

			while (miResulset.next()) {
				System.out.println(miResulset.getString("id")+" "+ miResulset.getString("description"));
			}
			
		}catch(Exception e){
			System.out.println("No ERROR");
			e.printStackTrace();
			
		}
		
	}

}
