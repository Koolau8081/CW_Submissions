/*
 * This is my dog object class.
 */
public class Dog {

		
		
	//attributes
	protected String name;
	protected int age;
	protected boolean adopted;
	
	
	
	//Constructor
	public Dog(int a, String n, boolean ad) {
		
		age = a;
		name = n;
		adopted = ad;
		
	}
	
	/*
	 * checks if dog is adopted t or f.
	 */
	public boolean getAdoptionStatus() {
		
		return adopted;
	}
	
	/*
	 * states the age of dog.
	 */
	public void stateAge() {
		
		System.out.println(name + " is " + age + " years old.");
	}
	
	/*
	 * increases age of dog
	 */
	public void increaseAge() {
		
		age++;
		
	}
	
	/*
	 * overiddes .toString method in object method to print something else when trying to print an object
	 */
	public String toString() {
		
		stateAge();
		if(adopted) {
			
			return name + " is not homeless.";
			
		}
		return name + " is homeless.";
		
	}
	
	/*
	 * overiddes .equals method in object folder to see if the attributes in both dogs are the same for comparison if than statements.
	 */
	public boolean equals(Dog doggy) {
		
		if(this.age == doggy.age && this.name == doggy.name && this.adopted == doggy.adopted) {
			
			return true;
			
		}
		
		return false;
		
	}
		
}
