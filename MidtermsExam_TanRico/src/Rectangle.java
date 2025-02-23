
public class Rectangle {
	//Declaration of Variables
	double width, height;

	//Functions
	public double perimeter(double width, double height) {
		return (width*2) + (height*2);
	}
	
	public double area(double width, double height) {
		return width*height;
	}
	
	
	//Constructor
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	//Getters and Setters
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
