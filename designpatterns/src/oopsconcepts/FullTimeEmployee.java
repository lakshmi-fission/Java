package oopsconcepts;


//You create an interface called Server which has the start() and stop() method. 
//This is called abstraction of Server because every server should have a way to start and stop and details may differ.
//when you know something needs to be there but not sure how exactly it should look like. e.g. when I am creating a class called Vehicle, 
//I know there should be methods like start() and stop() but don't know how that start and stop method should work
//because every vehicle can have different start and stop mechanism e..g some can be started by kicking or some can be by pressing buttons .
public class FullTimeEmployee extends Employee{
		int value;
      public FullTimeEmployee(int value){
    	  this.value = value;
      }

@Override
public int method1() {
	// TODO Auto-generated method stub
	return value;
}
}
