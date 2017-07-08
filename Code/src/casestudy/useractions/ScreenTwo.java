package casestudy.useractions;

import java.util.Queue;

public class ScreenTwo {

	private Queue<UserAction> actionQueue;
	
	public ScreenTwo(Queue<UserAction> actionQueue)
	{
		this.actionQueue = actionQueue;
	}
	
	public void simulateUserAction()
    {
		PrintUserAction action = new PrintUserAction("SCREEN TWO ACTION");
		actionQueue.add(action);
	}
	
}
