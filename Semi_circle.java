
public class Semi_Circle {

	//attributes
	
	private double radius;
	final private double pie = 3.14;
	
	
	
	//constructor
	public Semi_Circle(double r) {
		
		radius = r;
		
	}
	
	
	//functions
	public static String getShape() {
		return "Semi Circle";
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		
		double area = (pie*(radius*radius))/2;
		return area;
	}
	
	public double getDiameter() {
		double diameter = radius + radius;
		return diameter;
				
	}
	
