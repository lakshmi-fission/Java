package practice;

public class EnumExample extends AbstractExample{
	enum Subjects{
		java,alarm,fofkorfk,_fml3e6fe_lf,maths,mk
	}
	public static void main(String[] args){
		Subjects sub = Subjects.java;
		System.out.println(sub);
		 Subjects[] values = Subjects.values();
		 System.out.println(values);
		 EnumExample e = new EnumExample();
		 System.out.println(e.x);
		 int z = e.y = 7;
		 System.out.println(e.y);
	}
	
/*int fibo(int n){
	if(n==0)return0
	else if (n==1)return 1
	else fibo(n-1)+fibo(n-2)
}*/
}
