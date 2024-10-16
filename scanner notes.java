
//telling computer that gonna reference this class
import java.util.Scanner;



public class Strings_Intro {

	public static void main(String[] args) {
		
		//object that reads console
		Scanner myReader = new Scanner(System.in);
		
		//what I'm putting into the computer
			//string: instantiates new string variable
			//myImput: names object
			//new: makes new object by calling constructor
			//String: name of constructor
			//myReader: next = read whatever is in the console until hits a space or next line(not passed parameters)
		String myImput = new String(myReader.next());
		
		
		//shuts off reader
		myReader.close();
		

	}

}
