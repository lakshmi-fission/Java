package practice;

public class SwitchExmp  implements InterfaceExample2, InterfaceExample{
public static void main(String args[]){
	String WOMAN = "Woman";
	System.out.println("lower"+WOMAN.toLowerCase());
	System.out.println(InterfaceExample.x);
	InterfaceExample.method1();
	SwitchExmp exmp = new SwitchExmp();
	exmp.method2();
	System.out.println(exmp.method1("abc"));
	
}

@Override
public void method3() {
	// TODO Auto-generated method stub
	
}

@Override
public void method2() {
	// TODO Auto-generated method stub
	InterfaceExample.super.method2();
}
boolean method1(String str){
	return false;
}
}
