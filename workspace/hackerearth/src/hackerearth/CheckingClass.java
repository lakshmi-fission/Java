package hackerearth;

import java.util.HashMap;
import java.util.Set;

public class CheckingClass {
	public static void main(String args[]){
		HashMap<Model,String> hashMap = new HashMap<>();
		hashMap.put(new Model("1234","5678"),"item1");
		hashMap.put(new Model("abc","def"),"item2");
		hashMap.put(new Model("xyz","kml"),"item3");
		hashMap.put(new Model("wer",""), "item4");
		hashMap.put(new Model("qwr","1234"),"item5");
		Set<Model> set = hashMap.keySet();
		for(Model model:set){
			if(model.getSerialNumber() != null && model .getSerialNumber().equals("1234")){
				System.out.println(model.getSerialNumber());
			}
			else if(model.getCode().equals("wer")){
				System.out.println(model.getCode());
			}
		}
		
	}
}
