package customdesigndecorative;

public class Decorative implements Shape{
	
	
	///// we can use abstract class also in place of interface here but abstract class is more preferable
	Shape shapeObject;
	public Decorative(Shape shapeObject){
		this.shapeObject = shapeObject;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		shapeObject.draw();
		setColor();
	}
	
	private void setColor(){
		System.out.println("colorsetted");
	}

}
