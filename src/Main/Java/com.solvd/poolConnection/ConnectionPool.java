package main.java.com.solvd.poolConnection;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConnectionPool {

	private BlockingQueue<Connection> connectionsQueue;

	private ConnectionPool(int size) {
		connectionsQueue = new LinkedBlockingQueue<Connection>(size);
		initializeQueueElements(size);
	}

	private void initializeQueueElements(int size) {
		for (int i = 0; i < size; i++) {
			connectionsQueue.add(ConnectionImp.getInstance());
		}
	}

	public static ConnectionPool getInstance(int size) {
		return new ConnectionPool(size);
	}

	public Connection get() {
		Connection connection = null;
		try {
			connection = connectionsQueue.take();
		} catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
		return connection;
	}

	public void ReleaseConnection(Connection releasedConnection) {
		try {
			connectionsQueue.put(releasedConnection);
		} catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
	}

}
