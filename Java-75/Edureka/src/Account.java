public class Account {
 /*---- instance variables ----*/	
 long acno;
 String name;
 float bal;
 
 /*--- constructor ---*/
 public Account(long acno, String name, float bal) 
 {	
	this.acno = acno;
	this.name = name;
	this.bal = bal;
 }
 
 /*--- deposit method ----*/
 void deposit(float amt) {
	this.bal += amt;
	System.out.println("Rs."+amt+" Credited | Balance: "+this.bal);
 }
 
 /*---- withdraw wmethod ----*/
 void withdraw(float amt) {
	 if(amt <= this.bal) {
		 this.bal = this.bal - amt;
		 System.out.println("Rs."+amt+" Debited | Balance: "+ this.bal);
	 }
	 else{
		System.out.println("ERROR: INSUFFICIENT BALANCE"); 
	 }
 }
 
 /*---- details method ----- */
 void getDetails() {
	 System.out.println("A/C No: "+this.acno+" | NAME: "+this.name+" | BALANCE: "+this.bal);
 }
}
