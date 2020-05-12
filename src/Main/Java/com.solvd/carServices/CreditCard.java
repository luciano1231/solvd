package carServices;

import main.java.com.solvd.lambdaTest.CalculateMount;

public class CreditCard extends Payment{

	public CreditCard(String payMethod, double amount) {
		super(payMethod, amount);
		// TODO Auto-generated constructor stub
	}
	/*@Override
	public double calculate(double amount) {
		return amount*1.30;
	}*/
	
	// My Lambda expr.
	@Override
	public double calculate(double number) {
		CalculateMount calc= (double x) -> (x*1.3);		
		return calc.mount(number);
			}





}
