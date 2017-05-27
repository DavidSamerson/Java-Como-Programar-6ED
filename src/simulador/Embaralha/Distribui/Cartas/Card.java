package simulador.Embaralha.Distribui.Cartas;

public class Card {

	private String face;
	private String suit;

	
	public Card(String cardFace, String cardSuit){
		
		face = cardFace;
		suit = cardSuit;
		
	}
	
	public String toString(){
		return face + " OF " + suit;
	}
}
