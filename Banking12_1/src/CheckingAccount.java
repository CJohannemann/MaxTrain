import java.text.NumberFormat;

/*
 * Set up the checking account
 * @ CJoh
 */



public class CheckingAccount extends Account {
	private double monthlyFee = 1.00;
	
		public void subtractMontlyFee(){
			balance = balance - monthlyFee;
		}
		public void setMontlyFee(double monthlyFee){
		this.monthlyFee = monthlyFee;
		}
		public double getMontlyFee(){
			return monthlyFee;
		}
		public String getMontlyFeeFormatted(){
			NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
			String balanceFormatted = currencyFormatter.format(monthlyFee);
			return balanceFormatted;
		}
}
