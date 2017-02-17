package factory;

import java.util.Random;

public class CustomUnitGenerator {

	int aggro = 0;
	int control = 0;
	int combo = 0;
	int midrange = 0;

	public void generateNewUnitStats() {
		blatStats();
		Random r = new Random();
		generateStats(r);

		if (aggro + combo + control + midrange != 100) {
			generateNewUnitStats();
		}
	}

	private void generateStats(Random r) {
		aggro = r.nextInt(21);
		control = r.nextInt(21);
		combo = r.nextInt(21);
		midrange = r.nextInt(21);
		aggro *= 5;
		control *= 5;
		combo *= 5;
		midrange *= 5;
	}

	public CustomUnitGenerator() {
		generateNewUnitStats();
	}

	public Custom buildUnit() {
		Custom custom = new Custom(aggro, control, combo, midrange);
		return custom;
	}

	private void blatStats() {
		aggro = 0;
		control = 0;
		combo = 0;
		midrange = 0;
	}

	public String generateCode(double stDev) {
		return ("package newfags;" + '\n' + '\n' + "import factory.*;" + '\n' + '\n' + '\n' + "public class " + stDev
				+ " extends Deck { " + '\n' + '\n' + "public " + stDev + "() {" + '\n' + '\n' + "    this.setArchetype(\""
				+ stDev + "\");"  + '\n' + "    this.setStats(" + aggro + ", " + control + ", " + combo
				+ ", " + midrange + ");" + '\n'  + "    }"+ '\n'  + "}");
	}
}