package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Work1 implements Runnable{
	
	ArrayList<Employee> info;
	int experience,firstName,lastName;

	public Work1(ArrayList<Employee> info){
		this.info = info;
		Collections.sort(info,new FirstSorting());
	}

	@Override
	public void run() {
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new StoringData().storeData("FirstCase.txt", info);
		
	}

private class FirstSorting implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		int organization = o1.organization.compareTo(o2.organization);
		experience = o1.experience.compareTo(o2.experience);
		firstName = o1.firstName.compareTo(o2.firstName);
		lastName = o1.lastName.compareTo(o2.lastName);
		
		return organization == 0 ? secondCondition() : organization;
	}
	
	private int secondCondition(){
		if(experience == 0){
			return (firstName == 0 ?  lastName : firstName);
		}
		else{
			 return experience;
		}
	}
}
}
