package practice;

import java.util.ArrayList;

public class Work3 implements Runnable{
	
	ArrayList<Employee> info ;
	public Work3(ArrayList<Employee> info){
		this.info = info;
	}
	@Override
	public void run() {
		
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new StoringData().storeData("ThirdCase.txt", info);
		
}

}
