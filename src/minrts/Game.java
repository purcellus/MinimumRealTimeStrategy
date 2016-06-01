package minrts;

import minrts.gamecontrols.GameControlsInterface;
import minrts.graphicuserinterface.WholeScreenAbstract;

public class Game
{
	/*Designed to be the master of all, holding the essentials needed.
	 * Mostly will just be user interface and game controls
	 * Idea:  Running over units grants health.
	 */


	private GameControlsInterface thecontrols;
	private WholeScreenAbstract thegui;
	
	
	/*constructor
	 * guiwidth:  width of visual representation of ALL things in the game.
	 * guiheight:  height of visual representation 
	 * 
	 */
	public Game(int guiwidth, int guiheight, GameControlsInterface mycontrols, WholeScreenAbstract mygui)
	{
		thecontrols = mycontrols;
		thegui = mygui;
		
		
	}
	
	
	
	
	


}
