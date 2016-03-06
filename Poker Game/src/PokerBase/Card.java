package PokerBase;

import java.util.Comparator;

import PokerEnums.eRank;
import PokerEnums.eSuit;

public class Card implements Comparable {
	private eRank rank;
	private eSuit suit;
	private int iCardNbr;
	public Card(eRank rank, eSuit suit, int iCardNbr) {
		super();
		this.rank = rank;
		this.suit = suit;
		this.iCardNbr = iCardNbr;
	}
	public eRank getRank() {
		return rank;
	}
	public eSuit getSuit() {
		return suit;
	}
	public int getiCardNbr() {
		return iCardNbr;
	}
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.getRank().compareTo(this.getRank());
	}
	public static Comparator<Card> CardRank = new Comparator<Card>();
	public int compare(Card c1, Card c2){
		int Cno1 = c1.getRank().getiRank(); //Ask about iRankNbr what is the difference to our iCardNbr
		int Cno2= c2.getRank().getiRank();
		return Cno2-Cno1;
	
	}};
	

