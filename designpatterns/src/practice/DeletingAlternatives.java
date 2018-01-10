package practice;

public class DeletingAlternatives {
public static void main(String[] args){
	String s = "BBBBB";
	int c=0;
	for(int i=1;i<s.length();i++){
		if((s.charAt(i-1)==s.charAt(i))){
			c++;
		}
	}
	System.out.println(c);
	//Because java uses the concept of string literal.
	//Suppose there are 5 reference variables,all referes to one object "sachin".
	//If one reference variable changes the value of the object, it will be affected to all the reference variables. 
	//That is why string objects are immutable in java
	//StringBuffer is similar to StringBuilder except one difference that StringBuffer is thread safe, i.e., 
	//multiple threads can use it without any issue. The thread safety brings a penalty of performance.
	String s1 = new String("welcome");
	System.out.println(new String("welcome"));
	String l = "cnsssk";
	String l1 = l.concat(l);
}

}
