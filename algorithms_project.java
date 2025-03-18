
public class algorithms_Project {

	public static void main(String[] args) {

	
		int[] numArr = {6, 7, 4, 3, 6, 1, 0, 9};
		int[] small = {1, 2, 3, 4, 5, 6};
		int[] numArr2 = {5, 43, 2, 78, 6, 54, 2, 12, 17, 9, 0};
		int[] even = {4, 2, 6, 8, 6, 4, 6, 4, 22, 2};
		int[] consec5 = {5, 3, 1, 7, 87, 5, 5, 0, 2};
		int[] threeInRow = {33, 45, 9, 5, 7, 7, 7, 8, 9, 7, 6, 5, 0};
		int[] backArr = {5, 4, 3, 2, 1, 0};
		int[] sort = {6, 5, 4, 3, 2, 1, 0, 12};
		int[] sort2 = {3, 2, 1};
		
		
		System.out.println("[1]" + smallestNum(numArr));
		
		System.out.println("[2]" + indexOfSmallestNum(even));
		
		System.out.println("[3]" + averageNum(numArr2));
		
		System.out.println("[4]" + isEvenNums(even));
		
		System.out.print("[5]");
		printArray(consec5ToZeros(consec5));
		System.out.println();
		
		System.out.println("[6]" + is3ConsecutiveNums(threeInRow));
		
		System.out.println("[7]" + howManyOfThisInt(numArr, 6));
		
		System.out.print("[8]");
		printArray(arrBackwards(backArr));
		System.out.println();
		
		
		System.out.print("[9]");
		printArray(shiftRight(small));
		System.out.println();
		
		
		System.out.print("[10]");
		printArray(sortNumerically(sort));
		System.out.println();
		
		
		//to check if printArray prints array
		System.out.println();
		System.out.print("[print check]");
		printArray(sortCheck(sort2));
		
	}
	
	
	/*
	 * for easy priting of array for checking
	 */
	public static String returnArrAsString(int[] arr) {
		
		String printArr = "";
		
		for(int num: arr) {
			
			if(num == arr[arr.length -1]) {
			
				printArr += num;
						
			}
			
			else {
				
				printArr += arr[1] + ", ";
				
			}
			
		}
		
		return printArr;
	}
	
	public static void printArray(int[] arr) {
			
			
			for(int num: arr) {
				
				System.out.print(num);
				
				
			}
			
	}

	/*
	 * 1. Return the smallest number in the array. 
	 */
	public static int smallestNum(int[] arr) {
		
		int holder = arr[0];
		
		for(int num: arr) {
			
			if(num < holder) {
				
				holder = num;
				
			}
			
			
		}
		
		return holder;
	}
	
	
	/*
	 * 2. Return the index of the smallest number in the array.
	 */
	public static String indexOfSmallestNum(int[] arr) {
		
		int holder = arr[0];
				
		for(int i = 0; i < arr.length; i++) {
					
			if(arr[i] < holder) {
						
				holder = arr[i];
						
			}		
					
		}
			
		int count = 0;
		
		String indexOf = ""; 
		
		for(int i = 0; i < arr.length; i++) {
			
			
			if(count < 2) {
				
				if(arr[i] == holder) {
						
					indexOf = "" + i;
				
					count++;
						
				}
				
			}
			
			if(count > 1) {
				
				indexOf += ", " + i;
				
			}
			
				
		}
		
		
		return indexOf;
	}
	
	
	/*
	 * 3. Return the average of all numbers in the array. 
	 */
	public static int averageNum(int[] arr) {
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
			
		}
		
		sum = sum / arr.length;
		
		return sum;
	}
	
	
	/*
	 * 4. Return true if all numbers in the array are even, and return false otherwise.
	 */
	public static boolean isEvenNums(int[] arr) {
		
		boolean isEven = false;
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] % 2 == 0) {
			
				count++;
				
			}
			
		}
		
		if(count == arr.length) {
			
			isEven = true;
			
		}
		
		return isEven;
		
	}
	
	
	/*
	 * 5. If the array ever has two consecutive 5's, change them to 0's.
	 *  (For example, passing {4, 5, 5, 2, 1} changes the array to {4, 0, 0, 2, 1} ).
	 */
	public static int[] consec5ToZeros(int[] arr) {
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == 5) {
			
				count ++;
				
				if(arr[i] != arr[arr.length-1] && arr[i+1] == 5) {
					
					count ++;
					arr[i] = 0; 
					arr[i+1] = 0;
					
				}
				
				
			}
			
			
			
			
		}
		
		return arr;
		
	}
	
	
	/*
	 * 6. Return true if any number shows up three times in a row,
	 *  and return false otherwise. 
	 *  {5, 7, 7, 7, 8}
	 */
	public static boolean is3ConsecutiveNums(int[] arr) {
		
		boolean is3InRow = false;
		int holdNum = arr[0];
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			
			if(arr[i] == holdNum) {
				
				count++;
				
			}
			
			else {
				
				count = 0;
				
				holdNum = arr[i];
				
				count++;
				
			}
			
			if(count == 3) {
				
				is3InRow = true;

				
			}
			
		}
		
		return is3InRow;
		
		
	}
	
	
	/*
	 * 7. Pass an array of ints and an int to be searched for.
	 *  Return how many times that int shows up in the array.
	 *  (For example, passing ( {4, 5, 5, 2, 1} , 5) returns 2 because 5 shows up twice)
	 */
	public static int howManyOfThisInt(int[] arr, int num) {
			
		int count = 0;
		
		for(int i: arr) {
			
			if(i == num) {
				
				count++;
				
			}
			
		}
		
		return count;
		
	}
	
	
	/*
	 * 8. Alter an array so that is the backwards version of the array initially passed 
	 * (for example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 5, 5, 4})
	 */
	public static int[] arrBackwards(int[] arr) {
		
		int[] copyArr = copyArray(arr);
		
		int countDown = arr.length -1;
		
		for(int i = 0; i < arr.length ; i++) {
			
			arr[i] = copyArr[countDown];
			
			countDown --;
			
		}
		
		return arr;
	}
	
	
	/*
	 * 9. Shift all elements in an array to the right. 
	 * (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 4, 5, 5, 2})
	 */
	public static int[] shiftRight(int[] arr) {
		
		int last = arr[arr.length-1];
		
		for(int i = 0; i < arr.length; i++) {
			
			if(i == arr.length-1) {
				
				arr[0] = last;
				
			}
			
			else {
				
				arr[i] = arr[i +1];
			}
			
		}
		
		return arr;
	}
	
	
	/*
	 * 10. Use either selection sort or insertion sort to sort an array. 
	 * (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 4, 5, 5})
	 */
	public static int[] sortNumerically(int[] arr) {
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			
			for(int k = 0; k < arr.length; i++) {
			
				int least = arr[i];
				
				int holder;
				
				if(arr[i] < least) {
				
					least = arr[i];
					
					holder = arr[i];
					
					arr[least] = holder;
				
				} 
			
			}
			
		}
	
		return arr;
		
	}
	
	/*
	 * to check if can print array.
	 */
	public static int[] sortCheck(int[] arr) {
	
		arr[0] = 7;
		arr[1] = 8;
		arr[2] = 9;
		
		return arr;
	}
	
	
	/*
	 * copy arrays yay
	 */
	public static int[] copyArray(int[] arr) {
		
		int[] copyArr = new int[arr.length];
		
			for(int i = 0; i < arr.length; i++) {
				
				copyArr[i] = arr[i];
				
			}
				
		
		
		return copyArr;
		
		
	}
	
	
	
	
	
}

