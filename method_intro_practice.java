/*
 * fdsjklfdjsklfdjk
 */
public class method_intro_practice {
	
	public static void main(String[] args) {
		// cool cool
		stateName();
		stateHairStyle();
		stateFavoriteFood();
		System.out.println();
		printCircleStats(4);
		System.out.println();
		printMathStuffs(4, 2);

	}

/*
 * Task 1: Create a void method called stateName() that prints out your name.
 * Repeat this task for stateEyeColor(), stateHairStyle(), stateBestFriend(), 
 * and stateFavoriteFood(). Then, call stateName(), stateHairStyle, and stateFavoriteFood().
 * 
 * This method states my name.
 */
	public static void stateName() {
		System.out.println("My name is Simone Callejo.");
		
		}
	
/*
 * This method states my favorite food.
*/
	public static void stateFavoriteFood() {
		System.out.println("My favorite food is Sushi.");
			
		}
	
/*
* This method states my hair Style.
*/
	public static void stateHairStyle() {
		System.out.println("My hairstyle is wavy hair with bangs.");
			
		}
/*
* This method states my best friends.
*/
	public static void stateBestFriend() {
		System.out.println("My best friends are Ano and Mana'e");
			
		}
	
/*
* Task 2: Create a method printCircleStats() that is passed a double
* (meant to represent a circle's radius) and calculates then prints out
* the radius, diameter, circumference, and area of the circle. Call the method 
* to make sure it works.
* 
* This method takes any radius and calculates its radius, diameter, circumference, and area
*/
	public static void printCircleStats(double radius) {
	
		System.out.println("This circles...");
		
		//Declare a radius as a double(x = radius)
		double x = radius;
		System.out.println("Radius = " + x);
		
		//Declaring pi
		double pie = 3.14;
		
		//Calculate its diameter
		double diameter = pie*(x*x);
		System.out.println("Diameter = " + diameter);
		
		//Calculate its circumference
		double circumf = diameter*pie;
		System.out.println("Circumference = " + circumf);
		
		//Calculate its area
		double area = pie*(radius*radius);
		System.out.println("Area =  " + area);
		
		
	}

/*
 *  Task 3: Create a void method printMathStuffs() that is passed two ints and prints
 *  their sum, difference, product, quotient, and the remainder (using modulus)
 *  of the first number modulus the second number. Call it to make sure it works.
 */
	public static void printMathStuffs(int x, int y) {
		
		System.out.println("The operations of " + x + " and " + y + " are: " );
		
		//Calculate sum
		int sum = x + y;
		System.out.println("sum = " + sum);
		
		//Calculate difference
		int diff = x - y;
		System.out.println("difference = " + diff);
		
		//Calculate product
		int prod = x * y;
		System.out.println("product = " + prod);
		
		//Calculate quotient
		int quo = x / y;
		System.out.println("quotient = " + quo);
		
		//Calculate remainder
		int rem = x % y;
		System.out.println("remainder = " + rem);
	}
	
}


			
