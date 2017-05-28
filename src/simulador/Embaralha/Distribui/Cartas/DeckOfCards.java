package simulador.Embaralha.Distribui.Cartas;

import java.util.Random;

public class DeckOfCards {

	// TODO Auto-generated method stub

	private Card deck[];
	private int currentCard;
	private final int NUMBER_OF_CARDS = 52;
	private Random randomNumbers;

	public DeckOfCards() 
	{
		String faces[] = {"ACE","DEUCE","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
		String suits[] = {"HEARTHS","DIAMONDS","CLUBS","SPADES"};
		
		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0;
		randomNumbers = new Random();
		
		for( int count=0; count < deck.length; count++){
			
			deck[ count ] = new Card( faces[ count % 13 ], suits [ count / 13 ] ); 
		}
	}

}
