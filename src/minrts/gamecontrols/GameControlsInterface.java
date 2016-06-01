package minrts.gamecontrols;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public interface GameControlsInterface extends ActionListener, KeyListener
{
	/*This holds the controls of the game:  right click to move,
	 * Left click to select, etc.
	 * commands should extend AbstractAction, doing the command pattern.
	 */
}
