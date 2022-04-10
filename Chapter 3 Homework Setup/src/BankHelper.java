
public class BankHelper {
	
	/**
	 *  1. Modify this sort deposit method to accept a generic parameter that
	 *  	implements an object implementing the Deposit interface as list of objects
	 *  2. Loop through the list, and sort it based on value
	 */
	public void sortDeposits() {
		
	}

	public static void main(String[] args) {

		CoinCurrency coinSubmission = new CoinCurrency("Sock Drawer", 25.23);
		PaperCurrency paperSubmission = new PaperCurrency("Bonds", 252.32);
		ValuableObject objectSubmission = new ValuableObject ("Grandfathers Watch", 1222.32);
		
		// TODO - Populate these into a list of Deposit Objects
		// TODO - Pass list into sortDeposits method
		// TODO - Print sorted values to console

	}

}
