package designpatterns;

public class MallardDuck extends Duck{
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
 public void display(){
	System.out.println("mallard");
}
}
