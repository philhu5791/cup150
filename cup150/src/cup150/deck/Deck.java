package cup150.deck;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	ArrayList<Card> deck;
	int dealIndex;
	Random r;
	
	public Deck(){
		deck=new ArrayList<Card>();
		for(int i=1; i<13;i++){
			deck.add(new Card(i,Suit.Club));
			deck.add(new Card(i,Suit.Diamond));
			deck.add(new Card(i,Suit.Heart));
			deck.add(new Card(i,Suit.Spade));
			dealIndex=0;
			r=new Random();
		}
	}
	
	public void shuffle(){
		int size=deck.size();
		for(int i=size-1; i>0; i--){
			int random=getRandom(0,i);
			swap(random,i);
		}
		
	}
	
	private void swap(int random, int i) {
		Card temp=deck.get(random);
		deck.set(random, deck.get(i));
		deck.set(i, temp);
		
	}

	private int getRandom(int min, int max) {
		int temp=r.nextInt(max-min+1);
		return temp+min;
	}

	public Card dealCard(){
		Card current=deck.get(dealIndex);
		current.setAvaliable(false);
		return current;
	}
	
}
