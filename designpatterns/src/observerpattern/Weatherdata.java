package observerpattern;

import java.util.ArrayList;

public class Weatherdata implements Subject {

	private float temperature,pressure,humidity;
	ArrayList<Observer> observers;
	
	public Weatherdata(){
		observers = new ArrayList<>();
	}
	@Override
	public void changeOcurred() {
		for(Observer item :observers){
			item.update(humidity, temperature, pressure);
		}
		
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		int index = observers.indexOf(observer);
		if(index>=0)
		{
		observers.remove(observer);
		}
		
	}
public void setMeasurements(float humidity,float temperature,double pressure){
	this.temperature = temperature;
	this.pressure = (float) pressure;
	this.humidity = humidity;
	changeOcurred();
}

}
