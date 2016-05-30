package minrts.gameobjectcollection.gameobject;

public interface PositionInterface 
{
	/*Handles object location and how objects move.
	 * Also will handle collisions, since collisions are just checking positions w/ offsets.
	 */
	public int setXPosition();
	public int getXPosition();
	public int setYPosition();
	public int getYPosition();
	
	/*PositionInterface also has AffineTransforms.
	 * 	translate:  like shifting position.
	 *	rotate:  like rotating the sprite itself
	 *	scale:  like increasing or decreasing size
	 *	resetTransform:  Resets back to initial transform.
	 */
	public void translate(double translatex, double translatey);
	public void rotate(double theta);
	public void scale(double scalex, double scaley);
	public void resetTransform();
	
	/*Simple function to move a piece, relative to speedx and speedy.
	 * 
	 */
	public void move();
	
	public boolean hasCollided(PositionInterface otherobject);//check if collision occurred, based on hitboxes.
	public void handleCollision(PositionInterface otherobject);//if collision occurred, handle it.  50 dkp minus.
	public boolean alreadyCollided();//checks to see if the other object has been checked already.
}
