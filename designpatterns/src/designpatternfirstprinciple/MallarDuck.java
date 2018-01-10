package designpatternfirstprinciple;

public  class MallarDuck extends Duck{
	
	MallarDuck(){
		quackbehaviour = new Squecking();
		flybehaviour = new FlyWithWings();
	}
	void display(){
		System.out.println("mallarDuck displayed");
	}
public static void main(String args[]){
 Duck mallarDuck = new MallarDuck();
 mallarDuck.swim();
 mallarDuck.display();
 mallarDuck.performFly();
 mallarDuck.performQuack();
 
}
}
