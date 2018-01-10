package sortings;

public class MergeSort {
	public static void main(String[] args){
		int[] array = {12, 11, 13, 5, 6, 7};
		MergeSort sort = new MergeSort();
		sort.sort(array,0,array.length-1);
		printArray(array);
	}
public void  sort(int[] array, int p,int q ){
	if(p<q){
		int m = (p+q)/2;
		sort(array,p,m);
		sort(array,m+1,q);
		merge(array,p,m,q);
	}
}
public void merge(int[] array, int p, int m, int q){
	int n1 = m-p+1;
	int n2 = q-m;
	System.out.println("n1========="+n1);
	System.out.println("n2========="+n2);
	int[] left = new int[n1];
	int[] right = new int[n2];
	for(int i=0;i<n1;++i){
		left[i] = array[p+i] ;
	}
	for(int j=0;j<n2;++j){
		right[j] = array[m+1+j];
	}
	int k=1;
	int a=0,b=0;
	while(a<n1 && b<n2){
		if(left[a]<=right[b]){
			array[k] = left[a];
			a++;
		}
		else{
			array[k] = right[b];
			b++;
			
		}
  	k++;
	}
	
	while(a < n1){
		array[k] = left[a];
		a++;
		k++;
	}
	while(b < n2){
		array[k] = right[b];
		b++;
		k++;
	}
}
static void printArray(int arr[])
{
    int n = arr.length;
    for (int i=0; i<n; ++i)
        System.out.print(arr[i] + " ");
    System.out.println();
}
}
