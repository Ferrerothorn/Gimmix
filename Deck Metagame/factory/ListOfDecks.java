package factory;

import java.util.ArrayList;
import factory.Deck;
import legacy.*;

public class ListOfDecks {

	ArrayList<Deck> presentDecks = new ArrayList<>();

	public ListOfDecks() {
		presentDecks.add(new Aluren());
		presentDecks.add(new ANT());
		presentDecks.add(new Belcher());
		presentDecks.add(new Burn());
		presentDecks.add(new Casablanca());
		presentDecks.add(new DeadguyAle());
		presentDecks.add(new Dredge());
		presentDecks.add(new Eldrazi());
		presentDecks.add(new Elves());
		presentDecks.add(new FoodChain());
		presentDecks.add(new GrixisDelver());
		presentDecks.add(new HighTide());
		presentDecks.add(new Infect());
		presentDecks.add(new Lands());
		presentDecks.add(new Maverick());
		presentDecks.add(new Merfolk());
		presentDecks.add(new Miracles());
		presentDecks.add(new NicFit());
		presentDecks.add(new Pox());
		presentDecks.add(new PunishingJund());
		presentDecks.add(new Reanimator());
		presentDecks.add(new ShardlessBUG());
		presentDecks.add(new Slivers());
		presentDecks.add(new Stax());
		presentDecks.add(new SteveBrew());
	}

	public ArrayList<Deck> getReleasedUnits() {
		return presentDecks;
	}

}
