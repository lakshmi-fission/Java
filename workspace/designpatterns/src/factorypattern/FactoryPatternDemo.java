package factorypattern;

public class FactoryPatternDemo {
public static void main(String args[]){
	ShapeFactory shapefactory = new ShapeFactory();
	shapefactory.getShape("circle").draw();
	shapefactory.getShape("rectangle").draw();
	shapefactory.getShape("line").draw();
}
}
