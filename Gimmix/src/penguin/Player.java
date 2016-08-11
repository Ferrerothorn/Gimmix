package penguin;

import java.util.ArrayList;

public class Player {

    String playerName = "";
    ArrayList<Card> hand = new ArrayList<Card>();
    ArrayList<Card> deck = new ArrayList<Card>();
    ArrayList<Card> discardPile = new ArrayList<Card>();
    Player opponent;
    
    boolean alive = true;

    public Player(String s) {
        playerName = s;
        newDeck();
        draw();
        draw();
    }

	public void newDeck() {
		for (int i = 0; i < 30; i++) {
			deck.add(new Card("Test"));
		}
	}

	public void draw() {
        hand.add(deck.remove(0));
    }
    
    public Card peek() {
        return deck.get(0);
    }

    public void play(Card c) {
    	c.play(this, opponent);
    }

    public String getName() {
        return playerName;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public boolean isAlive() {
        return alive;
    }

	public void setOpponent(Player p2) {
		opponent = p2;
	}

	public void takeTurn() {
		this.draw();
		Card c = pollForCardToPlay();
		c.play();
		this.getHand().remove(c);
		this.discardPile.add(c);
	}

	private Card pollForCardToPlay() {
		or ()
	}

}
