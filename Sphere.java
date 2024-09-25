
public class Sphere {

	//attributes
	private double radius;
	final private double pie = 3.14;
	
	//constructor
	public Sphere (double r) {
		
		radius = r;
		
	}
	
	
	//Functions
	//Declare a radius as a double
	public String getShape() {
		
		return("get shape");	
	}
	
	
	public double getRadius() {
	
		return radius;
	}
	
	
	public double getArea() {
		
		double area = 4.0*pie*(radius*radius);
		return area;
	}
	
	
	public double getVolume() {
		
		double volume = (4.0/3.0)*pie*(radius*radius*radius);
		return volume;
	}
	
	

			
}




