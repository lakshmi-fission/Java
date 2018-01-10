package observerpattern;

public class Cat implements Observer,DisplayElement{
	private float temperature,humidity,pressure;
	Subject weatherdata;
	public Cat(Subject weatherdata){
		weatherdata.registerObserver(this);
	}
	@Override
	public void update(float humidity, float temp, double pressure) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humidity  = humidity;
		this.pressure = (float)pressure;
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("humidity=="+humidity+","+"temperature=="+temperature+","+"pressure=="+pressure);
		
	}

}
