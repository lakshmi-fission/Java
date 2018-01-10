package oopsconcepts;

import java.util.ArrayList;

public class OpenClosedPrinciple {
public static void main(String[] args){
	AreaManager manager = new AreaManager();
	ArrayList<Shape> shapes = new ArrayList<>();
	shapes.add(new Circle());
	shapes.add(new Rectangle());
	shapes.add(new Trangle());
	System.out.println(manager.calculateArea(shapes));
}
}
