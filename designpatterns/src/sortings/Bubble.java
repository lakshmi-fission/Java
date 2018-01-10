package sortings;

public class Bubble {
public static void main(String[]args){
	int[] a  = {1,4,0,3,9,6,2};
	int n = a.length,temp;
	for(int i=1;i<n;i++){  
		for(int j=1;j<n;j++){ // for(int j=1; j<n-i;j++) effieint one 
			if(a[j-1]>a[j]){
				temp = a[j];
				a[j] = a[j-1];
				a[j-1]=temp;
			}
		}
	}
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]);
	}
}

// for bubble sort by using flag we can reduced the time complexity(for bestcase O(n), Avg O(n2),worst omega(n2))
}
//int flag=1;
//forfirst forloop for(int k=1;k<n & flag;k++){
//flag=0;
//if(){
//flag=1;
//}
//}