package observerpattern;

public class ObserverPatternDemo {
public static void main(String args[]){
	Weatherdata weather = new Weatherdata();
	Cat cat  = new Cat(weather);
	Dog dog = new Dog(weather);
	weather.setMeasurements(12, 45, 56);
	weather.setMeasurements(67, 23, 64);
}
}
