
public class Homework1_PracticingSystemAndPrimitives {
	
	public static void main(String[] args) {
		
	// task 1: print out your name using the letter "O" in ASCII art.
		System.out.println("OOO OOO O   O OOOO O   O OOOO");
		System.out.println("O    O  OO OO O  O OO  O O   ");
		System.out.println("OOO  O  O O O O  O O O O OOOO");
		System.out.println("  O  O  O   O O  O O  OO O   ");
		System.out.println("OOO OOO O   O OOOO O   O OOOO");
		System.out.println();
		
	// task 2: Write code to compute the following math problem: 
		double topmult1 = 6.0*3.5;
		double topmult2 = 1.5*5;
		double topdiff = topmult1-topmult2;
		double bottomdiff = 55.6-30.2;
		double quo = topdiff/bottomdiff;
		System.out.println(quo);
		System.out.println();
		
	// task 3:  Write adaptable code that will print out the circumference
	//and area of a circle that has a radius of 4.0. (Hint: the value of pi 
	//is 3.1519 and it never changes)
		
		double radius = 4.0;
		double pie = 3.14159;
		double circumf = 2*pie*radius;
		double area = pie*(radius*radius);
		System.out.print("The circumference of the circle is " + circumf +
		" and the area of the circle is " + area + ".");
	
	
	}
	
	
}
