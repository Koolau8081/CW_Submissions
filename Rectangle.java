
public class Rectangle {
	
	
	//attributes
	private double width;
	private double length;
	

	//constructor 
	public Rectangle(int l, int w) {
		length = l;
		width = w;
	
	
	}
	//constructor 2
	public Rectangle(int s) {
		length = s;
		width = s;
	
	}

	//functions
	public static String getshape() {
		return "Rectangle";
	}
	
	
	public String getLengthAndWidth() {
		return length + ", " + width;
		
	}

	
	public double getArea() {
		double area = length*width;
		return area;
	}
	
	
	public double perimeter() {
		double perimeter = length + length + width + width;
		return perimeter;
	}
	
	

}
