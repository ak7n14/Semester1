public class ATM{
	public int balance=0;
	public char loop='y';

	Toolbox myToolbox=new Toolbox();

	public static void main(String[] args){
		ATM myATM = new ATM();
		System.out.println("Welcome to online ATM banking");
		System.out.println("How much do you want in your account?");
		myATM.go();
	}
							
	public void go(){
		int choice;
		balance=myToolbox.readIntegerFromCmd();
		while(balance<1){				//Checks that negative balance is not entered
			System.out.println("Negative Balance Not Allowed");
			System.out.println("Please re-enter your balance");
			balance=myToolbox.readIntegerFromCmd();
		}
		
		while(loop == 'y'){
			System.out.println("What do you want to do?");
			System.out.println("1 : Withdraw");
			System.out.println("2 : Deposite");
			System.out.println("3 : Inquire");
			System.out.println("4 : Quit");
			choice = myToolbox.readIntegerFromCmd();
			if (choice == 1)		//To Call Correct Function
				Withdraw();
			else if (choice == 2)
				Deposit();
			else if (choice == 3)
				Inquire();
			else if (choice == 4){
				loop='f';
				Quit();
			}
		}
	}
	//Function To Withdraw Money From The Account			    
	public void Withdraw(){
		int amount;
		System.out.println("*******Withdrawal*********");
		System.out.println("How much would you like to withdraw? ");
		amount = myToolbox.readIntegerFromCmd();
		if(balance>amount){			//Checks That balance Doesnt Become Negative
			balance=balance-amount;
			System.out.println("Amount has been Deducted from your balance");
			System.out.println("Your New Balance is: " + balance);
		} else	
			System.out.println("Insufficient Balance");
		
	}
	//Function To Deposite Money to the account				
	public void Deposit(){
		int amount;
		
		System.out.println("*******Deposit*********");
		System.out.println("How much would you like to Deposit? ");
		amount = myToolbox.readIntegerFromCmd();
		if(amount>0){				//Checks that the amount entered is not negative
			balance=balance+amount;
			System.out.println("Amount has been Added from your balance");
			System.out.println("Your New Balance is: " + balance);
		}
		else
			System.out.println("You Can not enter a negative Amount");
	}

	//Function To Print The Balance	
	public void Inquire(){
		
		System.out.println("*******Your New Balance is: " + balance + "********");
		
	}
	//Function to Quit
	public void Quit(){
		System.out.println("****************GoodBye!*****************");
		System.exit(0);
	}	
}	