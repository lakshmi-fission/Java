package designpatternfirstprinciple;


//The strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
public abstract class Duck {
FlyBehaviour flybehaviour;
QuackBehaviour quackbehaviour;
public void performQuack(){
	quackbehaviour.quack();
}
public void performFly(){
	flybehaviour.fly();
}
public void swim(){
	System.out.println("swim behaviour");
}
abstract void display();
	

}
