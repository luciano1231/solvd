package Main.Java.com.Solvd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Main.Java.com.Solvd.lambdaTest.CalculateMount;
import Main.Java.com.Solvd.lambdaTest.NameString;

import java.util.Scanner;

public class Admin extends User{
	private final static Logger LOGGER = LogManager.getLogger(Admin.class);

	//Enum for type of Admin access
	enum Access{
		LUCIANO("Full"),
		MARTIN("Full"),
		MATIAS("Local"),
		NICOLAS("Local");
		private Access(String ac) {
			this.ac=ac;
		}		
		private String ac;		
	}
	
	public Admin(int userID, String userName, String userEmail, int userContact) {
		super(userID, userName, userEmail, userContact);		
	}
	
	public Admin() {
	}
	
	//Simple Lambda example
	@Override
	public void showDetails() {
		NameString nString = (String x)-> ("\n Hello "+this.getName());
		LOGGER.fatal(nString.nameString(this.getName()));
		LOGGER.fatal( "\\n Entering the System please wait");
	}
	
	
	public double calculate(double number) {
		CalculateMount calc= (double x) -> (x*1.3);		
		return calc.mount(number);
			}
	
	
	public void myAcces() {
		Scanner sc= new Scanner(System.in);
		LOGGER.fatal("Enter your codeName");
		String cn= sc.next();
		Access acs= Access.valueOf(cn.toUpperCase());
		LOGGER.fatal("Your access level is "+acs.ac);
		sc.close();
		
	}
	
	
		
}


