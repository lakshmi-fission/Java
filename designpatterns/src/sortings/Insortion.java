package sortings;

public class Insortion {
public static void main(String[] args){
	int a[] = {0,9,1,6,7,8,4};
	int n = a.length;
	int temp,j;
	for(int i=1;i<n;i++){
		temp = a[i];j=i;
		while((j>0) && (a[j-1]>temp)){
			a[j] = a[j-1];
			j--;
		}
		a[j] = temp;
	}
	
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]);
	}
}
}
