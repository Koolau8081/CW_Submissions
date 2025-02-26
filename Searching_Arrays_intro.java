public class searching_Arrays_intro {

	public static void main(String[] args) {

	int[] arrThing = {3, 5, 4, 7, 2, 1, 7, 4, 6, 4, 4};
	
	System.out.println(checkFor4(arrThing));
	System.out.println(countFor4(arrThing));
	System.out.println(checkForFour4(arrThing));
		
		
	}

	/*
	 * 1. Create a method checkFor4() that is passed an int array and returns
	 *  true if that array has a 4 and false if that array has no 4's. 
	 */
	public static boolean checkFor4(int arr[]) {
		
		int[] copyArr = arr;
		
		boolean isFound = false;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(copyArr[i] == 4) {
				
				isFound = true;
				
			}
		}
		
		return isFound;
		
	}
	
	
	/*
	 * 2. Create a method countFor4() that is passed an int array and returns
	 *  how many times 4 shows up in the array. 
	 */
	public static int countFor4(int[] arr) {
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == 4) {
			
				count ++;
			
			}
		
		}
		
		return count;
		
	}
	
	
	/*
	 * 3. Create a method checkForFour4() that is passed an int array and
	 *  return true if the array has exactly four 4's in it.
	 */
	public static boolean checkForFour4(int[] arr) {
		
		boolean trueFalse = false;
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == 4) {
				
				count ++;
				
			}
			
		}
		
		if(count == 4) {
			
			trueFalse = true;
			
		}
		
		
		return trueFalse;
	}
	
}
