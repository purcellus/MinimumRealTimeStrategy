//Made By Austin Purcell

package minrts;

import minrts.gamecontrols.GameControlsAbstract;
import minrts.gamecontrols.GameControlsModern;
import minrts.graphicuserinterface.WholeScreenAbstract;
import minrts.graphicuserinterface.WholeScreenModern;

public class Starter 
{

	/*This is what the user can change:  the screen and the commands to give.
	 * Highly modular.
	 */
	public static void main(String[] args)
	{
		//start by setting up game 
		GameControlsAbstract mycontrols = new GameControlsModern();//set up the commands and controls
		WholeScreenAbstract myscreen = new WholeScreenModern();//set up the GUI
		GameControllerOfMVC mygame = new GameControllerOfMVC(800, 600, mycontrols, myscreen);
		mygame.toString();//signifies that the game ended.  Also removes warning from eclipse.
	}
}
