package PokerBase;

import java.util.ArrayList;
import java.util.Collections;

import PokerEnums.eRank;
import PokerEnums.eSuit;

public class Deck {
	private ArrayList<Card> deckCards=new ArrayList<Card>();
	
	public Deck()
	{
		for (short i=0; i<=3; i++){
			eSuit SuitValue = eSuit.values()[i];
			for(short j=0; j<=12; j++){
				eRank RankValue = eRank.values()[j];
				Card NewCard = new Card(RankValue, SuitValue, (13*i)+j+1);
				deckCards.add(NewCard);
			}
		}
		Collections.shuffle(deckCards);
	}
	public Card Draw() throws DeckException{
		if (deckCards.size()==0)
		{throw new DeckException(this);
		
		}
		return deckCards.remove(0);
	}
	private int GetDeckSize(){
		return deckCards.size();
	}
}
/**public void DeckDrawIsCard() throws DeckExpception{
	Deck d = new Deck();
Object o = null;
o=d.Draw();
if(!(o instanceof Card)){
fail("Object drawn from deck isn't a card!")
}}

@Test(expected = DeckException.class)
public void DeckOverDraw() throws Exception{
Deck d= new Deck();
Card c = null;
for (int i = 0; i < 100; i++){
c=d.Draw();
}}
**/