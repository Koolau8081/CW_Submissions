/*
 * This code's purpose is to practice using methods.
 */
public class non_void_method_practice {
/*
 * This method is used to print other methods.
 */
	public static void main(String[] args) {
		//call stateName, stateHairStyle, stateFavoriteFood
		System.out.println(stateName());
		System.out.println(stateHairStyle());
		System.out.println(stateFavoriteFood());
		
		
		System.out.println();


		//call printCircleStats
		printCircleStats(4);
		
		
	}

	
/*
 * Task 1: Create a void method called stateName() that prints out your name.
 * Repeat this task for stateEyeColor(), stateHairStyle(), stateBestFriend(), 
 * and stateFavoriteFood(). Then, call stateName(), stateHairStyle, and stateFavoriteFood().
 * 
 * This method states my name.
 */
	public static String stateName() {
		
		
		//System.out.println("My name is Simone Callejo.");
		
		return("My name is Simone Callejo.");
		
		}
	
	
/*
 * This method states my favorite food.
*/
	public static String stateFavoriteFood() {
		
		
		//System.out.println("My favorite food is Sushi.");
		
		return("My favorite fod is sushi.");
		
		}
	
	
/*
* This method states my hair Style.
*/
	public static String stateHairStyle() {
		
		
		//System.out.println("My hairstyle is wavy hair with bangs.");
		
		return("My hairstyle is wavy hair with bangs.");
		
		}
	
	
	/*
	* This method states my hair Style.
	*/
		public static String stateEyeColor() {
			
			
			//System.out.println("My eye color is dark brown.");
			
			return("My eye color is dark brown.");
			
			}
		
		
/*
* This method states my best friends.
*/
	public static String stateBestFriend() {
		
		
		//System.out.println("My best friends are Ano and Mana'e.");
				
		return("My best friends are ano and Mana'e.");
			
		}

	
	
	/*
	* Task 2: Create a method printCircleStats() that is passed a double
	* (meant to represent a circle's radius) and calculates then prints out
	* the radius, diameter, circumference, and area of the circle. Call the method 
	* to make sure it works.
	* 
	* This method takes any radius and calculates its radius, diameter, circumference, and area
	*/
		public static double printCircleStats(double radius) {
		
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
			
			return();
			
		}
		
		public static String printCircleRadius(double radius) {
		
			
			double x = radius;
			
			return("Radius = " + x);
			
		}
	
		
		public static String printCircleDiameter(double radius) {
		
			//Declaring radius
			double x = radius;
			
			//Declaring pi
			double pie = 3.14;
			
			//Calculate its diameter
			double diameter = pie*(x*x);
			
			return("Diameter = " + diameter);
			
		}
	
		
		public static String printCircleCircumference(double x) {
			
			//Delaring radius
			double radius = radius;
			
			//Declaring pi
			double pie = 3.14;
			
			//Calculate its diameter
			double diameter = pie*(x*x);
			
			//Calculate its circumference
			double circumf = diameter*pie;
			
		}
}
