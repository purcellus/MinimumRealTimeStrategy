package minrts.graphicuserinterface.sidebar;

import java.awt.event.ActionListener;

import javax.swing.JPanel;

public abstract class SidebarAbstract extends JPanel
{
	/*This interface deals with how to make units and structures.
	 * It should also show vital information, such as current money.
	 * It can also show the map, and have certain GUI options (sell, repair, etc).
	 * I imagine it will take up a JFrame or JPanel like approach.
	 * It has to be an abstract class, in order to extend JPanel
	 */
	
	//TODO figure out how to make the menu.  Factory?
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public void factorySidebar()
	{
		
	}
	
	
	public void addListenerTo(ActionListener thelistener)
	{
		
	}
}
