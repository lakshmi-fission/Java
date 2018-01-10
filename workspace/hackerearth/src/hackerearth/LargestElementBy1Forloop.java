package hackerearth;

public class LargestElementBy1Forloop {
	public static void main(String args[]){
		int a[] = {72,10,11,17,30,4,42,22},high = a[0],secondHigh = a[0],j=0 ,k=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>high){
				secondHigh = high;
				high = a[i];
				j=i;
			}
			else if (a[i]>secondHigh){
				secondHigh = a[i];
				k=i;
			}
		}
		System.out.println("Highest Element:"+high +"-"+ j);
		System.out.println("Second Highest Element:"+secondHigh +"-"+k);
	}
}
