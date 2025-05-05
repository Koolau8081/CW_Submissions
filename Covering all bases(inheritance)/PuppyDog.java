/*
 * This is my puppyDog object class.
 */
public class PuppyDog extends Dog {
	
	//Attributes
	private boolean isFed;
	
	
	
	//Constructor
	public PuppyDog (int a, String n, boolean ad, boolean f) {
	
		super(a, n, ad);
		isFed = f;
		
	}
	
	
	//functions
	
	/*
	 * States age of puppy in months
	 */
	public void stateAge() {
		
		System.out.println(name + " is " + age + " months old.");
	}
	
	/*
	 * Feeds puppy
	 */
	public void feedPup() {
		
		isFed = true;
	
	}
	
	/*
	 * increases age of dog
	 */
	public void increaseAge() {
		
		super.increaseAge();
		isFed = false;
	}
	
	/*
	 * to see if puppy is fed or not.
	 */
	public boolean getIsFed() {
		
		return isFed;
	}
	/*
	 * overiddes .toString method in object method to print something else when trying to print an object
	 */
	public String toString() {
		
		if(isFed) {
			
			return super.toString() + " " + name + " is not starving either.";
			
		}
		return super.toString() + " " + name + " is currently starving.";
		
	}
	
	/*
	 * overiddes .equals method in object folder to see if the attributes in both dogs are the same for comparison if than statements.
	 */
	public boolean equals(PuppyDog lilDoggy) {
		
		
		if(super.equals(lilDoggy) && this.isFed == lilDoggy.isFed) {
			
			return true;
			
		}
		
		return false;
		
	
		
		
		
	}
	
	
}
