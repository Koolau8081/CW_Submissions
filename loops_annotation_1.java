/*
	 *This method is passed the number version of a month(1 - 12)
	 * and returns which month of the year it is in word form. 
	*/
	public static String getMonth(int n)
		{
			//This instantiates the string named months and declares as all the months of the year written out. 
			String months = "January February March April May June "
					+ "July August September October November December ";

	    //This loop declares "i as 1 to start with, checks if i is equal or less than 12, then adds 1 to i.
			for (int i = 1; i <= 12; i++)
			{
				//Instantiates sL(space location) and declares it as the number of the character " ". 
				int sL = months.indexOf(' ');

	    		//checks if the number that was passed is equal to i.
				if (n == i)
				{
	        //returns the first word in the string months.
					return months.substring(0, sL);
				}
	      		
				//This is run if the number passed is anything besides what i equals at the time.	
				else
				{
	        //declares months as everything after the first space.
					months = months.substring(sL + 1);
				}
			}
			
			//returns if the number passed is anything more than 12.
			return "The number passed must be greater than 0 and equal or less than 12";
			
		}
