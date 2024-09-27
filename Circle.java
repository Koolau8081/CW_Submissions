
public class Circle {

	//attributes
	private double radius;
	final private double pie =3.14;
	
	//constructor:
	public Circle (double r) {
	
		radius = r;
		
	}
	
	
	//Functions
	//radius, diameter, circumference, area
	
	public static String getShape() {
		
		return "Circle";
		
	}
	
	
	public double getRadius() {
		return radius;
		
	}
	
	
	
	public double getArea(){
		
		double area = pie*(radius*radius);
		return area;
		
	}
	
	
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
	
