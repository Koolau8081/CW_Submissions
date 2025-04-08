/*
 * Class for practicing 2D arrays intro
 */
public class twoD_Array_Intro_Assignment {
	
	/*
	 * This is my main method.
	 */
	public static void main(String[] args) {

		//Task 1: Instantiate a 2-D array gridNums that consists of 4 rows and 6 columns using the "new" keyword. 
		int[][] gridNums = new int[][]
			{
					{0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0}
			};
			
		//Task 2: Instantiate a 2-D array with the following values: 4, 5, 7 -- 2, -1, 8 -- 0, 1, 3
		int[][] twoDArr = 
			{
					{4, 5, 7},
					{2, -1, 8},
					{0, 1, 3}
			};
		
		changeArrayAccordingToTrauger(gridNums, twoDArr);
		
		printFirstRow(gridNums);
		
		System.out.println("\n \n");
		
		printFirstColumn(gridNums);
		
		System.out.println("\n \n");
		
		printRowMAjorOrder(twoDArr);
		
		System.out.println("\n \n");
		
		printColumnMajorOrder(twoDArr);
		
		
		
		}
	
	
	
	
	/*
	 * This method prints out an array.
	 */
	public static void print2DArray(int[][] arr) {
		
		for(int r = 0; r < arr.length; r++) {
			
			for(int c = 0; c < arr[0].length; c++) {
				
				System.out.print(arr[r][c] + " ");
				
			}
			
			System.out.println();
		}
		
	}
	
	
	
	/*
	 * For the following problems, print out those elements before and after to verify it worked. 
	 */
	public static void changeArrayAccordingToTrauger(int[][] arr1, int[][]arr2) {
		
		System.out.println("~~~~~~~TASK 3~~~~~~~~~~~~~~~~~~~~~~");
		
		//Task 3: For both of those arrays, change the element in the first row, first column to a 17.
			
			System.out.println("~~~~~~~TASK 3~~~~~~~~~~~~~~~~~~~~~~");
		
			//arr1
			System.out.println("before change:");
			print2DArray(arr1);
			
			System.out.println("after change:");
			arr1[0][0] = 17;
			print2DArray(arr1);
			
			
			System.out.println();
			
			//arr2
			System.out.println("before change:");
			print2DArray(arr2);
			
			System.out.println("after change:");
			arr2[0][0] = 17;
			print2DArray(arr2);
			
			
			System.out.println("\n");
			
			
		//Task 4: For both of those arrays, change the element in the second row, third column into a 20. 
			
			System.out.println("~~~~~~~TASK 4~~~~~~~~~~~~~~~~~~~~~~");
			
			//arr1
			System.out.println("before change:");
			print2DArray(arr1);
			
			System.out.println("after change:");
			arr1[1][2] = 20;
			print2DArray(arr1);
			
			
			System.out.println();
			
			
			//arr2
			System.out.println("before change:");
			print2DArray(arr2);
			
			System.out.println("after change:");
			arr2[1][2] = 20;
			print2DArray(arr2);
		
			System.out.println("\n");
		
			
		//Task 5: For both of those arrays, change the last element in the first row to a -5. Accomplish this using .length 
			
			System.out.println("~~~~~~~TASK 5~~~~~~~~~~~~~~~~~~~~~~");
			
			//arr1
			System.out.println("before change:");
			print2DArray(arr1);
			
			System.out.println("after change:");
			arr1[0][arr1[0].length-1] = -5;
			print2DArray(arr1);
			
			
			System.out.println();
			
			
			//arr2
			System.out.println("before change:");
			print2DArray(arr2);
			
			System.out.println("after change:");
			arr2[0][arr2[0].length-1] = -5;
			print2DArray(arr2);
		
			System.out.println("\n");
		
			
		//Task 6: For both of those arrays, change the first element in the last row to a -7. Accomplish this using .length 
			
			System.out.println("~~~~~~~TASK 6~~~~~~~~~~~~~~~~~~~~~~");
			
			//arr1
			System.out.println("before change:");
			print2DArray(arr1);
			
			System.out.println("after change:");
			arr1[arr1.length-1][0] = -7;
			print2DArray(arr1);
			
			
			System.out.println();
			
			
			//arr2
			System.out.println("before change:");
			print2DArray(arr2);
			
			System.out.println("after change:");
			arr2[arr2.length-1][0] = -7;
			print2DArray(arr2);
		
			System.out.println("\n");
			
			
		//Task 7: For both of those arrays, change the last element in the last row to a -30. Accomplish this using .length 
			
			System.out.println("~~~~~~~TASK 7~~~~~~~~~~~~~~~~~~~~~~");
			
			//arr1
			System.out.println("before change:");
			print2DArray(arr1);
			
			System.out.println("after change:");
			arr1[arr1.length-1][arr1[0].length-1] = -30;
			print2DArray(arr1);
			
			
			System.out.println();
			
			
			//arr2
			System.out.println("before change:");
			print2DArray(arr2);
			
			System.out.println("after change:");
			arr2[arr2.length-1][arr2[0].length-1] = -30;
			print2DArray(arr2);
		
			System.out.println("\n");
			
	}

	/*
	 * Task 8: Create a method that is passed a 2-D array of ints and one by one prints out each element in the first row. 
	 */
	public static void printFirstRow(int[][] arr) {
		
		System.out.println("~~~~~~~TASK 8~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int c = 0; c < arr[0].length; c++) {
			
			System.out.print(arr[0][c] + " ");
			
		}
		
	}
	
	/*
	 * Task 9: Create a method that is passed a 2-D array of ints and one by one prints out each element in the first column.
	 */
	public static void printFirstColumn(int[][] arr) {
		
		System.out.println("~~~~~~~TASK 9~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int r = 0; r < arr.length; r++) {
			
			System.out.println(arr[r][0]);
			
		}
		
	}
	
	/*
	 * Task 10: Create a method that is passed a 2-D array of ints and one by one prints out each element in row-major order. 
	 */
	public static void printRowMAjorOrder(int[][] arr) {
		
		System.out.println("~~~~~~~TASK 10~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int r = 0; r < arr.length; r++) {
			
			for(int c = 0; c < arr[0].length; c++) {
				
				System.out.print(arr[r][c] + " ");
				
			}
			
			System.out.println();
		}
		
	}
	
	/*
	 * Task 11: Create a method that is passed a 2-D array of ints and one by one prints out each element in column-major order. 
	 */
	public static void printColumnMajorOrder(int[][] arr) {
		
		System.out.println("~~~~~~~TASK 11~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int c = 0; c < arr[0].length; c++) {
			
			for(int r = 0; r < arr.length; r++) {
				
				System.out.print(arr[r][c] + " ");
				
			}
			
			System.out.println();
		}
		
	}
	
	
}
