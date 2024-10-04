
public class Sphere {

//attributes
	private double radius;
	final private double pie = 3.14;
	
//constructor
	public Sphere (double r) {
		
		radius = r;
		
	}
	
	
//Functions
	
	/*
	 * This method prints the shape name
	 */
	public static String getShape() {
		
		return("Sphere");	
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
		
		double area = 4.0*pie*(radius*radius);
		return area;
	}
	
	
	/*
	 * This method gets the volume
	 */
	public double getVolume() {
		
		double volume = (4.0/3.0)*pie*(radius*radius*radius);
		return volume;
	}
	
	

		
}
