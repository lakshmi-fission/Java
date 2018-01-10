package dynamicbehaviour;

public abstract class Duck {
FlyBehaviour flybehaviour;
QuackBehaviour quackbehaviour;

public void swim(){
	System.out.println("swim behaviour");
}
abstract void display();
public void setFlyBehaviour(FlyBehaviour fb){
	this.flybehaviour = fb;
}	
public void setQuackBehaviour(QuackBehaviour qb){
	this.quackbehaviour = qb;
}
public void performQuack(){
	quackbehaviour.quack();
}
public void performFly(){
	flybehaviour.fly();
}
}
