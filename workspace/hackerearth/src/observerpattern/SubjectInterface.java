package observerpattern;

public interface SubjectInterface {

	
	void updateObserver();
	void removeObserver(ObserverInterface observer);
	void addObserver(ObserverInterface observer);
}
