//final class A{
class A{
	final void display(){}
}

class B extends A{
	void display(){}
}

class FinalTest 
{
	//final FinalTest(){}//error: modifier final not allowed here

	final int n = 5; //instance variable
	public static void main(String[] args) 
	{
		final int n = 10; //local variable
		System.out.println(n); //10

		//n = 20; //error: cannot assign a value to final variable n
		System.out.println(n); 

		FinalTest obj = new FinalTest();
		System.out.println(obj.n);
		//obj.n = 5; //error: cannot assign a value to final variable n
		System.out.println(obj.n);
	}
}
