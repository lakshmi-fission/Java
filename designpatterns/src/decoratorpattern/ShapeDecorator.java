package decoratorpattern;

public abstract class ShapeDecorator implements Shape{
      Shape  shapedecorator;
public ShapeDecorator(Shape shapedecorator){
	this.shapedecorator = shapedecorator ;
}
 public void draw(){
	shapedecorator.draw();
}
}
