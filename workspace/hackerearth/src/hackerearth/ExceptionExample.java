package hackerearth;

public class ExceptionExample {
public static void main(String args[]){
	int i;
	try{
		 i = 4/0;
	}
	finally{
		System.out.println("exception");
	}
}
}
