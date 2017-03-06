package factory;

import java.util.ArrayList;
import factory.Deck;
import legacy.*;

public class ListOfDecks {

	ArrayList<Deck> presentDecks = new ArrayList<>();

	public ListOfDecks() {
//		 presentDecks.add(new Aluren());
//		 presentDecks.add(new ANT());
		 presentDecks.add(new Belcher());
		 presentDecks.add(new Burn());
//		 presentDecks.add(new Casablanca());
//		 presentDecks.add(new DeadguyAle());
//		 presentDecks.add(new DeathAndTaxes());
//		 presentDecks.add(new Dredge());
//		 presentDecks.add(new Eldrazi());
//		 presentDecks.add(new Elves());
//		 presentDecks.add(new FoodChain());
//		 presentDecks.add(new Goblins());
//		 presentDecks.add(new GrixisDelver());
//		 presentDecks.add(new HighTide());
//		 presentDecks.add(new Infect());
		 presentDecks.add(new Lands());
//		 presentDecks.add(new Maverick());
//		 presentDecks.add(new Merfolk());
//		 presentDecks.add(new Miracles());
//		 presentDecks.add(new NicFit());
//		 presentDecks.add(new Pox());
//		 presentDecks.add(new PunishingJund());
//		 presentDecks.add(new Reanimator());
//		 presentDecks.add(new Shardless());
//		 presentDecks.add(new Slivers());
//		 presentDecks.add(new SneakAndShow());
		 presentDecks.add(new Stax());
	}

	public ArrayList<Deck> getReleasedUnits() {
		return presentDecks;
	}

}
