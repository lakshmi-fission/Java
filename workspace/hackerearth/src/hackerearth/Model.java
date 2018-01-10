package hackerearth;

public class Model {
	String code;
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	String serialNumber;
	
	public Model(String code,String serialNumber){
		this.code = code;
		this.serialNumber = serialNumber;
	}
	
}
