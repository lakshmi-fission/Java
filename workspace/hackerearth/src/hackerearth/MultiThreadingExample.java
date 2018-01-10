package hackerearth;

public class MultiThreadingExample {
	
	public static void main(String[] args) throws Exception
	{
		System.out.println("main thread started...");
		
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		t1.start();
		t2.start();
				
		System.out.println("main thread stopped...");
	}
	
   /*  class Thread1 extends Thread
	{
		public void run()
		{
			doSomeWork();
		}
		
		public void doSomeWork()
		{
			for(int i=1;i<=5;i++)
			{
			Thread currentThread = Thread.currentThread();
			String currentThreadName = currentThread.getName();
			System.out.println(currentThreadName +" -> i : " + i);
			try{
			currentThread.sleep(3000);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			}
		}
	}*/

	/*class Thread2 extends Thread
	{
		public void run()
		{
			doSomeWork();
		}
		
		public void doSomeWork()
		{
			for(int i=65;i<=70;i++)
			{
			Thread currentThread = Thread.currentThread();
			String currentThreadName = currentThread.getName();
			System.out.println(currentThreadName +" -> i : " + (char)i);
			try{
			currentThread.sleep(3000);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			}
		}
	}*/
		
}
