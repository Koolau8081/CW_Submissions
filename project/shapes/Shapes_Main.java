/*
 * This class is for making shapes(objects)
 */
public class shapes_main {
	/*
	 * This is my main method: where I will be making shapes.
	 */
	public static void main(String[] args) {
		
		
//Circles
	//Circle 1
	Circle circOne = new Circle(4.0);
	System.out.print(Circle.getShape());
	System.out.println("#1 stats:");
	System.out.print("Radius = ");
	System.out.println(circOne.getRadius());
	System.out.print("Area = ");
	System.out.println(circOne.getArea());
	System.out.print("Circumference = ");
	System.out.println(circOne.getCircumference());
	System.out.println();
	
	//Circle 2
	Circle circTwo = new Circle(5.0);
	System.out.print(Circle.getShape());
	System.out.println("#2 stats:");
	System.out.print("Radius = ");
	System.out.println(circTwo.getRadius());
	System.out.print("Area = ");
	System.out.println(circTwo.getArea());
	System.out.print("Circumference = ");
	System.out.println(circTwo.getCircumference());
	System.out.println();
	
	//Circle 3
	Circle circThree = new Circle(4.0);
	System.out.print(Circle.getShape());
	System.out.println("#3 stats:");
	System.out.print("Radius = ");
	System.out.println(circThree.getRadius());
	System.out.print("Area = ");
	System.out.println(circThree.getArea());
	System.out.print("Circumference = ");
	System.out.println(circThree.getCircumference());
	System.out.println();
	
	
	System.out.println();
	
//Cubes
	//Cube 1
	Cube cubeOne = new Cube(2.0);
	System.out.print(Cube.getShape());
	System.out.println("#1 stats:");
	System.out.print("Side length = ");
	System.out.println(cubeOne.getSide());
	System.out.print("Volume = ");
	System.out.println(cubeOne.getVolume());
	System.out.print("Area = ");
	System.out.println(cubeOne.getArea());
	System.out.println();
	
	//Cube 2
	Cube cubeTwo = new Cube(2.0);
	System.out.print(Cube.getShape());
	System.out.println("#2 stats:");
	System.out.print("Side length = ");
	System.out.println(cubeOne.getSide());
	System.out.print("Volume = ");
	System.out.println(cubeOne.getVolume());
	System.out.print("Area = ");
	System.out.println(cubeOne.getArea());
	System.out.println();
	
	//Cube 3
	Cube cubeThree = new Cube(2.0);
	System.out.print(Cube.getShape());
	System.out.println("#3 stats:");
	System.out.print("Side length = ");
	System.out.println(cubeOne.getSide());
	System.out.print("Volume = ");
	System.out.println(cubeOne.getVolume());
	System.out.print("Area = ");
	System.out.println(cubeOne.getArea());
	System.out.println();

	
	
	System.out.println();
	
//Semi-Circles	
	//Semi-Circle 1
	Semi_Circle semcircOne = new Semi_Circle(2.0);
	System.out.print(Semi_Circle.getShape());
	System.out.println("#1 stats:");
	System.out.print("Radius = ");
	System.out.println(semcircOne.getRadius());
	System.out.print("Area = ");
	System.out.println(semcircOne.getArea()); 
	System.out.print("Diameter = ");
	System.out.println(semcircOne.getDiameter()); 
	System.out.println();
	
	//Semi-Circle 2
	Semi_Circle semcircTwo = new Semi_Circle(2.0);
	System.out.print(Semi_Circle.getShape());
	System.out.println("#2 stats:");
	System.out.print("Radius = ");
	System.out.println(semcircOne.getRadius());
	System.out.print("Area = ");
	System.out.println(semcircOne.getArea()); 
	System.out.print("Diameter = ");
	System.out.println(semcircOne.getDiameter()); 
	System.out.println();
	
	//Semi-Circle 3
	Semi_Circle semcircThree = new Semi_Circle(2.0);
	System.out.print(Semi_Circle.getShape());
	System.out.println("#3 stats:");
	System.out.print("Radius = ");
	System.out.println(semcircOne.getRadius());
	System.out.print("Area = ");
	System.out.println(semcircOne.getArea()); 
	System.out.print("Diameter = ");
	System.out.println(semcircOne.getDiameter()); 
	System.out.println();
	
	
	
	System.out.println();
	
//Spheres
	//Sphere 1
	Sphere sphereOne = new Sphere(3.0);
	System.out.print(Sphere.getShape());
	System.out.println("#1 stats:");
	System.out.print("Radius = ");
	System.out.println(sphereOne.getRadius());
	System.out.print("Area = ");
	System.out.println(sphereOne.getArea());
	System.out.print("Volume = ");
	System.out.println(sphereOne.getVolume());
	System.out.println();
	
	//Sphere 2
	Sphere sphereTwo = new Sphere(3.0);
	System.out.print(Sphere.getShape());
	System.out.println("#2 stats:");
	System.out.print("Radius = ");
	System.out.println(sphereOne.getRadius());
	System.out.print("Area = ");
	System.out.println(sphereOne.getArea());
	System.out.print("Volume = ");
	System.out.println(sphereOne.getVolume());
	System.out.println();
	
	//Sphere 3
	Sphere sphereThree = new Sphere(3.0);
	System.out.print(Sphere.getShape());
	System.out.println("#3 stats:");
	System.out.print("Radius = ");
	System.out.println(sphereOne.getRadius());
	System.out.print("Area = ");
	System.out.println(sphereOne.getArea());
	System.out.print("Volume = ");
	System.out.println(sphereOne.getVolume());
	System.out.println();
	
	
	System.out.println();
	
//Squares
	//Square 1
	Square squareOne = new Square(2.0);
	System.out.print(Square.getShape());
	System.out.println("#1 stats:");
	System.out.print("Side = ");
	System.out.println(squareOne.getSide());
	System.out.print("Area = ");
	System.out.println(squareOne.getArea());
	System.out.print("Perimeter = ");
	System.out.println(squareOne.getPerimeter());
	System.out.println();
	
	//Square 2
	Square squareTwo = new Square(2.0);
	System.out.print(Square.getShape());
	System.out.println("#2 stats:");
	System.out.print("Side = ");
	System.out.println(squareOne.getSide());
	System.out.print("Area = ");
	System.out.println(squareOne.getArea());
	System.out.print("Perimeter = ");
	System.out.println(squareOne.getPerimeter());
	System.out.println();
	
	//Square 3
	Square squareThree = new Square(2.0);
	System.out.print(Square.getShape());
	System.out.println("#3 stats:");
	System.out.print("Side = ");
	System.out.println(squareOne.getSide());
	System.out.print("Area = ");
	System.out.println(squareOne.getArea());
	System.out.print("Perimeter = ");
	System.out.println(squareOne.getPerimeter());
	System.out.println();
	
	
	
	
	System.out.println();
	
//Rectangles
	//Rectangle 1
	Rectangle recOne = new Rectangle(2, 1);
	System.out.print(Rectangle.getShape());
	System.out.println("#1 stats:");
	System.out.print("Length and Width = ");
	System.out.println(recOne.getLengthAndWidth());
	System.out.print("Area = ");
	System.out.println(recOne.getArea());
	System.out.print("Perimeter = ");
	System.out.println(recOne.getPerimeter());
	System.out.println();
	
	//Rectangle 2
	Rectangle recTwo = new Rectangle(2, 1);
	System.out.print(Rectangle.getShape());
	System.out.println("#2 stats:");
	System.out.print("Length and Width = ");
	System.out.println(recOne.getLengthAndWidth());
	System.out.print("Area = ");
	System.out.println(recOne.getArea());
	System.out.print("Perimeter = ");
	System.out.println(recOne.getPerimeter());
	System.out.println();
	
	//Rectangle 3
	Rectangle recThree = new Rectangle(2, 1);
	System.out.print(Rectangle.getShape());
	System.out.println("#3 stats:");
	System.out.print("Length and Width = ");
	System.out.println(recOne.getLengthAndWidth());
	System.out.print("Area = ");
	System.out.println(recOne.getArea());
	System.out.print("Perimeter = ");
	System.out.println(recOne.getPerimeter());
	System.out.println();
	
	
	
	
	
	System.out.println();
	
	//rectangle: overloaded method practice in class
	Rectangle rec1 = new Rectangle(3,7);
	Rectangle rec2 = new Rectangle(4);
	
	
	System.out.println();
	
	//thing did in class shortcut goes at bottom of shape
	System.out.print(circOne.toString());
	
	}
	
	
	
}

