package minrts.graphicuserinterface.menu;

import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

public class TopMenuModern extends TopMenuAbstract
{
	
	/*A class to making the topmenu
	 * 
	 */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public TopMenuModern()
	{
		factoryTopMenu();
	}
	
	
	@Override
	public void factoryTopMenu()
	{
		JMenuItem filemenuitem = new JMenuItem("File");
		this.add(filemenuitem);
		JMenuItem optionmenuitem = new JMenuItem("Options");
		this.add(optionmenuitem);
		
		//TODO add these to optionmenu as a submenu, or remove options menu.
		JMenuItem soundmenu = new JMenuItem("Sounds");
		this.add(soundmenu);
	}
	
	@Override
	public void addListenerTo(ActionListener thelistener)
	{
		
	}
}
