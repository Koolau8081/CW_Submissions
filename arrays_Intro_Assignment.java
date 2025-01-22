
/*
 * This is my arrays intro assignment class.
 */
public class arrays_Intro {
	/*
 	* This is my main method. 
 	*/
	public static void main(String[] args) 
	{
		
//task 1:
		
		double[] doubleArr;	
		int[] intArr;
		boolean[] booleanArr;
		String[] objectArr;
		//Circle[] circleArr;
		
		
	//task 2:
		
		System.out.println("Task 2:");
		
		int[] intArrr = {7, -12, 88, -88, 0, 5, 2000};
		System.out.println(intArrr[0]);
		System.out.println(intArrr[intArrr.length -1]);
		System.out.println();
		
		
	//task 3:
		//ints = 0, doubles = 0.0, booleans = false, reference data type = null
		
		String[] fruitsArr = new String[5];
		
		
	//Task 4: Change the 2nd element in fruitsArr to "Bapple".
		
		fruitsArr[1] = "Bapple";
		
		
	//Task 5: Change the last element in fruitsArr to "Zanana". Accomplish this without typing the number "4" and instead accessing the arrays length.
		
		fruitsArr[fruitsArr.length -1] = "Zanana";
		
		
	//Task 6: To verify you did number 4 correctly, print out the second element of fruitsArr.
		
		System.out.println("Task 6: second element of FruitsArr: ");
		
		System.out.println(fruitsArr[1]);
		System.out.println();
		
		
	//Task 7: Create a loop that one by one prints out each element in fruitsArr.
		
		System.out.println("Task 7: Printing out each element in furitsArr: ");
		
		for(int i = 0; i < fruitsArr.length; i++)
		{
			System.out.println(fruitsArr[i]);
		}
		
	
	
		
	
	}
	
	
	
	
	
	
	
	
	
}
