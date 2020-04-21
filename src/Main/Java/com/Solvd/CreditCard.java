package Main.Java.com.Solvd;

public class CreditCard extends Payment{

	public CreditCard(String payMethod, double amount) {
		super(payMethod, amount);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculate(double amount) {
		return amount+amount*0.30;
	}




}
