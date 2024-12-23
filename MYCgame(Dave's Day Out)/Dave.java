
import java.util.Scanner;

/*
 * This class is a charater object class for creating daves.
 */
public class Dave {
	
	//opens the scanner
	static Scanner myReader = new Scanner(System.in);

	//Attributes
	private String daveName;
	private String daveType;
	private String daveLooks;
	private String nTextColor;
	private String nColor;
	private String iTextColor;
	private String iColor;
	
	
	
	
	
	//constructor
	public Dave () {
		
		
	}
	
	
		
	//Declaring colors for use
		
		static String DEFAULT = "\033[0m";
		static String RED = "\033[38;5;210m";
		static String ORANGE = "\033[38;5;216m";		
		static String YELLOW = "\033[38;5;226m";
		static String GREEN = "\033[38;5;156m";
		static String BLUE = "\033[38;5;117m";	
		static String PURPLE = "\033[38;5;183m";
		static String PINK = "\033[38;5;218m";
		static String ITALICS = "\033[3m";
		
		//For easier use of color and italics for the narrator.
		static String IRED = "\033[38;5;210m\033[3m";
		static String IORANGE = "\033[38;5;216m\033[3m";		
		static String IYELLOW = "\033[38;5;226m\033[3m";
		static String IGREEN = "\033[38;5;156m\033[3m";
		static String IBLUE = "\033[38;5;117m\033[3m";	
		static String IPURPLE = "\033[38;5;183m\033[3m";
		static String IPINK = "\033[38;5;218m\033[3m";
		
		static String BLUEBLUE = "\033[38;5;110m";
		
	
	
	
	/*
 	* This method sets the narrator's text color.
 	*/
	public void setDaveName() {
		
		//promps the user on what they want their dave's name to be.
		System.out.println("First, name your Dave. (Your input will show as \"(input)dave\") ");
		
		//for user input to be put in.
		String userInput = new String(myReader.next());
			
		//sets dave name.
		daveName = userInput + "dave";
			
			
	}
	
	/*
	 * This method returns the players current name for Dave.
	 */
	public String getDaveName() {
		
		//returns dave name.
		return daveName ;
			
	}	
			
	
	
	/*
	 * This method sets the user's Dave type.
	 */
	public void setDaveType() {
		
		
		//prompts user on what daves they can choose.
		System.out.println(" [1] Dave \n [2] Dead Dave \n [3] Emo Dave \n [4] Sad Dave \n [5] Gangstah Dave");
		
		//for user input
		String userInput = new String(myReader.next());
		
		//creates variable
		int daveString;
	
		//sets davestring equal to whatever number is passed. turns the input into an int.
		if(userInput.equals("1")) {
			
			daveString = 1;	
			
		}
		
		else if(userInput.equals("2")) {
			
			daveString = 2;	
		}
		
		else if(userInput.equals("3")) {
			
			daveString = 3;
		}
		
		else if(userInput.equals("4")) {
			
			daveString = 4;
			
		}
		
		else if(userInput.equals("5")) {
			
			daveString = 5;
			
		}
		
		else {
			
			daveString = -1;
			
		}
		
		//creates string for the for loop to use
		String pDaveOptions = "Dave DeadDave EmoDave SadDave GangstahDave ";
		
		//for loop that finds and defines dave type as the number selected by the user
		for(int i = 1; i < 5; i++) {
			
			//finds the number of the space
			int spaceL = pDaveOptions.indexOf(' ');
			
			//stops the loop and declares davetype as the string
			if (daveString == i) {
				
				daveType = pDaveOptions.substring(0, spaceL);
				
			}
			
			//moves to the next space and loops
			else {
				
				pDaveOptions = pDaveOptions.substring(spaceL + 1);
					
			}
				
			
			
			
			
		}
			
			
			
	}
	
			
	
	/*
	 * This method returns the current dave type of a dave.
	 */
	public String getDaveType() {

		
		return daveType;
		
		
	}
	
	
	/*
	 * this method sets daves ascii art
	 */
	public void setDaveLooks() {
		
		
		//Declaring Dave ASCII art
		String dave = "                                                                                                          \n"
				+ "                                                                                                              \n"
				+ "                                                                                                              \n"
				+ "                                                                                                              \n"
				+ "                                                                     ..                                       \n"
				+ "                                                                @@@@@@.  :@@@*                                \n"
				+ "                                                           .@@@.             .@@                              \n"
				+ "                                                         -@@                   *@                             \n"
				+ "                                                       .@@                      *@                            \n"
				+ "                                                       =@                        @=                           \n"
				+ "                                                       .@                        @@                           \n"
				+ "                                                        @                        @@                           \n"
				+ "                                                        @%       @@          @@@@@#                           \n"
				+ "                                                        @@            .@@@@@@.   @@                           \n"
				+ "                                                        *@            @@           @@=                        \n"
				+ "                                                        =@            @@             .@@@.                    \n"
				+ "                                                        -@             %@@                :@@@.               \n"
				+ "                                                        .@              -@@@@@.             #@                \n"
				+ "                                                        .@             @@      %@@@@@@@@@@@@@                 \n"
				+ "                                                    =@@@@@            @@                                      \n"
				+ "                                              .@@@@.    @@           @@                                       \n"
				+ "                                         :@@@@.         @.           @@                                       \n"
				+ "                                    .@@@+               %             @.                                      \n"
				+ "                                .@@@                                   @                                      \n"
				+ "                             :@@:                                      .@                                     \n"
				+ "                  @@       @@.                                          .@                                    \n"
				+ "                  @@@    @@                                               @:                                  \n"
				+ "                 =@ @@ .@                             @                    @*                                 \n"
				+ "                  @  @@@.                             @                     @                                 \n"
				+ "                +@@  @@ @@@@%:                       =@                     %@                                \n"
				+ "                 @@@     @@@                         @@                      @                                \n"
				+ "                 @ @@   @@                          %@                      .@                                \n"
				+ "              @@ @@       %@@                      =@                        @                                \n"
				+ "               @@@@@        :@#.                  @@                         @                                \n"
				+ "               .@  @:          @@@            .@@@                          +@                                \n"
				+ "                =@                 @@@@@@@@@@@*                             @+                                \n"
				+ "                  @@                                                       @@                                 \n"
				+ "                   =@=                                                    @@                                  \n"
				+ "                     %@@                                                 *@                                   \n"
				+ "                        @@.                                             %@                                    \n"
				+ "                          .@@@.                                       .@@                                     \n"
				+ "                              +@@@.                             . @@@@@                                       \n"
				+ "                                   @@@@@.                  .@@@@#      @@                                     \n"
				+ "                                     @@ . %@@@@@@@@@@@@@@@.   @@@@%%@@@@@@                                    \n"
				+ "                                      @@@           %@@@@                                                     \n"
				+ "                                          @@@@@@@@%=.    .@@@                                                 \n"
				+ "                                                                                                              \n"
				+ "                                                                                                              \n"
				+ "                                                                                                              \n";
		
		String deadDave = "                                                                                                                                                                                       \n"
				+ "                                                                                                              \n"
				+ "                                                  .                                                           \n"
				+ "                                            @@@@@@@@@@@@                                                      \n"
				+ "                                        @@@:     @@@@  .@@                                                    \n"
				+ "                                     +@@          @@@@@@ @@%                                                  \n"
				+ "                                    @@             -@@.@@@@@@                                                 \n"
				+ "                                   @@ @   @           @@@ @.@+                                                \n"
				+ "                                   @  @@@@.             ..@@@@                                                \n"
				+ "                                   @  @@@                   .@                                                \n"
				+ "                                   @    @@         .@   @@   @                                                \n"
				+ "                                  +@ @@..:          *@@@.   .@                                                \n"
				+ "                                  @@@  :@@          @@@.    @@                                                \n"
				+ "                                 -@.      @@@@@@=  =:  @    @                                                 \n"
				+ "                               -@@              @%         @%                                                 \n"
				+ "                        :@@@@@@                .@.        @@                                                  \n"
				+ "                        @@               :@@@@*.         *@                                                   \n"
				+ "                         @@:     +@@@@@@+@@              @                                                    \n"
				+ "                             ..            @            @@                                                    \n"
				+ "                                           @@           @@                                                    \n"
				+ "                                           @@  @@  +@@@@ @=                                                   \n"
				+ "                                           @..@@@@@= @@@* @@                                                  \n"
				+ "                                          @@  #@            .@@@                                              \n"
				+ "                                         @@                     .@@@@                                         \n"
				+ "                                       .@@         @@                 #@@@@                                   \n"
				+ "                                       @@.        @@                  @ #@ .@@                                \n"
				+ "                                      %@@         @                  @ @@     @@                              \n"
				+ "                                     .@  @@       @.                 @@% @.    -@.                            \n"
				+ "                                     @%   .@.:.   @@             .  @@@          @#                           \n"
				+ "                                     @     @@#    .@           @@@.@. .           @%                          \n"
				+ "                                    .@      @*     @             @@@@.             @*                         \n"
				+ "                                    .@      @@     *@          @@@                  @%                        \n"
				+ "                                     @      @@      @@     @%@@ .+                   @:                       \n"
				+ "                                     @@   .@@@@      @*  .@@@@                        @.                      \n"
				+ "                                     .@    @*         @@ .                            @@                      \n"
				+ "                                      @@+@@.            @@                           %@@@                     \n"
				+ "                                      .@@ @:              @@.  .@@      @@        .@@*  @+                    \n"
				+ "                             .@    @@  @%                   -@@@. @@-     @@#  *@@@     .@                    \n"
				+ "                        .@@  @@@--@@@ @ @      @@                %@@@@@@@@@@@@+          @.                   \n"
				+ "                        @@ @@       @ @@@@     @@                                        @@                   \n"
				+ "                        %@      @@.=@ @ @@%  %@ @                                        .@                   \n"
				+ "                        .@       @@@@@=   @@@.  @.                                       .@                   \n"
				+ "                         @+       @.           .@                                         @                   \n"
				+ "                          @:      @@@          #@       .                                @@    +@.            \n"
				+ "                           @@    @@@@@         @.        @@@@                            #@@+ @@              \n"
				+ "                             @@@@@@@@@@@      @#..##      @@@@@@@ @.                      #@@+                \n"
				+ "                                        @@@@@@@@@@@@@.      .  @@@@                       @@@.                \n"
				+ "                                                       @@@@@@.   *@@@@@@:       -@@@@@@@@@                    \n"
				+ "                                                               =@@@@@@@@@@@@@@.                               ";


		
		String emoDave =
				 "                                                                                                              \n"
				+ "                                                                                                              \n"
				+ "                                           .                                                                  \n"
				+ "                                     :@@@@=#@@@@*                                                             \n"
				+ "                                   @@+          =@@                                                           \n"
				+ "                                 -@#              @@@@@@#                                                     \n"
				+ "                                @@.                      @@*                                                  \n"
				+ "                               @@               :@@@.      @%                                                 \n"
				+ "                              .@              :@@   @@@    =@                                                 \n"
				+ "                              @@             @@       :@@   @:                                                \n"
				+ "                             .@             @@          @@  @@                                                \n"
				+ "                             %@            @@            -@=#@                                                \n"
				+ "                             @@    @@. @@  @              *@@@                                                \n"
				+ "                             =@   @@@. @@ @@              @@@@                                                \n"
				+ "                              @@ @@@@@@@@ @@@@@=    +@@   @@                                                  \n"
				+ "                               @@@@.@@@ %@@@.  @@:=@@%@   @@                                                  \n"
				+ "                                @@@      @@@          @@.@@                                                   \n"
				+ "                                 . @@.     @         %@@@@                                                    \n"
				+ "                                    %@     .        @@  @.                                                    \n"
				+ "                                     @@@@@%:@@@   .@@  %@                                                     \n"
				+ "                                        @@    :@@@@    .@ ...                                                 \n"
				+ "                                        @@              .+..:#@@@@@.           @@ @@                          \n"
				+ "                                       @@                          @@@-.     .@@@@@@                          \n"
				+ "                                    .@@@                              =@@@@@@@.   .@                          \n"
				+ "                                  @@@@                        @@@:                 .@%                        \n"
				+ "                               #@@ @@                            =@@@                @@                       \n"
				+ "                             @@#  @@                                 @@%              *@.                     \n"
				+ "                           @@*.  @@                                    %@@              @#                    \n"
				+ "                         .@@     @*                                      :@@             @+                   \n"
				+ "                        +@. .    @.                                        %@:           .@                   \n"
				+ "                       =@   @@   @.                                  :@     .@%           @@                  \n"
				+ "                       @@    +@@.@%    .-=:                       :@@@      .@@.           @.                 \n"
				+ "                       @:       +@@@@@@=. :@@@@@@@@@@#.  .   +@@@@*         @@            .@                  \n"
				+ "                       @@             @@@@.-@@@@@@    -@@@@@@..            @@             @@                  \n"
				+ "                       @@          @@@@@@     =@%.                       @@.              @:                  \n"
				+ "                        @@          @@@@       @@@                     @@:               @@                   \n"
				+ "                         .@@@%.      +@:       @@@@                 .@@.                @@                    \n"
				+ "                              -*@@@@@+           @@=              @@@                  @@                     \n"
				+ "                                 @@                @@@@       +@@@.                   @@                      \n"
				+ "                                  @@                   +@@@@@=.                     :@@                       \n"
				+ "                                   @@                                              @@                         \n"
				+ "                                    -@.                                         :@@.                          \n"
				+ "                                   .@@@@+                                    +@@@                             \n"
				+ "                                  @@    :@@@@+. .                       *@@@@:                                \n"
				+ "                                   @@:      . %@@@@@@@@@@@@@@@@@@@@@@@@#                                      \n"
				+ "                                     =@@@@@@@%.           @@@       @@.                                       \n"
				+ "                                                         .@#  .@@@@%                                          \n"
				+ "                                                           .@#.                                               \n"
				+ "                                                                                                              \n"
				+ "                                                                                                              \n";
		
		
		String sadDave =

				 "                                                                                                              \n"
				+ "                                                                                                              \n"
				+ "                                                                                                              \n"
				+ "                                                                                                              \n"
				+ "                                                                                                              \n"
				+ "                                           @@@@@@@@@@@@@=*@@@@@@.                                             \n"
				+ "                                       @@@                      @@@                                           \n"
				+ "                                   .@@#                            @@@                                        \n"
				+ "                                 .@@                                 *@.                                      \n"
				+ "                               #@@.                                    @@                                     \n"
				+ "                             @@*                                        .@+                                   \n"
				+ "                           .@-                                            @@                                  \n"
				+ "                          @@                                               @@                                 \n"
				+ "                         @@                                                 @@                                \n"
				+ "                        @#                                                   @.                               \n"
				+ "                       @@                                                     @                               \n"
				+ "                      @@                                                      @@                              \n"
				+ "                     @@.                                   =                   @@                             \n"
				+ "                    .@                                     @.                   %@@ .                         \n"
				+ "                    @@                                    .@                        -%@@@@@@.                 \n"
				+ "                    @       @@@@@@@@                      @@                                =@%               \n"
				+ "                   @@   .@@@.                             @            @@                     @@              \n"
				+ "                   @@ @@@                                @+           @%@@                     :@             \n"
				+ "                  @@@@.                                 @=           @- +@                      .@            \n"
				+ "                   @@@%@@                             .@:               .@                      .@@           \n"
				+ "                  %@@@@+                             @@                 #@                       .@           \n"
				+ "                  @@@*     @@                      %@*                  @@@                       @           \n"
				+ "                  @. @@@@@@                     .@@.                   .@.@        @@             @.          \n"
				+ "                  @.   @@*                   +@@=                      @@ @@      +..        @@@@%@           \n"
				+ "             .@@.@@       @@@@-        *@@@@+                         .@   @@              @@   @@            \n"
				+ "           @@@@@               .-...::                                @.    .@@@.    #@@@@@%    #@            \n"
				+ "            -@@+                                                    -@           ..@@@.          @            \n"
				+ "           %@@@+. :%@@@@@@@@@@%                                    +@                 .@@=       @@           \n"
				+ "                               @@@                               .@@                     @@#      @%          \n"
				+ "                                  @@@.                         @@@                         @@      @@         \n"
				+ "                                   @@.@@@+                 +@@@                             .@@     .@*.      \n"
				+ "                                    #@   ..@@@@@@@@@@@@@@@. .:@@#                             .@@     @@.     \n"
				+ "                                      @%%     %@      .@@@      .@@                              @@    .@=    \n"
				+ "                                       :  @@@@@:@         @@@@@+@@@@@                              @@@@@*     \n"
				+ "                                              .*@*             @@                                             \n"
				+ "                                                                                                              \n";

		String gangstahDave = "dave maze:\n"

				+ "                                                                                                                                                                                                             \n"
				+ "                                                                                                              \n"
				+ "                                                                                                              \n"
				+ "                                                                                                              \n"
				+ "                                                                                                              \n"
				+ "                                      .@@@@@@@@@@                                                             \n"
				+ "                                    @@           .@@@                                                         \n"
				+ "                                  .@*                -@@                                                      \n"
				+ "                                 @@%@@                  @@                                                    \n"
				+ "                                 @    @@@                @@                                                   \n"
				+ "                                .@        @@@%            @                                                   \n"
				+ "                                 @ @          .@@@@@@@@%@@@@@@-                                               \n"
				+ "                                 @@@@.                    @@   @@*                                            \n"
				+ "                                =@   @@       =@@.       @@@@ @@*.@*                                          \n"
				+ "                          ..%@@@.      @@@.              @  #@.@ =@@@.                                        \n"
				+ "                      .@                   #@@          =@   @@:     @                                        \n"
				+ "                       @@              ..@@@@@          +@                                                    \n"
				+ "                         +@@@@@@@@@@@@@+-@.              @                                                    \n"
				+ "                                          @@             @%                                                   \n"
				+ "                                           :@             @                                                   \n"
				+ "                                            @              @@@@%                                              \n"
				+ "                                 .@@@@@@%:@@             @@ @ -@                                              \n"
				+ "                            @@@@        @@               @@ #@@ @@                                            \n"
				+ "                         @@+         :@@.         +@@#@@@@        @@                                          \n"
				+ "                       @@           @@*@.        @@ #@@.            @@                                        \n"
				+ "                     +@            -@@@@ @@@@@@@@@@@@-@              .@+                                      \n"
				+ "                    @@              @   .%@@@@+      @%                @@                                     \n"
				+ "                   @@              @@     @@.        @.                  @:                                   \n"
				+ "                  @@               @   .@@@@         @                    @@                                  \n"
				+ "                 @@              @@@   @    @@       @                     @@                                 \n"
				+ "                 @            @@@ @@  .@@@@@@@@      @                      @@                                \n"
				+ "                @@  @@  @@@@@:    @@  @@@@.@.@.      @+                      %@                               \n"
				+ "                @ @@@@@@          @@  @+@@+ *@       .@                       =@        @@                    \n"
				+ "               @@@:               -@  :@@@@@          @@                       @@   @- @@@                    \n"
				+ "                                   @                   @%                       @@@@@#@@@                     \n"
				+ "                                   .@                   @@                       @. @. @@                     \n"
				+ "                                    -@                   :@.                     @     @                      \n"
				+ "                                      @@                   %@*                 =@@    @.                      \n"
				+ "                                        @@                    @@-      @@@@@@@:      @.                       \n"
				+ "                                          @@@                    @@@@@@@@@.       @@@                         \n"
				+ "                                   .#@@@@@@@@@@-                             @@@@.                            \n"
				+ "                                 +@             @@@.                      .@@                                 \n"
				+ "                                  @@@          .@@@%@@@:           ..%@@@@                                    \n"
				+ "                                      @@@@@@@%          @@.:=*..   @                                          \n"
				+ "                                                      .@         %@                                           \n"
				+ "                                                       @@       @@                                            \n"
				+ "                                                         +@@@@@@                                              \n"

				+ "                                                                                                              ";
		
		//sets the ascii art to the dave looks and dave type
		if(daveType.equals("Dave")) {
			
			daveLooks = dave;
		
		}
		
		else if(daveType.equals("DeadDave")) {
		
			daveLooks = deadDave;
		
		}
		
		else if(daveType.equals("EmoDave")) {
			
			daveLooks = emoDave;
			
		}
		
		else if(daveType.equals("SadDave")) {
			
			daveLooks = sadDave;
			
		}
		
		else if(daveType.equals("GangstahDave")) {
			
			daveLooks = gangstahDave;
			
		}
		
		//failsafe, i dont think its needed
		else {
			
			daveLooks = "error";
			
		}
		
		
		
		
		
	}
	
	/*
	 * This method returns what dave looks like depending on the dave type.
	 */
	public String getDaveLooks() {
		
		return daveLooks;
		
	}
	
	
	/*
	 * This method sets the narrators text color.
	 */
	public void setNarratorTextColor() {
			
		//prompts the user on how to choose from the choices.
		System.out.println("Now we will move on to visuals. Enter the number of the text color that would best suit your dave's NARRATOR:");
		System.out.println("(Note that narrator text will always be shown in " + DEFAULT + ITALICS + "ITALICS)" + DEFAULT);
		System.out.println();
		
		//Prints the choices of text color
		System.out.println("[1]" + IRED + " RED \n" + DEFAULT + "[2] " + IORANGE + "ORANGE \n" + DEFAULT + "[3] " + IYELLOW + "YELLOW \n"
				+ DEFAULT + "[4] " + IGREEN + "GREEN \n" + DEFAULT+ "[5] " + IBLUE + "BLUE \n" + DEFAULT + "[6] " + IPURPLE + "PURPLE \n"
				+ DEFAULT + "[7] " + IPINK + "PINK" + DEFAULT);
		
		
		//allowes for user input
		String userColor = new String(myReader.next());

		
		
			//sets the narrators user color based off of the users input
			if(userColor.equals("1")) {
	
				nTextColor = IRED;
				
			}
			
			if(userColor.equals("2")) {
				
				nTextColor = IORANGE;
			}
			
			if(userColor.equals("3")) {
				
				nTextColor = IYELLOW;
			}
			
			if(userColor.equals("4")) {
				
				nTextColor = IGREEN;
			}
			
			if(userColor.equals("5")) {
				
				nTextColor = IBLUE;
			}
			
			if(userColor.equals("6")) {
				
				nTextColor = IPURPLE;
			}
			
			if(userColor.equals("7")) {
				
				nTextColor = IPINK;
			}
		
			
		
	}
	
	/*
	 * This method prints the narrator's current color (getter).
	 */
	public String getNarratorTextColor() {
		
		//makes string variable
		String showColorChoice = "";
		
		//sets the name of the color and sets show color choice to the narrator color.
		if(nTextColor == IRED) {
			
			showColorChoice = IRED;
			nColor = "RED";
			
		}
		
		if(nTextColor == IORANGE) {
			
			showColorChoice = IORANGE;
			nColor = "ORANGE";
			
		}
		
		if(nTextColor == IYELLOW) {
			
			showColorChoice = IYELLOW;
			nColor = "YELLOW";
			
		}
		
		if(nTextColor == IGREEN) {
			
			showColorChoice = IGREEN;
			nColor = "GREEN";
			
		}
		
		if(nTextColor == IBLUE ) {
			
			showColorChoice = IBLUE;
			nColor = "BLUE";
			
		}
		
		if(nTextColor == IPURPLE) {
			
			showColorChoice = IPURPLE;
			nColor = "PURPLE";
			
		}
		
		if(nTextColor == IPINK) {
			
			showColorChoice = IPINK;
			nColor = "PINK";
			
		}
		
		
		return showColorChoice;
		
	}
	
	/*
	 * This method returns the name of the color of the narrators color.
	 */
	public String getNColorName() {
		
		return nColor;
	}
	
	
	/*
	 * This method sets the users input text color.
	 */
	public void setInputTextColor() {
			
		//prompts the user of how to choose
		System.out.println("Please enter the number of the text color that would best suit your dave's INPUT color:");
		System.out.println();
		
		//prints the choices of colors the player gets
		System.out.println("[1]" + RED + " RED \n" + DEFAULT + "[2] " + ORANGE + "ORANGE \n" + DEFAULT + "[3] " + YELLOW + "YELLOW \n"
				+ DEFAULT + "[4] " + GREEN + "GREEN \n" + DEFAULT+ "[5] " + BLUE + "BLUE \n" + DEFAULT + "[6] " + PURPLE + "PURPLE \n"
				+ DEFAULT + "[7] " + PINK + "PINK" + DEFAULT);
		
		
		//allows for player input
		System.out.print(BLUEBLUE);
		String userColor = new String(myReader.next());
		System.out.println(DEFAULT);
		
		
			//sets the input text color with the users choice
			if(userColor.equals("1")) {
	
				iTextColor = RED;
				
			}
			
			if(userColor.equals("2")) {
				
				iTextColor = ORANGE;
			}
			
			if(userColor.equals("3")) {
				
				iTextColor = YELLOW;
			}
			
			if(userColor.equals("4")) {
				
				iTextColor = GREEN;
			}
			
			if(userColor.equals("5")) {
				
				iTextColor = BLUE;
			}
			
			if(userColor.equals("6")) {
				
				iTextColor = PURPLE;
			}
			
			if(userColor.equals("7")) {
				
				iTextColor = PINK;
			}
		
		
	}
	
	/*
	 * This method prints the narrators current color (getter).
	 */
	public String getInputTextColor() {
		
		//declares variable
		String showColorChoice = "";
		
		//declares variableto print the color
		String colorName = "color";
		
		
		//sets the text color to showcolorchoice and icolor.
		if(iTextColor == RED) {
			
			showColorChoice = RED;
			iColor = "RED";
			
		}
		
		if(iTextColor == ORANGE) {
			
			showColorChoice = ORANGE;
			iColor = "ORANGE";
			
		}
		
		if(iTextColor == YELLOW) {
			
			showColorChoice = YELLOW;
			iColor = "YELLOW";
			
		}
		
		if(iTextColor == GREEN) {
			
			showColorChoice = GREEN;
			iColor = "GREEN";
			
		}
		
		if(iTextColor == BLUE ) {
			
			showColorChoice = BLUE;
			iColor = "BLUE";
			
		}
		
		if(iTextColor == PURPLE) {
			
			showColorChoice = PURPLE;
			iColor = "PURPLE";
			
		}
		
		if(iTextColor == PINK) {
			
			showColorChoice = PINK;
			iColor = "PINK";
			
		}
		
		return showColorChoice;
	
	}
	
	
	/*
	 * This method returns the name of the input text color.
	 */
	 public String getIColorName() {
		
		return iColor;
	}
	
	/*
	 * This method prints all the info of the attributes of a certain dave.
	 */
	 public void getPlayerDaveInfo() {
		
		System.out.println("Summary of your choices:");
		
		System.out.println(" Dave Name: " + daveName);
		
		System.out.println(" Dave Type: " + daveType);
		
		System.out.println(" Player input text color: " + iTextColor + iColor + DEFAULT);
		
		System.out.println(" Narrator text color: " +  nTextColor + nColor + DEFAULT);
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	}

	
	
	
	
}
