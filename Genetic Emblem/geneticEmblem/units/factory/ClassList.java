package geneticEmblem.units.factory;

import java.util.ArrayList;

import geneticEmblem.units.generated.*;

public class ClassList {

	ArrayList<Unit> releasedClasses = new ArrayList<Unit>();

	public ClassList() {
		releasedClasses.add(new Amelia());
		releasedClasses.add(new Artur());
		releasedClasses.add(new Colm());
		releasedClasses.add(new Cormag());
		releasedClasses.add(new Eirika());
		releasedClasses.add(new Eliwood());
		releasedClasses.add(new Ephraim());
		releasedClasses.add(new Ewan());
		releasedClasses.add(new Franz());
		releasedClasses.add(new Garcia());
		releasedClasses.add(new Gerik());
		releasedClasses.add(new Gilliam());
		releasedClasses.add(new Hector());
		releasedClasses.add(new Innes());
		releasedClasses.add(new Joshua());
		releasedClasses.add(new Knoll());
		releasedClasses.add(new Kyle());
		releasedClasses.add(new Larachel());
		releasedClasses.add(new Lute());
		releasedClasses.add(new Lyn());
		releasedClasses.add(new Lyon());
		releasedClasses.add(new Marisa());
		releasedClasses.add(new Marth());
		releasedClasses.add(new Natasha());
		releasedClasses.add(new Neimi());
		releasedClasses.add(new Nino());
		releasedClasses.add(new Rebecca());
		releasedClasses.add(new Ross());
		releasedClasses.add(new Tana());
	}

	public ArrayList<Unit> getReleasedUnits() {
		return releasedClasses;
	}

}
