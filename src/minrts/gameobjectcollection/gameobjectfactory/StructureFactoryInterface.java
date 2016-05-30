package minrts.gameobjectcollection.gameobjectfactory;

import minrts.gameobjectcollection.gameobject.structure.*;//Import all gameobjects.

//An interface to create gameobjects of type structures.  
public interface StructureFactoryInterface 
{

	/*All of these are mandatory for each abstract factory or concrete factory that implements this.
	 * The abstract factory or concrete factory will, of course, actually have the code for them.
	 */
	public Structure factoryConstructionYard(int centerpositionx, int centerpositiony);
	public Structure factoryPowerPlant(int centerpositionx, int centerpositiony);
	public Structure factoryRefinery(int centerpositionx, int centerpositiony);
	public Structure factoryDefenseAntiInfantry(int centerpositionx, int centerpositiony);
	public Structure factoryProductionInfantry(int centerpositionx, int centerpositiony);
	
	
}
