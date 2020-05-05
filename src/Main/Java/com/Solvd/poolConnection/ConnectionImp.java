package main.java.com.solvd.poolConnection;

import java.util.Random;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConnectionImp implements Connection {
	
	private ConnectionImp() {
		// TODO Auto-generated constructor stub
	}
	
	static ConnectionImp getInstance() {
		return new ConnectionImp();
	}
	
	public void stablishConnection() throws InterruptedException {
		long connectionDuration = getRandomNumberInRange(1, 10) * 1000;
		System.out.println("starting connection...");
		Thread.sleep(connectionDuration);
		System.out.println("finished connection after: " + connectionDuration + " miliseconds");
		
	}
	
	private long getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
		
	}

}
