package deckMetagame.units.generated;

import deckMetagame.units.factory.Deck;

public class EsperControl extends Deck {

	public EsperControl() {

		this.setJob("Esper Control");
		this.setHpBase(28);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(7);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(7);
		this.setResBase(4);

		this.setHpGr(55);
		this.setStrGr(50);
		this.setSkillGr(45);
		this.setSpeedGr(40);
		this.setLuckGr(40);
		this.setDefGr(50);
		this.setResGr(35);
	}
}
