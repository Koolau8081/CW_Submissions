
public class GameTile {


	//attributes
	private boolean hasPlayer = false;

	private boolean isRevealed = false;

	private boolean isWall = false;
	
	
	
	//constructor
	public GameTile(boolean p, boolean r, boolean w) {
		
		hasPlayer = p;
		
		isRevealed = r;
		
		isWall = w;
		
	}
	
	//colors for use
	static String DEFAULT = "\033[0m";
	static String RED = "\033[38;5;210m";		
	static String GREEN = "\033[38;5;156m";
	static String BLUE = "\033[38;5;117m";	

	
	
	
	//functions
	
	/*
	 * not sure what this is actually for
	 */
	public String toString() {
		
	
		if(isRevealed) {
			
			if(hasPlayer) {
				
				return BLUE + " * " + DEFAULT;
			}
			
			if(isWall) {
				
				return RED + " # " + DEFAULT;
			}
			
			if(!hasPlayer) {
				
				return GREEN + " # " + DEFAULT;
			}
		}
		
		return DEFAULT + " # ";
	}
	
	/*
	 * This method is for checking if a space has the player
	 */
	public boolean getHasPlayer() {
		
		return hasPlayer;
	}
	
	/*
	 * this method is for checking if the space is revealed
	 */
	public boolean getIsRevealed() {
		
		return isRevealed;
	}
	
	/*
	 * This method is for checking if the space is a wall
	 */
	public boolean getIsWall() {
		
		return isWall;
	}
	
	/*
	 * This method is for telling computer the space has player on it
	 */
	public void setHasPlayer(boolean status) {
		
		hasPlayer = status;
		
	}
	
	/*
	 * This method is for telling computer the space is revealed
	 */
	public void setIsRevealed(boolean status) {
		
		isRevealed = status;
	}
	
	/*
	 * This method is for telling computer there is a wall at this space
	 */
	public void setIsWall(boolean status) {
		
		isWall = status;
	}
	
	
	
}
