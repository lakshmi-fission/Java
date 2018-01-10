package hackerearth;

import java.util.HashMap;
import java.util.Map;

public class CountingDigits {
	public static void main(String args[]){
		String a="7751";
		HashMap<Character,Integer> hashMap = new HashMap<>();
		for(int i=0;i<a.length();i++){
			if(hashMap.containsKey(a.charAt(i))){
				hashMap.put(a.charAt(i), hashMap.get(a.charAt(i))+1);
			}
			else{
				hashMap.put(a.charAt(i), 1);
			}
		}
		for(Map.Entry<Character,Integer> entryset : hashMap.entrySet()){
			System.out.print(entryset.getKey()+":");
			System.out.println(entryset.getValue());
			
		}
	}

}
