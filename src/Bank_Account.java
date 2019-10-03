import java.util.*;
public class Bank_Account {
	static Scanner user_input= new Scanner(System.in);
	static Scanner option= new Scanner(System.in);
	int Account_Number=123456789;
	int Account_Balance=50;
	String Account_Holder="Manny";
	String Account_email="Manny12@gmail.com";
	int phone=123654;
	int new_amount;
	int withdrawal_amount;
	public void Menu()
	{
		System.out.println("Welcome: "+Account_Holder);
		System.out.println("Press 1 for Account details \nPress 2 for Deposit \nPress 3 for Withdrawal \nPress 4 for exit");
		int choice=user_input.nextInt();
		switch(choice)
		{
			case 1: Account_details();
					break;
			case 2: deposit_funds();
					break;	
			case 3: withdraw_funds();
					break;
			case 4: System.out.println("Thank you and Goodbye");
					break;
		
			default:System.out.println("Invalid Option");
				break;
		
		}
	}
	public void Account_details()
	{
		System.out.println("Account holder name: "+Account_Holder);
		System.out.println("Account Number: "+Account_Number);
		System.out.println("Account Email: "+Account_email);
		System.out.println("Phone Number: "+phone);
		if(Account_Balance>new_amount)
		System.out.println("Current Balance: "+Account_Balance);
		else
		System.out.println("Current Balance: "+new_amount);	
		question();
	}
	public int deposit_funds()
	{	
		System.out.println("Would you like to deposit");
		System.out.println("Press 1 for Yes, 2 for No ");
		int choice=user_input.nextInt();
		switch(choice)
		{
		 case 1: if(Account_Balance==50)
		 		{
			 		
			 		System.out.println("Enter the amount to be deposited");
			 		new_amount=user_input.nextInt();
			 		Account_Balance=new_amount+Account_Balance;
			 		System.out.println("Your new account balance: "+Account_Balance);
		 		}
		 case 2: break;
		 
		}
		
		question();
		return 0;
	}
	public int withdraw_funds()
	{
		System.out.println("Would to like to make a withdraw");
		System.out.println("Press 1 for Yes, 2 for No");
		int choice= user_input.nextInt();
		switch(choice)
		{
		case 1: System.out.println("Please enter the withdrawal amount");
				withdrawal_amount=user_input.nextInt();
				
				if(Account_Balance>=withdrawal_amount)
				{
					System.out.println("Your previous account balance was "+Account_Balance);
					Account_Balance=Account_Balance-withdrawal_amount;
					System.out.println("Your new balance is "+Account_Balance);
				}
				else
				{
					System.out.println("Withdrawal Denied");
					System.out.println("Name: "+Account_Holder+" Current balance: "+Account_Balance);
				}
		case 2: break;
		}
		
		question();
		return 0;
	}
	public void question()
	{
		System.out.println("Would you like to proceed ?\n");
		System.out.println("To proceed enter 9");
		System.out.println("If you wish to quit press 0");
		switch(option.nextInt())
		{
		case 0: System.out.println("Thank you and Goodbye");
				break;
		case 9: System.out.println("Please Proceed");
				Menu();
				break;
		}
	}
	
}
