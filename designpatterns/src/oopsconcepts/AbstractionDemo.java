package oopsconcepts;

public class AbstractionDemo {
	public static void main(String[] args){
		Employee em = new FullTimeEmployee(8*20);
		Employee pr = new PartTimeEmployee(20);
		System.out.println(em.method1());
		System.out.println(pr.method1());
	}

}
