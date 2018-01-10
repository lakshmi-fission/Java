package observerpattern;

//publishers calls notifier and subscribers calls observer 
//The observers have subscribed to (registered with )the Subject to receive updates when the subjects data changes
public interface Observer {
	void update(float humidity,float temp, double pressure);
}
