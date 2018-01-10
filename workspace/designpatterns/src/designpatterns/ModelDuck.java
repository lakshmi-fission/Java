package designpatterns;

public class ModelDuck extends Duck{
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
public void display(){
	System.out.println("modelDuck");
}
}
