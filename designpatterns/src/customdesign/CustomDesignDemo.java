package customdesign;

public class CustomDesignDemo {
	
	public static void main(String args[]){
		HorizontalScaleView horizontal = new HorizontalScaleView();
		horizontal.setInitMaxMinValues("", "");
		CustomScaleDecorator customHorizontal = new CustomScaleDecorator(new HorizontalScaleView());
		customHorizontal.setInitMaxMinValues("", "");
		customHorizontal.draw();
		customHorizontal.getResult();
		VerticalScaleView vertical = new VerticalScaleView();
		vertical.setInitMaxMinValues("", "");
	
	}

}
