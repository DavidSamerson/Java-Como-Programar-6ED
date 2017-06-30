package colecoes;

public class Card {
	
	public static enum Face {Ace, Deuce, Three, Four, Five, Six, Seven, Eigth, nine, Ten, Jack, Queen, King};
	public static enum Suit {Clubs, Diamonds, Hearts, Spades};
	private final Face face;
	private final Suit suit;

	public Card() {
		
		face = cardFace;
		suit = cardSuit;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
