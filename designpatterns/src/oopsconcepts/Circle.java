package oopsconcepts;

public class Circle implements Shape {
	final double PI = 3.14;
	double radius = 4;
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}

}
