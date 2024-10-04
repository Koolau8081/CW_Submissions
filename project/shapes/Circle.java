
public class Circle {

//attributes
	private double radius;
	final private double pie =3.14;
	
//constructor:
	public Circle (double r) {
	
		radius = r;
		
	}
	
	
//Functions

	/*
	 * This method prints the shape name
	 */
	public static String getShape() {
		
		return "Circle";
		
	}
	
	/*
	 * This method gets the radius
	 */
	public double getRadius() {
		return radius;
		
	}
	
	
	/*
	 * This method gets the Area
	 */
	public double getArea(){
		
		double area = pie*(radius*radius);
		return area;
		
	}
	
	/*
	 * This method gets the Circumference
	 */
	public double getCircumference() {
		double circumf = 2*pie*radius;
		return circumf;
	}
	
	
	/*
	 * This turns everything about the circle object into a String
	 */
	public String toString() {
		return "This is a Circle with radius " + radius + "and an area of "
				+ getArea() + "and Circumference of " + getCircumference() + ".";
	} 
}
	
