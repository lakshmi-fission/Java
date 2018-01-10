package classcommunication;

public class ClassA implements MediumInterface {

	String name;
	
public ClassA(String name){
	 this.name = name;
}
	@Override
	public String getName() {
		return name;
	}

}
