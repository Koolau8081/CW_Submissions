
public class Player {
	
	//attributes
	private int rPos;
	
	private int cPos;
	
	
	
	//constructor
	public Player() {
		
		rPos = 0;
	
		cPos = 0;
		
	}
	
	
	//functions
	
	/*
	 * This method is for getting the position of both coordinates
	 */
	public int[] getPos() {
		
		int[] pos = {rPos, cPos};
			
		return pos;
	}
	
	/*
	 * This method sets the r position
	 */
	public void setrPos(int rNew) {
		
		rPos = rNew;	
	}
	
	
	/*
	 * This method sets the c position
	 */
	public void setcPos(int cNew) {
		
		cPos = cNew;
	}
	
	
	/*
	 * This method gets the r position
	 */
	public int getrPos() {
		
		return rPos;
	}
	
	
	/*
	 * This method returns the c position
	 */
	public int getcPos() {
		
		return cPos;
	}

}
