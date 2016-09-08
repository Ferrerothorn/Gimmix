package geneticEmblem.units.factory;

import java.util.ArrayList;

import geneticEmblem.units.generated.*;
import geneticEmblem.units.ootb.*;

public class ClassList {

	ArrayList<Unit> releasedClasses = new ArrayList<Unit>();

	public ClassList() {

		releasedClasses.add(new Convict());
		releasedClasses.add(new Woodcutter());
		releasedClasses.add(new Bandit());
		releasedClasses.add(new Marksman());
		releasedClasses.add(new Explorer());
		releasedClasses.add(new Channeler());
		releasedClasses.add(new BlueMage());
		releasedClasses.add(new Viera());
		releasedClasses.add(new Jett());
		releasedClasses.add(new Cremator());
		releasedClasses.add(new Merchant());
		releasedClasses.add(new Trapper());
		releasedClasses.add(new Brawler());
		releasedClasses.add(new Aran());
		releasedClasses.add(new Beginner());
		releasedClasses.add(new Butcher());
		releasedClasses.add(new Saracen());
		releasedClasses.add(new WindBreaker());
		releasedClasses.add(new Monk());
		releasedClasses.add(new Entombed());
		releasedClasses.add(new PortalMage());
		releasedClasses.add(new KilnFiend());
		releasedClasses.add(new Kaiser());
		releasedClasses.add(new MagnetMage());
		releasedClasses.add(new ConduitMage());
		releasedClasses.add(new Golem());
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
		releasedClasses.add(new Bael());
		releasedClasses.add(new DragonKnight());

		releasedClasses.add(new Berserker());
		releasedClasses.add(new General());
		releasedClasses.add(new Crusader());
		releasedClasses.add(new Mogall());
		releasedClasses.add(new ReflectorMage());
		releasedClasses.add(new Viking());
	}

	public ArrayList<Unit> getReleasedUnits() {
		return releasedClasses;
	}

}
