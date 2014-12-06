package cup150.deck;

import java.util.ArrayList;

public class Hand {
	private ArrayList<Card> hand;
	
	Hand(){
		hand=new ArrayList<Card>();
	}
	
	public void addCard(Card c){
		hand.add(c);
	}
	
	public int Score(){
		int score=0;
		for(Card item: hand){
			score+=item.getVaule();
		}
		return score;
	}

}
