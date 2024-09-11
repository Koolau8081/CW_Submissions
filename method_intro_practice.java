
public class method_intro_practice {

	public static void main(String[] args) {
		// cool cool
		stateName();
		stateHairStyle();
		stateFavoriteFood();
		printCircleStats(4);

	}

/*
 * Create a void method called stateName() that prints out your name.
 *  Repeat this task for stateEyeColor(), stateHairStyle(), stateBestFriend(), 
 *  and stateFavoriteFood(). Then, call stateName(), stateHairStyle, and stateFavoriteFood().
 *  This method states my name.
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
	 * This method states my favorite food.
	 */
	public static void stateBestFriend() {
		System.out.println("My best friends are Ano and Mana'e");
			
		}
	
	/*
	 * Task 2: Create a method printCircleStats() that is passed a double
	 * (meant to represent a circle's radius) and calculates then prints out
	 * the radius, diameter, circumference, and area of the circle. Call the method 
	 * to make sure it works. 
	 */
	public static void printCircleStats(double radius) {
			//Declare a radius as a double(x = radius)
			double x = radius;
			System.out.println("Radius = " + x);
			//Declaring pi
			double pie = 3.14;
			System.out.println(pie);
			//Calculate its surface area
			double sArea = 4.0*pie*(x*x);
			System.out.println("Area = " + sArea);
			//Calculate its volume
			double volume = (4.0/3.0)*pie*(x*x*x);
			System.out.println("Volume = " + volume);
			
