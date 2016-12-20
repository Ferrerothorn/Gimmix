package deckMetagame.units.generated;

import deckMetagame.units.factory.Deck;

public class Reanimator extends Deck {

	public Reanimator() {
		this.setJob("Angelic Buster");
		this.setHpBase(25);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(8);
		this.setSpeedBase(7);
		this.setLuckBase(3);
		this.setDefBase(5);
		this.setResBase(6);

		this.setHpGr(45);
		this.setStrGr(45);
		this.setSkillGr(55);
		this.setSpeedGr(50);
		this.setLuckGr(40);
		this.setDefGr(35);
		this.setResGr(45);
	}
}
