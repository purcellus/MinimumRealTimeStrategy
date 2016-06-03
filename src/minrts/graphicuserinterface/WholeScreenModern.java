package minrts.graphicuserinterface;

import java.awt.BorderLayout;

import minrts.graphicuserinterface.mainscreen.MainScreenAbstract;
import minrts.graphicuserinterface.mainscreen.MainScreenModern;
import minrts.graphicuserinterface.menu.TopMenuAbstract;
import minrts.graphicuserinterface.menu.TopMenuModern;
import minrts.graphicuserinterface.sidebar.SidebarAbstract;
import minrts.graphicuserinterface.sidebar.SidebarModern;

public class WholeScreenModern extends WholeScreenAbstract
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	//Similar to "Game" From minshmup
	
	public WholeScreenModern()
	{
		this.setVisible(true);
		this.setTitle("MinimumRealTimeStrategy");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//TODO figure out if this will end the program.
		//this.pack();//basically makes all panels and stuff seeable, based on their size, etc.
		
		SidebarAbstract modernsidebar = new SidebarModern();
		MainScreenAbstract modernmainscreen = new MainScreenModern();
		TopMenuAbstract moderntopmenu = new TopMenuModern();
		
		//Make the components here.  Use the parent's method to make the stuff.
		super.factoryWholeScreen(moderntopmenu, modernmainscreen, modernsidebar);
	}
	

		

	
	
	
	
	
	
}
