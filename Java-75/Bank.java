interface Bank
{
  int n=10; //public static final
  void deposit(float amt);
  void withdraw(float amt);
  /* from java 8*/
  default void gstRules(){
	  System.out.println("GST Rules:");
  }
}

