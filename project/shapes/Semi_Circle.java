
public class Semi_Circle {

	//attributes
	
	private double radius;
	final private double pie = 3.14;
	
	
	
	//constructor
	public Semi_Circle(double r) {
		
		radius = r;
		
	}
	
	
	//functions
	
	/*
	 * This method prints the shape name
	 */
	public static String getShape() {
		return "Semi_Circle";
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
	public double getArea() {
		
		double area = (pie*(radius*radius))/2;
		return area;
	}
	
	
	/*
	 * This method gets the diameter
	 */
	public double getDiameter() {
		double diameter = radius + radius;
		return diameter;
				
	}
	
}
