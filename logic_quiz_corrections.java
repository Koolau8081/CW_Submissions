
public class logic_quiz_code {

	
	
	public static void main(String[] args) {
	
	System.out.println(findlfsLeapYear(2027));
	
	
	}
	
	
	public static boolean findlfsLeapYear(int year) {
	
		boolean leapYear;
	
		if(year % 4 == 0) {
		
			leapYear = true;
		
			return leapYear;
	
		}
			
		if(year % 100 == 0 && year % 400 == 0) {
				
				
				leapYear = true;
				
				return leapYear;	
			}
		
		
		leapYear = false;
		
		return leapYear;
		
		
	}
	
	
}
