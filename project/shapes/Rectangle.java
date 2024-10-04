
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
	
	
	/*
	 * This method prints the shape name
	 */
	public static String getShape() {
		return "Rectangle";
	}
	
	
	/*
	 * This method gets the length and width
	 */
	public String getLengthAndWidth() {
		return length + ", " + width;	
	}

	
	/*
	 * This method gets the Area
	 */
	public double getArea() {
		double area = length*width;
		return area;
	}
	
	
	/*
	 * This method gets the perimeter
	 */
	public double getPerimeter() {
		double perimeter = length + length + width + width;
		return perimeter;
	}
	
	

}
