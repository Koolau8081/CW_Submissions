
public class Cube {

	
	
//Attributes
	private double side;
	
	
//Constructor
	public Cube(double s) {
		
		side = s;
		
	}
	
	
//Functions
	
	/*
	 * This method prints the shape name
	 */
	public static String getShape() {
	
		return ("Cube");
		
	}
	
	
	/*
	 * This method gets the side length
	 */
	public double getSide() {
		return side;
		
	}
	
	/*
	 * This method gets the volume
	 */
	public double getVolume() {
		double volume = side*side*side;
		return volume;
	}
	
	/*
	 * This method gets the Area
	 */
	public double getArea() {
		double area = 6*(side*side);
		return area;
		
	}
	
	
	
	
}
