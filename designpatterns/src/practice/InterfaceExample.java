package practice;



//You expect that unrelated classes would implement your interface. For example, the interfaces Comparable and Cloneable are implemented by many unrelated classes.
//You want to specify the behavior of a particular data type, but not concerned about who implements its behavior.
//You want to take advantage of multiple inheritances.
public interface InterfaceExample {
  int x=5;
  //private String s = "String"; not possible 
 static void method1(){
	 System.out.println("static");
 }
 default void method2(){
	 System.out.println("default");
 }
 void method3();
}
