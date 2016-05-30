package minrts.gameobjectcollection.gameobject;

import java.awt.Graphics;

public interface DrawableInterface extends PositionInterface 
{

	/*Handles how objects are drawn
	 * May need AffineTransform, so I extended positioninterface.
	 */
	public void draw(Graphics mygraphics);//draw on the screen
	
	//TODO may use Strategy pattern to be able to change gameobject skins on the fly.
	//Builder maybe, too.
	
	//public Color getColor();
}
