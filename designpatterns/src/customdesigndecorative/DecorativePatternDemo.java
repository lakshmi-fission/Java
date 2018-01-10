package customdesigndecorative;

public class DecorativePatternDemo {
	
	
public static void main(String args[]){
	Circle circle = new Circle();
	circle.draw();
	Decorative decorative = new Decorative(new Circle());
	decorative.draw();
}
}
