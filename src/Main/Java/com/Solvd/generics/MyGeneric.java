package Main.Java.com.Solvd.generics;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyGeneric<T> {
	private final static Logger LOGGER = LogManager.getLogger(MyGeneric.class);

	private T object;
	
	public MyGeneric(T object) {
	
		this.object = object;
	 	}

	public MyGeneric(int userID, String userName, String userEmail, int userContact) {
		// TODO Auto-generated constructor stub
	}

	public void showType() {
		LOGGER.fatal("Test Name for this class "+object.getClass().getName());
	}

}
