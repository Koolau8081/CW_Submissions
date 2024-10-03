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
		System.out.println(printCircleStats(4));
		
		
		
		System.out.println();
		
		//call task 3:
		System.out.println(getSum(9, 3));
		System.out.println(getDiff(9, 3));
		System.out.println(getProd(9, 3));
		System.out.println(getQuot(9, 3));
		System.out.println(getMod(9, 3));
		
	}

	
/*
 * Task 1: Create a nonvoid method called stateName() that returns your name.
 * Repeat this task for stateEyeColor(), stateHairStyle(), stateBestFriend(), 
 * and stateFavoriteFood(). Then, call stateName(), stateHairStyle, and stateFavoriteFood().
 */
	
	
	/*
	 * This method states my name.
	 */
		public static String stateName() {
		
		
			return("My name is Simone Callejo.");
		
		}
	
	
	/*
	 * This method states my favorite food.
	 */
		public static String stateFavoriteFood() {
		
		
			return("My favorite fod is sushi.");
		
		}
	
	
	/*
	 * This method states my hair Style.
	 */
		public static String stateHairStyle() {
		
		
			return("My hairstyle is wavy hair with bangs.");
		
		}
	
	
	/*
	* This method states my hair Style.
	*/
		public static String stateEyeColor() {
		
			
			return("My eye color is dark brown.");
			
			}
		
		
	/*
	 * This method states my best friends.
	*/
		public static String stateBestFriend() {
		
			
			return("My best friends are ano and Mana'e.");
			
		}

	
	
/*
* Task 2: Create a nonvoid method printCircleStats() that is passed a double
* (meant to represent a circle's radius) and calculates then prints out
* the radius, diameter, circumference, and area of the circle. Call the method 
* to make sure it works.
*/
		
	public static String printCircleStats(double radius) {
		
		//declare radius
		double x = radius;
		
		//declare pie
		double pie = 3.14;
		
		//declare diameter
		double diameter = pie*(x*x);
		
		//declare circumference
		double circumf = diameter*pie;
		
		//declare area
		double area = pie*(radius*radius);
		
		return ("Circle stats:" + "\n radius = " + radius + "\n diameter = " + diameter + "\n circumference = "
				+ circumf + "\n area = " + area);
	}
	
	
	
/*Create nonvoid methods that are passed two ints and returns their sum, difference, product, quotient, 
* and the remainder (using modulus) of the first number modulus the second number; all operations should be
* their own respective methods. Call them inside print statements to make sure they work. 
*/
	
	
	/*
	 * This method gets the sum of the two ints.	
	 */
		public static String getSum(int a, int b) {
		
			int sum = a + b;
		
			return "sum of " + a + " and " + b + " is " + sum;
	}
	
	/*
	 * This method gets the difference of the two ints.	
	 */
		public static String getDiff(int a, int b) {
		
			int difference = a - b;
		
			return "difference of " + a + " and " + b + " is " + difference;
	}
		
	/*
	 * This method gets the product of the two ints.	
	 */
		public static String getProd(int a, int b) {
		
			int product = a*b;
		
			return "product of " + a + " and " + b + " is " + product;
		
	}
	
	/*
	 * This method gets the quotient of the two ints.	
	 */	
		public static String getQuot(int a, int b) {
		
			int quotient = a/b;
		
			return "quotient of " + a + " and " + b + " is "+ quotient; 
	}
		
	/*
	 * This method gets the remainder of the two ints.	
	 */
		public static String getMod(int a, int b) {
		
			int modulus = a%b;
		
			return "remainder of " + a + " and " + b + " is "+ modulus;
	}
	
	
}
