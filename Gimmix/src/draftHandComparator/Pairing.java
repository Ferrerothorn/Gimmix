package draftHandComparator;

public class Pairing {

	Entry e1;
	Entry e2;
	
	public Pairing (Entry s, Entry s2) {
		e1 = s;
		e2 = s2;
	}

	public Entry getP1() {
		return e1;
	}
	
	public Entry getP2() {
		return e2;
	}
	
	public String getP1Name() {
		return e1.getName();
	}
	
	public String getP2Name() {
		return e2.getName();
	}
	
}
