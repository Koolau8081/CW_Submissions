
public class GameTile {

	//attributes
	private boolean hasPlayer;

	private boolean isRevealed;

	private boolean isWall;
	
	
	
	//constructor
	public GameTile() {
		
		hasPlayer = false;
		
		isRevealed = false;
		
		isWall = false;
		
	}
	
	
	//functions
	
	/*
	 * not sure what this is actually for
	 */
	public String toString() {

		return "yes";
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
