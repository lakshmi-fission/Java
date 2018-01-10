package dynamicbehaviour;

public class NewDuckClass extends Duck {
	
	NewDuckClass(){
		flybehaviour = new RocketFlyBehaviour();
	}
public static void main(String args[]){
	Duck  newDuck = new NewDuckClass();
	newDuck.swim();
	newDuck.performFly();
	newDuck.setQuackBehaviour(new Quack());
	newDuck.performQuack();
	newDuck.setFlyBehaviour(new NoFly());
	newDuck.performFly();
	
	
	
}

@Override
void display() {
	// TODO Auto-generated method stub
	System.out.println("new DuckClass display");
	
}
}
