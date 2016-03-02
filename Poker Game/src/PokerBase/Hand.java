package PokerBase;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Hand {
	
	private ArrayList<Card> CardsInHand;
	private ArrayList<Card> BestCardsInHand;
	private HandScore HandScore;
	private boolean bScored=false;
	private boolean Flush;
	private boolean Straight;
	private boolean Ace;
	
	public Hand(){
		CardsInHand = new ArrayList<Card>();
		BestCardsInHand=new ArrayList<Card>();
	}

}
