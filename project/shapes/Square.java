
public class Square {

//Attributes
	
	private double side;
	
	
	
//Constructor
	
	public Square(double s) {
		
		side = s;
	
	}
	
//Functions
	
	/*
	 * This method prints the shape name
	 */
	public static String getShape() {
		
		return "Square";
				
	}
	
	/*
	 * This method gets the side length
	 */
	public double getSide() {
		
		return side;
		
	}
	
	
	/*
	 * This method gets the Area
	 */
	public double getArea() {
		
		double area = side*side;
		return area;
		
	}
	
	/*
	 * This method gets the perimeter
	 */
	public double getPerimeter() {
		
		double perimeter = side+side+side+side;
		return perimeter;
		
	}
	
	
}
