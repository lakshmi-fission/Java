package oopsconcepts;
//List does implement Collection, but Collection does not implement List. 
//So while a List IS A Collection, a Collection IS NOT necessarily a List

public class LiskovSubstitution {
public static void main(String[] args){
	Shape shape = new Circle();
	System.out.println(shape.getArea());
}
}
