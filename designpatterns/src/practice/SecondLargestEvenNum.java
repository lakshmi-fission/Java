package practice;


public class SecondLargestEvenNum {
	public static void main(String[] args){
	int[] a  = {78,92,44,63,71,97};
		int high = 0,secondHigh=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
			if(a[i]>high){
				secondHigh = high;
				high = a[i];	
			}
			else if(a[i]>secondHigh){
				secondHigh = a[i];
			}
		}
	}
	System.out.println("second largest even number=="+secondHigh);
	}
}