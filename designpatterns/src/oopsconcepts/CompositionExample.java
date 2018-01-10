package oopsconcepts;

import java.util.ArrayList;
import java.util.List;

//where we can use inheritance and where we can use composition

//One common drawback of using composition instead of inheritance is that methods being provided by individual 
//components may have to be implemented in the derived type, even if they are only forwarding methods. 
//In contrast, inheritance does not require all of the base class's methods to be re-implemented within the derived class. 
//Rather, the derived class only needs to implement (override) the methods having different behavior than the base class methods. 
//This can require significantly less programming effort if the base class contains many methods providing default behavior and only a few of them need to be overridden within the derived class.
//Composition is dynamic binding (run-time binding) while Inheritance is static binding (co

public class CompositionExample {
public static void main(String[] args){
	Book book1 = new Book("harryporter" ,"Don't know");
	Book book2 = new Book("wd","dewfew");
	List<Book> list = new ArrayList<Book>();
	list.add(book1);
	list.add(book2);
	Library library = new Library(list);
	for(Book book:library.getBooks() ){
		System.out.println(book.title);
		book.method1();
	}
	
}
}
