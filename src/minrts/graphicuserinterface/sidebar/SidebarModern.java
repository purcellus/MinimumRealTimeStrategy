package minrts.graphicuserinterface.sidebar;

import java.awt.GridLayout;

import javax.swing.JButton;

public class SidebarModern extends SidebarAbstract
{
	/*An implementation of Sidebar.
	 * Modern Sidebar will show the GUI buttons for the modern(atomic) look and feel.
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int SIDEBARWIDTH;
	private int SIDEBARHEIGHT;
	private int GRIDROWS = 8;
	private int GRIDCOLUMNS = 4;
	
	public SidebarModern()
	{
		SIDEBARWIDTH = 100;
		SIDEBARHEIGHT = 400;
		this.setSize(SIDEBARWIDTH, SIDEBARHEIGHT);
		factorySidebar();
	}
	
	/*Sidebar will be a Grid Layout, 4 x 8.
	 * This will show all of the stuff that a player can build
	 * TODO be able to add icons:  JButton(text, icon).
	 */
	@Override
	public void factorySidebar()
	{
		this.setLayout(new GridLayout(GRIDROWS, GRIDCOLUMNS));
		JButton[][] listofbuttons = new JButton[GRIDROWS][GRIDCOLUMNS];//list of buttons.
		JButton conyardbutton = new JButton("Build Construction Yard");//construction yard.
		listofbuttons[0][0] = conyardbutton;
		JButton powerplantbutton = new JButton("Build Power Plant");// power plant.
		listofbuttons[0][1] = powerplantbutton;		
		JButton barracksbutton = new JButton("Build Barracks");//barracks
		listofbuttons[0][2] = barracksbutton;		
		JButton turretanti_infantrybutton = new JButton("Build Turret Anti Infantry");//turret anti infantry.
		listofbuttons[0][3] = turretanti_infantrybutton;
		
		//add buttons to GridLayout.
		//TODO might just do "for ( JButton : listofbuttons )".
		for (int rowcounter = 0; rowcounter < GRIDROWS;  rowcounter++)
		{
			for (int columncounter = 0; columncounter < GRIDCOLUMNS; columncounter++)
			{
				//TODO See if we can construct buttons from somewhere other than here.
				if (listofbuttons[rowcounter][columncounter] == null)
				{//if the button doesn't exist, put a placeholder.
					listofbuttons[rowcounter][columncounter] = new JButton();
				}
				this.add(listofbuttons[rowcounter][columncounter]);//add the button to the JPanel.
			}
		}
		
	}
}
