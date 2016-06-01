package minrts.graphicuserinterface.mainscreen;

public class MainScreenModern extends MainScreenAbstract
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*An atomic implementation of the main screen.
	 * I don't think there will be too many main screens...
	 */
	private int MAINSCREENWIDTH;
	private int MAINSCREENHEIGHT;
	
	//constructor.
	public MainScreenModern()
	{
		MAINSCREENWIDTH = 600;
		MAINSCREENHEIGHT = 400;
		this.setSize(MAINSCREENWIDTH, MAINSCREENHEIGHT);
		this.setVisible(true);
		
		
		
	}
	
	
	
	
}
