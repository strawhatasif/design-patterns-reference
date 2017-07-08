package casestudy.useractions;

import java.util.Queue;

public class ScreenOne {

	// references the actions queue
	private Queue<UserAction> actionQueue;
	
	public ScreenOne(Queue<UserAction> actionQueue)
    {
		this.actionQueue = actionQueue;
	}
	
	/**
	 * We simulate the user wanting to print something on the screen
	 */
	public void simulateUserAction()
	{
		PrintUserAction action = new PrintUserAction("SCREEN ONE ACTION");
		actionQueue.add(action);
	}
	
}
