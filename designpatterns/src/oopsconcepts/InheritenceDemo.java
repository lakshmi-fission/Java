package oopsconcepts;




//When you have a multiple inheritance with two classes which have methods in conflicts, how do you handle this ?
public class InheritenceDemo {
public static void main(String[] arg){
	ClassA a = new ClassA();
	a.methodA();
	a.common();
	ClassA b = new ClassB();
	b.methodA();
	b.common();
	//compilation error ClassB ba = new ClassA();
	//calss A don't know about the methods of class b;
	
	
}
}
