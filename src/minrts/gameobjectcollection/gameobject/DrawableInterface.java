package minrts.gameobjectcollection.gameobject;

import java.awt.Graphics;

public interface DrawableInterface extends PositionInterface 
{

	/*Handles how objects are drawn
	 * May need AffineTransform, so I extended positioninterface.
	 * Effectively, everything that is drawable has a position.
	 * A possible exception is the menu for clicking buildings/units.
	 */
	public void draw(Graphics mygraphics);//draw on the screen
	
	//TODO may use Strategy pattern to be able to change gameobject skins on the fly.
	//Builder maybe, too.
	
	//public Color getColor();
}
