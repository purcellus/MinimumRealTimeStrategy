package minrts.graphicuserinterface;

import java.awt.BorderLayout;

import minrts.graphicuserinterface.mainscreen.MainScreenAbstract;
import minrts.graphicuserinterface.mainscreen.MainScreenModern;
import minrts.graphicuserinterface.sidebar.SidebarAbstract;
import minrts.graphicuserinterface.sidebar.SidebarModern;

public class WholeScreenModern extends WholeScreenAbstract
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int GUIWIDTH;
	private int GUIHEIGHT;

	//Similar to "Game" From minshmup
	
	public WholeScreenModern()
	{
		this.setVisible(true);
		this.setTitle("MinimumRealTimeStrategy");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//TODO figure out if this will end the program.
		//this.pack();//basically makes all panels and stuff seeable, based on their size, etc.
		
		
		
		//Make the components here.
		factoryWholeScreen();
		this.setSize(1200, 600);
	}
	
	
	
	/*Design the UI for this JFrame
	 * ContentPane, all that.
	 */
	
	@Override
	public void factoryWholeScreen() 
	{
		
		this.setLayout(new BorderLayout());
		
		SidebarAbstract modernsidebar = new SidebarModern();
		MainScreenAbstract modernmainscreen = new MainScreenModern();
		
		///this.add(modernmainscreen, BorderLayout.CENTER);
		this.add(modernsidebar, BorderLayout.EAST);
		
	}//the standard whole screen.

	
	
	
	
	
	
}
