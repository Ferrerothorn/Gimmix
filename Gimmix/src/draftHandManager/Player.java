import java.util.ArrayList;

public class Player {

	
	public String name;
	private ArrayList<String> pHand = new ArrayList<String>();
	private ArrayList<String> pPool = new ArrayList<String>();
	
	public Player(String myName) {
		name = myName;
	}

	public void setPack(ArrayList<String> pack) {
		pHand = pack;
	}

	public String getName() {
		return name;
	}
	
	public ArrayList<String> getHand() {
		return pHand;
	}
	
	public String getHandAsString() {
		return pHand.toString();
	}

	public void printPicks() {
		int index = 1;
		for (String s : pHand) {
			System.out.println("" + index + ") " + s );
			index++;
		}
		System.out.println();
	}

	public void claimPick(int pick) {
		pick--;
		pPool.add(pHand.remove(pick));
	}


	public void giveHand(ArrayList<String> theirPack) {
		pHand = theirPack;
	}

	public String getDeckAsString() {
		return pPool.toString();
	}	
}
