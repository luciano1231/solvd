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
			//Creamos la conexion
			LOGGER.debug("Intenta");
			LOGGER.info("Try connection");
			System.out.println("Intenta");
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","lucianoArg","1231");
			System.out.println("conecta");
			//Creamos objeto Statement
			Statement miStatement= miConexion.createStatement();
			
			//Ejecutar la instruccion SQL
			//ResultSet  tiene forma de tabla
			ResultSet miResulset= miStatement.executeQuery("SELECT * FROM mydb.models");
			//recorrer el ResultSet
			while (miResulset.next()) {
				System.out.println(miResulset.getString("id")+" "+ miResulset.getString("description"));
			}
			
		}catch(Exception e){
			System.out.println("No ERROR");
			e.printStackTrace();
			
		}
		
	}

}
