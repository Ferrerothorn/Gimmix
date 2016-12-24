package geneticEmblem.weapons;

import java.util.ArrayList;

public abstract class Weapon {

	public boolean phys;
	public ArrayList<String> trinity = new ArrayList<String>();
	public ArrayList<String> traits = new ArrayList<String>();
	public String name;
	public int acc;
	public int pow;
	public int wepCrit;
	
	public boolean isPhys() {
		return phys;
	}

	public void setPhys(boolean phys) {
		this.phys = phys;
	}

	public ArrayList<String> getTrinity() {
		return trinity;
	}

	public void setTrinity(String trinityType) {
		trinity.add(trinityType);
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

	public String getName() {
		return name;
	}

	public void setName(String string) {
		name = string;
	}

	public ArrayList<String> getTraits() {
		return traits;
	}
	
	public void setTraits(String trait) {
		traits.add(trait);
	}
}
