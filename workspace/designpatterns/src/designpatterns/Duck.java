package designpatterns;

public abstract class Duck {
	FlyBehavior flybehavior;
	QuackBehavior quackbehavior;
	public Duck(){
		/*quackbehavior = new Quack();
		flybehavior = new FlyWithWings();*/
		
	}
	public abstract void display();
	public void performFly(){
		flybehavior.fly();
	}
	public void performQuack(){
		quackbehavior.quack();
	}
	public void swim(){
		System.out.println("all ducks can float");
	}
	public void setFlyBehavior(FlyBehavior fb){
		flybehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb){
		quackbehavior = qb;
	}
}
