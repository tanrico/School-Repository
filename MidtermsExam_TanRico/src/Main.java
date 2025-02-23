//code by Rico Nathaniel Tan
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Q1();
		Q2();
		Q3();
	}
	
	public static void Q1() {
		//Array list for person data types
		ArrayList<Person> people = new ArrayList<Person>();
		
		//Initializing the Persons
		Person p1 = new Person("Rico", "26 Oliva Street", 18);
		Person p2 = new Person("Cocoa", "27 Oliva Street", 17);
		Person p3 = new Person("Adele", "28 Oliva Street", 22);
		Person p4 = new Person("Nahida", "29 Oliva Street", 500);
		Person p5 = new Person("Sena", "30 Oliva Street", 31);
		
		//Adding the persons to the list
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		
		//Displaying persons
		println("\n\nQ1.)Write a Java program to create a class called \"Person\" with a name, age, and address attribute. "
				+ "\nCreate Five instances of the \"Person\" class, set their attributes using the constructor, "
				+ "\nand print their name and age. ", true);
		for(Person p : people) {
			println("====="
					+ "\nName: " + p.getName()
					+ "\nAddress: " + p.getAddress()
					+ "\nAge: " + p.getAge(), true);
		}
	}
	
	public static void Q2() {
        Dog dog1 = new Dog("Lucy", "Golden Retriever");
        Dog dog2 = new Dog("Fenrir", "German Shepherd");

        dog1.setName("Cerberus");
        dog2.setBreed("Siberian Husky");
        
        println("=====",true);
        println("\nQ2.) Write a Java program to create a class called \"Dog\" with a name and breed attribute. "
        		+ "\nCreate two instances of the \"Dog\" class, set their attributes using the constructor and "
        		+ "\nmodify the attributes using the setter methods and print the updated values.", true);
        dog1.display();
        dog2.display();
	}
	
	public static void Q3() {
		//Initializing rectangle object
		Rectangle r = new Rectangle(10, 5);
		
		//Displaying the length, height, perimeter, and area
		println("\n\nQ3.) Write a Java program to create a class called \"Rectangle\" with width and height attributes. "
				+ "\nCalculate the area and perimeter of the rectangle.", true);
		println("\nRectangle r:"
				+ "\n Length: " + r.getWidth()
				+ "\n Height: " + r.getHeight() 
				+ "\n Perimeter: " + r.perimeter(r.getWidth(), r.getHeight())
				+ "\n Area: " + r.area(r.getWidth(), r.getHeight()), true);
	}
	
	public static void println(String x, boolean y) {
		if(y) {
			System.out.println(x);
		} else {
			System.out.print(x);
		}
	}

}
