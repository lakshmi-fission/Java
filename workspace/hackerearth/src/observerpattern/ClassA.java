package observerpattern;

import java.util.ArrayList;

public class ClassA implements SubjectInterface{
    
	private float interest;
	private String type,bank;
	ArrayList<ObserverInterface> observers = new ArrayList<>();
	
	/*public ClassA(float interest,String type,String bank){
		this.interest = interest;
		this.type = type;
		this.bank = bank;
	}*/
	@Override
	public void updateObserver() {
		for(ObserverInterface ob :observers){
			ob.update(this.interest);
			
		}
		
	}

	@Override
	public void removeObserver(ObserverInterface observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addObserver(ObserverInterface observer) {
		observers.add(observer);
		
	}
 public void setInterest(float interest){
	this.interest = interest;
	System.out.println("interest"+interest);
	updateObserver();
}

}
