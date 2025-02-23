
public class Rectangle {
	//Declaration of Variables
	double length, height;

	//Functions
	public double perimeter(double length, double height) {
		return (length*2) + (height*2);
	}
	
	public double area(double length, double height) {
		return length*height;
	}
	
	
	//Constructor
	public Rectangle(double length, double height) {
		super();
		this.length = length;
		this.height = height;
	}

	//Getters and Setters
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
