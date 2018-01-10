package practice;

public class ExceptionExample {
	public static void main(String[] args){
		System.out.println(something());
	}
	private static int something(){
		try{
			int v = 12/0;
			return 23;
		}
		catch(Exception e){
			System.out.println("exception");
			return 8;
		}
		finally{
			System.out.println("finaly");	
		}
		}
}
