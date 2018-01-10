package observerpattern;


//publishers calls notifier and subscribers calls observer 
public interface Subject {
void changeOcurred();
void registerObserver(Observer observer);
void removeObserver(Observer observer);
}
