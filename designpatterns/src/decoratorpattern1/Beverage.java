package decoratorpattern1;

public abstract class Beverage {
String description  = "unknown description";
public abstract double cost();
public String getDescription(){
	return description;
}

}
