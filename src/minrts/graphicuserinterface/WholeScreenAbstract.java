package minrts.graphicuserinterface;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import minrts.graphicuserinterface.mainscreen.MainScreenAbstract;
import minrts.graphicuserinterface.menu.TopMenuAbstract;
import minrts.graphicuserinterface.sidebar.SidebarAbstract;

public abstract class WholeScreenAbstract extends JFrame
{
	/*An interface dealing with the entirety of the game's visuals.
	 * One Panel will be for the mainscreen.
	 * Another Panel will be for the sidebar.
	 * Another potential Panel will be for the chatbox.
	 */
	
	/**
	 * 
	 */
	
	
	private SidebarAbstract mysidebar;//buttons to press
	private MainScreenAbstract  mymainscreen;//main screen and visuals.
	private TopMenuAbstract  mytopmenu;//top menu
	
	private static final long serialVersionUID = 1L;

	/*build the entire screen's dependencies (ex. sidebar).
	 * 
	 */
	public void factoryWholeScreen
	(
		TopMenuAbstract mytopmenu,
		MainScreenAbstract mymainscreen, 
		SidebarAbstract mysidebar
	)
	{
		//set layout.
		this.setLayout(new BorderLayout());

		//get parameters
		this.mytopmenu = mytopmenu;
		this.mymainscreen = mymainscreen;
		this.mysidebar = mysidebar;

		//use parameters for putting into the layout.
		this.add(mytopmenu, BorderLayout.NORTH);
		this.add(mymainscreen, BorderLayout.CENTER);
		this.add(mysidebar, BorderLayout.EAST);

	}
	
	public SidebarAbstract getSidebar()
	{
		return mysidebar;
	}
	
	public MainScreenAbstract getMainScreen()
	{
		return mymainscreen;
	}
	
	public TopMenuAbstract mytopmenu()
	{
		return mytopmenu;
	}
	
}
