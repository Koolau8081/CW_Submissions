import java.util.ArrayList;

public class arraylistsalgorythemsproject {



public class algorithms_Project {

	public static void main(String[] args) {

	
	ArrayList<Integer> arr = new ArrayList<>();
	arr.add(2);
	arr.add(7);	
	arr.add(24);	
	arr.add(1);
	arr.add(0);
	arr.add(8);
	arr.add(1);
	
	}
	
	

	/*
	 * 1. Return the smallest number in the array. 
	 */
	public static int smallestNum(ArrayList<Integer> arr) {
		
		int smallest = arr.get(0);
		
		for(int num: arr) {
			
			if(num< smallest) {
				
				smallest = num;
			}
			
			
		}
		
		return smallest;
		
	}
	
	
	/*
	 * 2. Return the index of the smallest number in the array.
	 */
	public static String indexOfSmallestNum(ArrayList<Integer> arr) {
		
		int holder = arr.get(0);
				
		for(int i = 0; i < arr.size(); i++) {
					
			if(arr.get(i) < holder) {
						
				holder = arr.get(i);
						
			}		
					
		}
			
		int count = 0;
		
		String indexOf = ""; 
		
		for(int i = 0; i < arr.size(); i++) {
			
			
			if(count < 2) {
				
				if(arr.get(i) == holder) {
						
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
	public static int averageNum(ArrayList<Integer> arr) {
		
		int sum = 0;
		
		for(int i = 0; i < arr.size(); i++) {
			
			sum += arr.get(i);
			
		}
		
		sum = sum / arr.size();
		
		return sum;
	}
	
	
	/*
	 * 4. Return true if all numbers in the array are even, and return false otherwise.
	 */
	public static boolean isEvenNums(ArrayList<Integer> arr) {
		
		boolean isEven = false;
		
		int count = 0;
		
		for(int i = 0; i < arr.size(); i++) {
			
			if(arr.get(i) % 2 == 0) {
			
				count++;
				
			}
			
		}
		
		if(count == arr.size()) {
			
			isEven = true;
			
		}
		
		return isEven;
		
	}
	
	
	/*
	 * 5. If the array ever has two consecutive 5's, change them to 0's.
	 *  (For example, passing {4, 5, 5, 2, 1} changes the array to {4, 0, 0, 2, 1} ).
	 */
	public static ArrayList<Integer> consec5ToZeros(ArrayList<Integer> arr) {
		
		int count = 0;
		
		for(int i = 0; i < arr.size(); i++) {
			
			if(arr.get(i) == 5) {
			
				count ++;
				
				if(arr.get(i) != arr.get(arr.get(i-1)) && arr.get(i+1) == 5) {
					
					count ++;
					arr.set(i, 0);
					arr.set(i, 0);
					
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
	
	
	
}
