package observerpattern;

public class ClassB implements ObserverInterface {
public static void main(String args[]){
	ClassA a = new ClassA();
	a.addObserver(new ClassB());
	a.setInterest((float) 12.34);
	
	
}
@Override
public void update(float interest) {
	System.out.println("updatedInterest:"+interest);
}

}
