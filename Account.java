import java.util.Scanner;
class Account
{
	private String accountNumber;
	private String accountHolderName;
	private String accountType;
	private double balance;

	public String getAccountNumber()
	{
		return accountNumber;
	}

	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	
	
	public String getAccountType()
	{
		return accountType;
	}
	
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setAccountNumber( String accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
	}
	
	public void setAccountType(String accountType)
	{
		this.accountType=accountType;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public Account(String accountNumber,String accountHolderName,String accountType,double balance)
	{
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.accountType=accountType;
		this.balance=balance;
	}
	public  String toString()
	{
		return accountNumber+","+accountHolderName+","+accountType+","+balance;
	}
	
	public void deposit(double amount)
	{
		balance=balance+amount;
	}
	
	public boolean withdraw(double amount)
	{
		if(amount<=balance)
		{
			balance=balance-amount;
			   return true;
		}else
		{
			
			   return false;
		}
	}
	
	public static void main(String[] args)
	{
		Account obj=null;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Account Number");
		String number=scan.nextLine();
		
		System.out.println("Enter Account Holder Name");
		String name=scan.nextLine();
		
		System.out.println("Enter Account Type");
		String type=scan.nextLine();
		
		System.out.println("Enter Initial Balance");
		double balance=scan.nextDouble();
		
		if(balance<0)
		{
			System.out.println("Invalid initail Balance");
			return;
		}
		
		obj=new Account(number,name,type,balance);
		
		
		System.out.println("Enter Deposit Amount");
		double depositAmount=scan.nextDouble();
		
		obj.deposit(depositAmount);

		System.out.println("Enter Withdraw Amount");
		double withdrawAmount=scan.nextDouble();
		
		
		boolean isWithdrawSuccess = obj.withdraw(withdrawAmount);			
		if(!isWithdrawSuccess)
		{
			System.out.println("Insuffient Balance");
		}
		
		System.out.printf("Finalnt Balance %.2f ",obj.getBalance());
		
	}
}
