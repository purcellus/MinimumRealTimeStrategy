package minrts.gamecontrols;

import java.awt.event.ActionEvent;

public abstract class GameControlsAbstract 
{
	/*This will effectively be the true controller, managing the controls (user inputs and results)
	 * This holds the controls of the game:  right click to move,
	 * Left click to select, etc.
	 * commands should extend AbstractAction, doing the command pattern.
	 */
	
	
	//make the list of commands
	public void factoryCommands()
	{
		
	}
	
	/*do a command based on user input
	 * ActionEvent is passed from GameControllerOfMVC, usually.
	 */
	public void doCommand(ActionEvent e)
	{
		
	}
}
