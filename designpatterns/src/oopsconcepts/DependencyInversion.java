package oopsconcepts;

public class DependencyInversion {
public static void main(String[] args){
	IBusinessLayer businessLayer = new BusinessLayerImp(new DataLayerImp());
	System.out.println(businessLayer.simplyfyData());
}
}
