package draftHandComparator;

public class Entry implements Comparable<Entry> {

	int matchupsWon;
	String name;
	
	public Entry (String s) {
		name = s;
		matchupsWon = 0;
	}
	
	public int compareTo(Entry e) {
		if (e.getWins() > this.getWins()) {
			return 1;
		}
		return -1;
	}

	public void win() {
		matchupsWon++;
	}
	
	public int getWins() {
		return matchupsWon;
	}


	public String getName() {
		return name;
	}

}
