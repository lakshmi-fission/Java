package hackerearth;

public class SuperDemo extends SuperExample {
	SuperDemo(){
		super();
		}
	public void run(){
		System.out.println("running child");
	}
	public static void main(String args[]){
		
		SuperDemo superdemo = new SuperDemo();
		 superdemo.run();
	}
	
}
class SuperExample{

	public void run(){
		System.out.println("running super");
	}
	
}
