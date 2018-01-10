package practice;

import java.util.ArrayList;
import java.util.List;

public class ClassB {
	
public static void main(String args[]){
	List<String> arrayList = new ArrayList<>();
	List<String> arrayList1 = new ArrayList<>();
	arrayList.add("s");
	arrayList.add("3");
	arrayList.add("r");
	arrayList.add("y");
	arrayList.add(arrayList.size(),"hdhd");
	arrayList.add(arrayList.size(),"dhcuiwdhicw");
	for(int i=0;i<arrayList.size();i++){
		if(arrayList.get(i).equals("r")){
			arrayList1.add(arrayList.get(i));
			arrayList.remove(arrayList.get(i));
		}
	}
	
	System.out.println("classA");
	System.out.println(arrayList.size());
	System.out.println("at size -1"+arrayList.get(arrayList.size()-1));
	for(String item:arrayList){
		System.out.println("item=="+item);
	}
}
}
