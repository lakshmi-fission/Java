package hackerearth;

public class Practice1 {
	public static void main(String args[]){
		Single single = new Single();
		Single single1 = new Single();
		System.out.print(single);
		System.out.print(single1);
	}}
class Single{
	static Single singleObject = new Single();
	public static Single getInstance(){
		if(singleObject==null){
			return new Single();
		}
		return singleObject;
	}
}

