package factorypattern;

public class ShapeFactory {
	
	public Shape getShape(String shape){
		if(shape ==  null){
			return null;
		}
		else if(shape.equals("circle")){
			return new Circle();
		} 
		else if (shape.equals("rectangle")){
			return new Rectangle();
		}
		else if (shape.equals("line")){
			return new Line();
		}
		return null;
	}

}
