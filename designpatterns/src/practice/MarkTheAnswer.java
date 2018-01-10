package practice;

public class MarkTheAnswer {
public static void main(String args[]){
	int a[] = {4,3,7,6,7,2,2};
	int c=0,r=0;
for(int i=0;i<a.length;i++){
	c=c+1;
	System.out.println(c);
	if(a[i]>6){
		c=c-1;
		r=r+1;
	}
	if(r==2){
		System.out.println(c);
		break;
	}
}
}
}
