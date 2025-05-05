/*
 * Will handle dogs and puppies as they do things in dog shelter (get adopted/fed/etc).
 */
public class adoption_main {
	
/*
 * This is my main method MUHAHAHA.
 */
	public static void main(String[] args) {
	
		//1 Dog and changing it
			
			//Duck
			Dog duck = new Dog(256, "Duck", false);
			
			System.out.println("Adopted true or false" + duck.getAdoptionStatus());
			
			//states the age of the dog
			duck.stateAge();
			
			//increases the age of dog for birthday
			duck.increaseAge();
			
			//states the age of the dog again
			duck.stateAge();
			
			System.out.println(duck);
		
		//1 PuppyDog and changing it
			
			//Meow
			PuppyDog meow = new PuppyDog(2, "Meow", false, false);
			
			System.out.println("Adopted true or false" + meow.getAdoptionStatus());
			
			//stating the age of puppydog
			meow.stateAge();
			
			//increases the age of puppydog for aging another month
			meow.increaseAge();
			
			//feeds the puppydog
			meow.feedPup();
			
			//states the age of the puppydog
			meow.stateAge();
			
			System.out.println(meow);
		
		//two dogs with the same name seeing if they're the same
			
			//mouse
			Dog mouse = new Dog(40, "Mouse", false);
			
			//mouse1
			Dog mouse1 = new Dog(40, "Mouse", false);
			
			//checks if the two dogs are the same and returns true if they are same
			if(mouse1.equals(mouse)) {
				
				System.out.println("true");
				
			}
			
		//two puppydogs with same name seeing if they're the same
			
			//hat
			PuppyDog hat = new PuppyDog(41, "hat", false, false);
			
			//hat1
			PuppyDog hat1 = new PuppyDog(41, "hat", false, false);
			
			//checks if the two puppydogs are the same and returns true if they are same
			if(hat.equals(hat1)) {
				
				System.out.println("true");
				
			}
			
			
		
		
		
		

	}

}
