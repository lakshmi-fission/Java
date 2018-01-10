package oopsconcepts;

public class Rectangle implements Shape{

	double width = 10;
	double height  =20;
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

}
