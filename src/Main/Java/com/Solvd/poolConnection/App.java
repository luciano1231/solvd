package main.java.com.solvd.poolConnection;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App 
{	
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	ConnectionPool connectionPool = ConnectionPool.getInstance(10);
    	ExecutorService threadPool = Executors.newFixedThreadPool(20);
        for(int i = 0; i < 20; i++) {
        	ConnectionTask task = ConnectionTask.getInstance(connectionPool);// 
        	threadPool.execute(task);
        }
    }
}
