package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Merchant extends Unit {
	// http://www.mtgsalvation.com/forums/the-game/modern/budget-modern/601023-50-shinbatsus-budget-modern-challenge-more-deck
	// http://www.mtgsalvation.com/forums/the-game/modern/budget-modern/601023-50-shinbatsus-budget-modern-challenge-more-deck#c9
	// http://www.mtgsalvation.com/forums/the-game/modern/budget-modern/601023-50-shinbatsus-budget-modern-challenge-more-deck?page=2#c26
	// http://www.mtgsalvation.com/forums/the-game/legacy-type-1-5/established-legacy/aggro-tempo/488613-burn
	// http://www.mtgsalvation.com/forums/the-game/legacy-type-1-5/established-legacy/aggro-tempo/179828-deck-merfolk
	// http://www.mtgsalvation.com/forums/the-game/legacy-type-1-5/established-legacy/midrange/179826-aggro-loam-4c-loam
	public Merchant() {
		this.setJob("Merchant");
		this.setWeapon(new PumpkinLance());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(4);
		this.setSpeedBase(7);
		this.setLuckBase(6);
		this.setDefBase(5);
		this.setResBase(8);

		this.setHpGr(45);
		this.setStrGr(45);
		this.setSkillGr(50);
		this.setSpeedGr(55);
		this.setLuckGr(40);
		this.setDefGr(50);
		this.setResGr(45);
	}
}
