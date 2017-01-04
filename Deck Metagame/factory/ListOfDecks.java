package factory;

import java.util.ArrayList;
import modern.*;
import factory.Deck;
import legacy.*;

public class ListOfDecks {

	ArrayList<Deck> presentDecks = new ArrayList<Deck>();

	public ListOfDecks() {

		// Modern
		 presentDecks.add(new Jund());
		 presentDecks.add(new Tron());
		 presentDecks.add(new Dredge());
		 presentDecks.add(new NayaBurn());
		 presentDecks.add(new Affinity());
		 presentDecks.add(new Merfolk());
		 presentDecks.add(new Abzan());
		 presentDecks.add(new WRPrison());
		 presentDecks.add(new ValakutBreach());
		 presentDecks.add(new GrixisControl());
		 presentDecks.add(new LanternControl());
		 presentDecks.add(new BantEldrazi());
		 presentDecks.add(new Infect());
		 presentDecks.add(new JeskaiControl());

		// Legacy
		 presentDecks.add(new Miracles());
		 presentDecks.add(new EldraziStompy());
		 presentDecks.add(new ShardlessBUG());
		 presentDecks.add(new GrixisDelver());
		 presentDecks.add(new Elves());
		 presentDecks.add(new ANT());
		 presentDecks.add(new DeathAndTaxes());
		 presentDecks.add(new Lands());
		 presentDecks.add(new SneakAndShow());
		 presentDecks.add(new Reanimator());
		 presentDecks.add(new EsperStoneblade());
		 presentDecks.add(new PunishingJund());
		 presentDecks.add(new FoodChain());
		 presentDecks.add(new Maverick());
		 presentDecks.add(new NicFit());
		 presentDecks.add(new Aluren());
	}

	public ArrayList<Deck> getReleasedUnits() {
		return presentDecks;
	}

}
