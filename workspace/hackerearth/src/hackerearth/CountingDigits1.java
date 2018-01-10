package hackerearth;

import java.util.HashMap;
import java.util.Map;

public class CountingDigits1 {
	public static void main(String args[]){
		String s="17752";
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<=9;i++){
			for(int j=0;j<s.length();j++){
			if(i==s.charAt(j)){
				if(map.containsKey(i)){
				map.put(Integer.parseInt(s.charAt(j)+""), map.get(s.charAt(j))+1);
			
				}
				else{
					map.put(Integer.parseInt(s.charAt(j)+""), 1);
			
				}
			}
			}
			
			map.put(i, 0);}
			
		
		for(Map.Entry<Integer, Integer> entry :map.entrySet()){
			System.out.print(entry.getKey()+":");
			System.out.println(entry.getValue());
		}
		}
	}
