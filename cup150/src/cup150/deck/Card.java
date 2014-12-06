package cup150.deck;

public class Card {
	private Suit suit;
	private int number;
	boolean avaliable;
	
	Card(int number, Suit suit){
		this.number=number;
		this.suit=suit;
		avaliable=true;
	}
	
	public int getVaule(){
		return number;
	}
	
	public boolean getAvaliable(){
		return avaliable;
	}
	
	public void setAvaliable(boolean b){
		this.avaliable=b;
	}
	public String toString(){
		String suitName=suit.toString();
		
			
		 if(number==11){
			return suitName+"J";
		}else if(number==12){
			return suitName+"Q";
		}else if(number==12){
			return suitName+"K";
		}else{
			return suitName+number;
		}
	}
	

}
