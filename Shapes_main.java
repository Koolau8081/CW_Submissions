
public class shapes_main {
	
	public static void main(String[] args) {

	//Circle 1
	Circle circOne = new Circle(4.0);
	System.out.println(Circle.getShape());
	System.out.print(circOne.getRadius());
	
	
	//Cube
	Cube cubeOne = new Cube(2.0);
	System.out.println(Cube.getShape());
	System.out.print(cubeOne.getSide());

	
	//Semi-Circle
	Semi_Circle semcircOne = new Semi_Circle(2.0);
	System.out.println(Semi_Circle.getShape());
	System.out.println(semcircOne.getRadius()); 
	
	
	//Sphere
	Sphere sphereOne = new Sphere(3.0);
	System.out.println(Sphere.getShape());
	System.out.println(sphereOne.getRadius());
	
	//Square
	Square squareOne = new Square(2.0);
	System.out.println(Square.getShape());
	System.out.println(squareOne.getSide());
	
	
	//Rectangle
	Rectangle rec1 = new Rectangle(3,7);
	Rectangle rec2 = new Rectangle(4);
	
	//thing did in class shortcut goes at bottom of shape
	System.out.print(circOne.toString());
	
	}
	
	
	
	//5 different shapes
	//
	
	
}
