package production;

public class PlayerCountException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PlayerCountException(){
		super("Invalid number of players.");
	}

}
