
public class Square {

	//Attributes
	
	private double side;
	
	
	
	//Constructor
	
	public Square(double s) {
		
		side = s;
	
	}
	
	//Functions
	
	public static String getShape() {
		
		return "Square";
				
	}
	
	public double getSide() {
		
		return side;
		
	}
	
	public double getArea() {
		
		double area = side*side;
		return area;
		
	}
	
	public double getPerimeter() {
		
		double perimeter = side+side+side+side;
		return perimeter;
		
	}
	
	
}
