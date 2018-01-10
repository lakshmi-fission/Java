package hackerearth;

public class Thread2 implements Runnable{
	public void run()
	{
		doSomeWork();
	}
	
	public void doSomeWork()
	{
		for(int i=1;i<=100;i++)
		{
		Thread currentThread = Thread.currentThread();
		String currentThreadName = currentThread.getName();
		if(i%2 !=0){
		System.out.println(currentThreadName +" -> i : " +i);
		}
		try{
			
		Thread.sleep(3000);
		
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		}
	}
}
