package co.edureka.threads;

public class Lifecycle {
 public static void main(String[] args)throws Exception
 {
	 Thread t = Thread.currentThread();
	 for(int i=1;i<=10;i++)
	 {
		 System.out.println(Thread.currentThread().getName()+" - "+i);
		 Thread.sleep(1500);
		 if(i==5)
			 t.stop();
	 }
 }
}
