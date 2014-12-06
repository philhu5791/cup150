package cup150.deck;

public class Test {

	 public static void main(String[] args){
		 
		 Deck myd=new Deck();
		 myd.shuffle();
		 Card c=myd.dealCard();
		 System.out.println(c.toString());
		 Hand hand=new Hand();
		 hand.addCard(myd.dealCard());
		 hand.addCard(myd.dealCard());
		 System.out.println(hand.Score());
		 
		 
	 }
}
