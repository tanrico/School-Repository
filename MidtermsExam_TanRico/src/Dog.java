
public class Dog {
	
	//Declarations of Variables
	String name, breed;

	//Function
	public void display() {
		System.out.print("\nDog Name: " + name
				+ "\nDog Breed: " + breed);
	}
	
	//Constructor
	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
}
