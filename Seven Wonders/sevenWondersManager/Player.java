package sevenWondersManager;

import java.util.ArrayList;

import gamePieces.*;

public class Player {

	public String name;
	public int coins;
	public int score = 0;
	
	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public ArrayList<String> getMyHand() {
		return myHand;
	}

	public void setMyHand(ArrayList<String> myHand) {
		this.myHand = myHand;
	}

	public ArrayList<Card> getMyCiv() {
		return myCiv;
	}

	public void setMyCiv(ArrayList<Card> myCiv) {
		this.myCiv = myCiv;
	}

	public ArrayList<String> getMyResources() {
		return myResources;
	}

	public void setMyResources(ArrayList<String> myResources) {
		this.myResources = myResources;
	}

	public ArrayList<String> getScienceSymbols() {
		return scienceSymbols;
	}

	public void setScienceSymbols(ArrayList<String> scienceSymbols) {
		this.scienceSymbols = scienceSymbols;
	}

	public WonderBoard getWonderBoard() {
		return wonderBoard;
	}

	public void setWonderBoard(WonderBoard wonderBoard) {
		this.wonderBoard = wonderBoard;
	}

	public void setName(String name) {
		this.name = name;
	}

	private ArrayList<String> myHand = new ArrayList<>();
	public ArrayList<Card> myCiv = new ArrayList<>();
	public ArrayList<String> myResources = new ArrayList<>();
	public ArrayList<String> scienceSymbols = new ArrayList<>();
	
	public WonderBoard wonderBoard;

	public Player(String myName, WonderBoard w) {
		name = myName;
		wonderBoard = w;
	}

	public void setPack(ArrayList<String> pack) {
		myHand = pack;
	}

	public String getName() {
		return name;
	}

	public ArrayList<String> getHand() {
		return myHand;
	}

	public String getHandAsString() {
		return myHand.toString();
	}

	public void printPicks() {
		int index = 1;
		for (String s : myHand) {
			System.out.println("" + index + ") " + s);
			index++;
		}
		System.out.println();
	}

//	public void claimPick(int pick) {
//		pick--;
//	//	String c = myHand.remove(pick);
//	//	process(c);
//	}



	public void giveHand(ArrayList<String> theirPack) {
		myHand = theirPack;
	}

	public String getDeckAsString() {
		return myCiv.toString();
	}
}
