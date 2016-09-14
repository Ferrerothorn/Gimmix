package geneticEmblem.units.factory;

import java.util.ArrayList;

import geneticEmblem.units.generated.*;

public class ClassList {

	ArrayList<Unit> releasedClasses = new ArrayList<Unit>();

	public ClassList() {

	//	releasedClasses.add(new Cannoneer());
		//releasedClasses.add(new Mihile());
		releasedClasses.add(new Tarmogoyf());
		
		releasedClasses.add(new Scarecrow());
		releasedClasses.add(new Incinerator());
		releasedClasses.add(new BlueMage());
		releasedClasses.add(new Cremator());
		releasedClasses.add(new Trapper());
		releasedClasses.add(new Aran());
		releasedClasses.add(new Beginner());
		releasedClasses.add(new Monk());
		releasedClasses.add(new Entombed());
		releasedClasses.add(new PortalMage());
		releasedClasses.add(new Kaiser());
		releasedClasses.add(new MagnetMage());
		releasedClasses.add(new ConduitMage());
		releasedClasses.add(new Noble());
		releasedClasses.add(new Brigand());
		releasedClasses.add(new Saint());
		releasedClasses.add(new Lancemaster());
		releasedClasses.add(new Crossbowman());
		releasedClasses.add(new Buccaneer());
		releasedClasses.add(new Gunmaster());
		releasedClasses.add(new Aristocrat());
		releasedClasses.add(new Mercedes());
		releasedClasses.add(new BurnMage());
		releasedClasses.add(new Assassin());
		releasedClasses.add(new DragonKnight());
		releasedClasses.add(new Berserker());
		releasedClasses.add(new General());
		releasedClasses.add(new Mogall());
		releasedClasses.add(new ReflectorMage());
		releasedClasses.add(new Viking());
	}

	public ArrayList<Unit> getReleasedUnits() {
		return releasedClasses;
	}

}
