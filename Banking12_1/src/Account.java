import java.text.NumberFormat;

/* 
 * This is the actual account that can be withdrawn, deposited and balanced
 */
public class Account implements Withdrawable, Balanceable, Depositable{
	double balance = 0.0;
	
public String getBalanceFormatted(){
	NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
	String balanceFormatted = currencyFormatter.format(balance);
	return balanceFormatted;
}


@Override
public void deposit(double amount) {
	this.balance += amount;
	
}

@Override
public double getBalance() {
	return this.balance;
}

@Override
public void setBalance(double amount) {
	this.balance = amount;
	
}

@Override
public void withdraw(double amount) {
	this.balance -= amount;
	
}
}
