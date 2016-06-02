//Made By Austin Purcell

package minrts;

import minrts.graphicuserinterface.WholeScreenAbstract;
import minrts.graphicuserinterface.WholeScreenModern;

public class Starter 
{

	public static void main(String[] args)
	{
		//start by setting up game 
		WholeScreenAbstract myscreen = new WholeScreenModern();
		Game mygame = new Game(800, 600, null, myscreen);
		
	}
}
