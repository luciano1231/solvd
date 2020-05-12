package main.java.com.solvd.enumTask;

public enum RideStatus {
	
		WAITIN("Waiting for the driver"), 
		FINISHED("Arrived");

		private RideStatus(String st) {
			this.setSt(st);
		}

		public String getSt() {
			return st;
		}

		public void setSt(String st) {
			this.st = st;
		}

		private String st;
	}



