package hackerearth;

public class MaximumIndex {
public static void main(String args[]){
	int a[] = {52,42,11,72,30,4,10,22};
	int j=0,size;
	System.out.println("length:"+a.length);
	size = a.length;
	int high  = a[0];
	for(int i=1;i<a.length;i++){
		if(high<a[i]){
			high = a[i];
			j=i;
		}
		}
	System.out.println("Highest elemnt:"+high+"index:"+j);
	int secondHighest = a[size-1];
	int l=0;
	for(int k=0;k<a.length;k++){
		if(secondHighest<a[k] && k != j){
			secondHighest = a[k];
			l=k;
		}
	}
	System.out.println("second Highest elemnt:"+secondHighest+"index:"+l);
}
}
