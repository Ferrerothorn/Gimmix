package geneticEmblem.weapons;

import java.util.ArrayList;

public abstract class Weapon {

	public boolean phys;
	public String trinity;
	public int acc;
	public int pow;
	public int wepCrit;
	public ArrayList<String> traits = new ArrayList<String>();

	public boolean isPhys() {
		return phys;
	}

	public void setPhys(boolean phys) {
		this.phys = phys;
	}

	public String getTrinity() {
		return trinity;
	}

	public void setTrinity(String trinity) {
		this.trinity = trinity;
	}

	public int getAcc() {
		return acc;
	}

	public void setAcc(int acc) {
		this.acc = acc;
	}

	public int getPow() {
		return pow;
	}

	public void setPow(int pow) {
		this.pow = pow;
	}

	public int getCrit() {
		return wepCrit;
	}

	public void setCrit(int newCrit) {
		wepCrit = newCrit;
	}

	public void addTrait(String string) {
		traits.add(string);
	}

	public ArrayList<String> getTraits() {
		return traits;
	}

}
