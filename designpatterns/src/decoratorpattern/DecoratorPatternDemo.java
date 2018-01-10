package decoratorpattern;

public class DecoratorPatternDemo {
public static void main(String args[]){
	Circle circle = new Circle();
	circle.draw();
	RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
	redCircle.draw();
	RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangular());
	redRectangle.draw();
	
}
}
