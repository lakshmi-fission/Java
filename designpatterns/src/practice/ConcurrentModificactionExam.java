package practice;

import java.util.ArrayList;

public class ConcurrentModificactionExam {
public static void main(String[] args){
	ArrayList<Integer> array = new ArrayList<Integer>();
	array.add(2);
	array.add(3);
	array.add(4);
	array.add(2);
	array.add(6);
	array.add(2);
	/*for(Integer item: array){
		if(item.equals(2)){
			array.remove(item);
		}
		System.out.println(item);
	}*/
	for(int i=array.size()-1;i>=0;i--){
		if(array.get(i)==2){
			array.remove(i);
		}
		System.out.println(array.get(i));
	}
}
}
