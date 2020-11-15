import java.util.Scanner;
class BankTest 
{
	public static void main(String[] args) 
	{
		Bank bank = null;

		Scanner sc = new Scanner(System.in);
		System.out.print("Which Bank? [1.SBI | 2.ICICI]: ");
		int opt = sc.nextInt();

		switch(opt){
			case 1:
				 bank = new SBI(); 
				 break;
			case 2:
				 bank = new ICICI();
				 break;
			default:
				 System.out.println("Invalid Option...");
				 return;
		}//switch

		bank.deposit(1000);
		bank.withdraw(250);
		bank.gstRules();

		System.out.println(Bank.n);
		System.out.println(SBI.n);
		System.out.println(ICICI.n);
		System.out.println(bank.n);

		//bank.n = 20;//error
	}
}
