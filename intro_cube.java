/* 
 * This is my cube class, if you put in one side length of 
 * a cube it will give you the area and volume of it. 
 */
public class Intro_Cube {
	
	public static void main(String[] args) {
		//declare a side length as an int
		double sl = 5.0;
		//calculate its surface area
		double sa = 6.0*(sl*sl);
		//calculate its volume
		double volume = sl*sl*sl;
		
		//print its values as doubles(in a sentence)
		System.out.println("The side length of the square is " + (int)sl + ".");
		System.out.println("It's surface area is " + (int)sa + ".");
		System.out.print("It's volume is " + (int)volume + "." );
		
		
	
