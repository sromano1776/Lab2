package PokerEnums;

public enum eSuit {
	HEART(1),SPADE(2),CLUB(3),DIAMOND(4);
	private int iSuit;

	private eSuit(int iSuit) {
		this.iSuit = iSuit;
	}

	public int getiSuit() {
		return iSuit;
	}
	

}
