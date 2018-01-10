package practice;

public interface InterfaceExample2 {
void method3();
default void method2(){
	 System.out.println("default2");
}
static boolean method1(String str){
 return true;
}
}
