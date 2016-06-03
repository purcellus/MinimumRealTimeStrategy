package minrts;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import minrts.gamecontrols.GameControlsAbstract;
import minrts.graphicuserinterface.WholeScreenAbstract;

public class GameControllerOfMVC implements ActionListener
{
	/*Designed to be the master of all, holding the essentials needed.
	 * Mostly will just be user interface and game controls
	 * Idea:  Running over units grants health.
	 * This will be the controller of the MVC, the thing to read inputs
	 * and grabbing commands, attaching them to the gui 
	 */


	private GameControlsAbstract thecontrols;
	private WholeScreenAbstract thegui;
	
	
	/*constructor
	 * guiwidth:  width of visual representation of ALL things in the game.
	 * guiheight:  height of visual representation 
	 * 
	 */
	public GameControllerOfMVC(int guiwidth, int guiheight, GameControlsAbstract mycontrols, WholeScreenAbstract mygui)
	{
		thecontrols = mycontrols;//set controls
		thegui = mygui;//set gui
		thegui.setSize(guiwidth, guiheight);//based on user input, set entire gui size.
		
	}


	/*Add the action listener (this) to the things that need to be listening.
	 * ex. Buttons, menu items, etc.
	 */
	public void attachListeners()
	{
		
		
	}
	
	
	//ActionEvent: I think this is the actual input
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//here, we would simply pick a command at the command level.
		thecontrols.doCommand(e);
	}
	
	
	
	
	


}
