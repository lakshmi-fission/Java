package hackerearth;

public class ReturnExample {
	public static void main(String args[]){
		String s= "lakshmi";
		String s1 = "lakshmi";
		if(s.equalsIgnoreCase(s1)){
			System.out.println("equal");
			return;
		}
		else{
			for(int i=0;i<=2;i++){
				System.out.println(i);
			}
		}
		System.out.println("out");
		
	}
		
}
