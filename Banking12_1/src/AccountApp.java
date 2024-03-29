import java.util.Scanner;

public class AccountApp {

	public static void main(String[] args) {
		
		CheckingAccount theCheckingAccount = new CheckingAccount();
		String choice = "y";
		String withdrawOrDeposit = "";
		Double transactionAmount = 0.0;
		Scanner sc = new Scanner(System.in);
		
		theCheckingAccount.setBalance(1000.00);
		
		System.out.println("Welcome to the Account Calculator");
			
			System.out.println("Starting Balance");
			System.out.print("Checking: ");
			System.out.println(theCheckingAccount.getBalanceFormatted());
			
			System.out.println("Enter the transactions for the month: ");
			
			while (choice.equalsIgnoreCase("y")) {
				System.out.println("Withdrawls or deopsit? (w/d): ");
				withdrawOrDeposit = sc.nextLine();
				if (withdrawOrDeposit.equalsIgnoreCase("w")) {
					System.out.println("Amount: ");
					transactionAmount = sc.nextDouble();
					sc.nextLine();
					Transactions.withdraw(theCheckingAccount, transactionAmount);
				}
				if (withdrawOrDeposit.equalsIgnoreCase("d")) {
					System.out.println("Amount: ");
					transactionAmount = sc.nextDouble();
					sc.nextLine();
					Transactions.withdraw(theCheckingAccount, transactionAmount);
				}

				System.out.println("Continue? (y/n): ");
				choice = sc.nextLine();
			}
			System.out.println("Monthly Fees: ");
			
			System.out.print("Checking Fees: ");
			System.out.println(theCheckingAccount.getMontlyFeeFormatted());
			theCheckingAccount.subtractMontlyFee();
			
			System.out.println("Final Balance: ");
			
			System.out.print("Checking: ");
			System.out.println(theCheckingAccount.getBalanceFormatted());
			
	}

}
