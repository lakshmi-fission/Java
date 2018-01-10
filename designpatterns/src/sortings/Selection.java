package sortings;

public class Selection {
public static void main(String[] args){
	int[] a = {0,9,1,6,7,8,4};
	int n = a.length;
	int temp;
	for(int i=n-1;i>0;i--){
		int max=0;
		for(int j=1 ;j<=i;j++){
			if(a[j]>a[max]){
				max = j;
			}
			temp = a[max];
			a[max] = a[i];
			a[i] = temp;
		}
		}
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]);
	}
}
}
