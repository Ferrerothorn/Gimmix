import java.util.ArrayList;
import java.util.Random;

public class Main {

	static ArrayList<String> tierPool = new ArrayList<String>();

	public static void main(String[] args) {
		populatePool();
		ArrayList<String> p1 = new ArrayList<String>();
		ArrayList<String> p2 = new ArrayList<String>();
		Random r = new Random();

		for (int i = 0; i < 6; i++) {
			int index = r.nextInt(tierPool.size());
			p1.add(tierPool.remove(index));
		}
		populatePool();
		for (int i = 0; i < 6; i++) {
			int index = r.nextInt(tierPool.size());
			p2.add(tierPool.remove(index));
		}

		System.out.println(rpad(p1.remove(0)) + rpad(p1.remove(0)) + "| " + rpad(p2.remove(0)) + rpad(p2.remove(0)));
		System.out.println(rpad(p1.remove(0)) + rpad(p1.remove(0)) + "| " + rpad(p2.remove(0)) + rpad(p2.remove(0)));
		System.out.println(rpad(p1.remove(0)) + rpad(p1.remove(0)) + "| " + rpad(p2.remove(0)) + rpad(p2.remove(0)));

	}

	private static void populatePool() {
		tierPool.clear();
		tierPool.add("Aegislash");
		tierPool.add("Aerodactyl");
		tierPool.add("Alakazam");
		tierPool.add("Amoonguss");
		tierPool.add("Araquanid");
		tierPool.add("Arcanine");
		tierPool.add("Audino");
		tierPool.add("Azumarill");
		tierPool.add("Breloom");
		tierPool.add("Bronzong");
		tierPool.add("Celesteela");
		tierPool.add("Charizard");
		tierPool.add("Clefable");
		tierPool.add("Comfey");
		tierPool.add("Cradily");
		tierPool.add("Cresselia");
		tierPool.add("Deoxys");
		tierPool.add("Diancie");
		tierPool.add("Dragonite");
		tierPool.add("Drampa");
		tierPool.add("Espeon");
		tierPool.add("Excadrill");
		tierPool.add("Ferrothorn");
		tierPool.add("Garchomp");
		tierPool.add("Gastrodon");
		tierPool.add("Genesect");
		tierPool.add("Gengar");
		tierPool.add("Gigalith");
		tierPool.add("Golem");
		tierPool.add("Golisopod");
		tierPool.add("Greninja");
		tierPool.add("Gyarados");
		tierPool.add("Heatran");
		tierPool.add("Heliolisk");
		tierPool.add("Hippowdon");
		tierPool.add("Hoopa-Unbound");
		tierPool.add("Hydreigon");
		tierPool.add("Jolteon");
		tierPool.add("Kartana");
		tierPool.add("Kingdra");
		tierPool.add("Kyurem-Black");
		tierPool.add("Landorus-Therian");
		tierPool.add("Lilligant");
		tierPool.add("Lucario");
		tierPool.add("Ludicolo");
		tierPool.add("Magnezone");
		tierPool.add("Mamoswine");
		tierPool.add("Marowak-Alola");
		tierPool.add("Metagross");
		tierPool.add("Milotic");
		tierPool.add("Mimikyu");
		tierPool.add("Mudsdale");
		tierPool.add("Muk-Alola");
		tierPool.add("Nihilego");
		tierPool.add("Ninetales");
		tierPool.add("Ninetales-Alola");
		tierPool.add("Oranguru");
		tierPool.add("Oricorio");
		tierPool.add("Pelipper");
		tierPool.add("Pheromosa");
		tierPool.add("Politoed");
		tierPool.add("Porygon2");
		tierPool.add("PorygonZ");
		tierPool.add("Raichu");
		tierPool.add("Raichu-Alola");
		tierPool.add("Ribombee");
		tierPool.add("Rotom-Wash");
		tierPool.add("Salamence");
		tierPool.add("Salazzle");
		tierPool.add("Scizor");
		tierPool.add("Scrafty");
		tierPool.add("Serperior");
		tierPool.add("Shaymin-Sky");
		tierPool.add("Shedinja");
		tierPool.add("Shuckle");
		tierPool.add("Smeargle");
		tierPool.add("Snorlax");
		tierPool.add("Suicune");
		tierPool.add("Sylveon");
		tierPool.add("Tapu Bulu");
		tierPool.add("Tapu Fini");
		tierPool.add("Tapu Koko");
		tierPool.add("Tapu Lele");
		tierPool.add("Terrakion");
		tierPool.add("Thundurus");
		tierPool.add("Thundurus-Therian");
		tierPool.add("Togekiss");
		tierPool.add("Torkoal");
		tierPool.add("Toxapex");
		tierPool.add("Tyranitar");
		tierPool.add("Venusaur");
		tierPool.add("Victini");
		tierPool.add("Vikavolt");
		tierPool.add("Volcanion");
		tierPool.add("Volcarona");
		tierPool.add("Weavile");
		tierPool.add("Whimsicott");
		tierPool.add("Xurkitree");
		tierPool.add("Zapdos");
		tierPool.add("Zygarde");
	}

	public static String rpad(String inStr) {
		return (inStr
				+ "                                                                                                                          ")
						.substring(0, 20);
	}

}
