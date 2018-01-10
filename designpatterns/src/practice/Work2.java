package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Work2 implements Runnable{

	ArrayList<Employee> info;
	public Work2(ArrayList<Employee> info){
		this.info = info;
		Collections.sort(info,new SecondSorting());
	}
	@Override
	public void run() {
		
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new StoringData().storeData("SecondCase.txt", info);
		
	}
	private class SecondSorting implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			Float ratio1 = (float) (o1.experience/(o1.age*12));
			Float ratio2 = (float) (o2.experience/(o2.age*12));
			int ratio = ratio1.compareTo(ratio2);
			int organization = o1.organization.compareTo(o2.organization);
			return ratio == 0 ? organization : ratio;
		}
		
	}

}
