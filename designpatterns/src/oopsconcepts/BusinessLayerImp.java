package oopsconcepts;

public class BusinessLayerImp implements IBusinessLayer{
	
	IDataLayer client;
	
	public BusinessLayerImp(IDataLayer client){
		this.client = client;
		client.setData();
	}

	@Override
	public String simplyfyData() {
		// TODO Auto-generated method stub
		return "sjdjdsif"+client.getData();
	}

}
