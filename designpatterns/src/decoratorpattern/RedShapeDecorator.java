package decoratorpattern;

public class RedShapeDecorator extends ShapeDecorator {
  
	public RedShapeDecorator(Shape shapedecorator) {
		super(shapedecorator);
	}
public void draw(){
	shapedecorator.draw();
	setColor();
}
public void setColor(){
	System.out.println("red color");
}
}
