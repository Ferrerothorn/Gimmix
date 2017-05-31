

import java.util.ArrayList;

public class Player {

	public String name;
	private ArrayList<String> pPool = new ArrayList<>();

	public Player(String myName) {
		name = myName;
	}

	public String getName() {
		return name;
	}

	public void claimsPick(String pick) {
		pPool.add(pick);
	}

	public String getPoolAsString() {
		return pPool.toString();
	}	
	public ArrayList<String> getPool() {
		return pPool;
	}

}
