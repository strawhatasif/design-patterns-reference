package casestudy.useractions;

/**
 * The user action class acts as a base class to capture user interaction
 *
 */
public interface UserAction {

	/**
	 * Whenever a user performs an action, this method must be executed.
	 */
	void performAction();
	
	/**
	 * When the user wants to undo their action, this method will undo the previous action.
	 * 
	 */
	void undo();
	
}
