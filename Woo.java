import cs1.Keyboard;
import java.util.ArrayList;

//game executer file
public class Woo{
    
    public static void main(String[] args) {
	int turns = 0;
	int cardNum = 0;
	
//CREATE DECK ==================================================================
	ArrayList <Cards> deck = new ArrayList<Cards>();
	createDeck(deck);
	shuffle(deck);

//CREATE PLAYERS ===============================================================
	System.out.println("Please select the number of players (2-4):");
	int amtPlayers = Keyboard.readInt();
	if (amtPlayers > 4 || amtPlayers < 2) {
	    System.out.println("Not in player range!");
	}
	
	Player h0 = new Human();
	if (amtPlayers > 0){
	    System.out.println("Please state player one's name:");
	    String name0 = Keyboard.readString();
	    h0 = new Human(name0);
	    h0.draw(5, deck);
	}
	Player h1 = new Human();
	if (amtPlayers > 1){
	    System.out.println("Please state player two's name:");
	    String name1 = Keyboard.readString();
	    h1 = new Human(name1);
	    h1.draw(5, deck);
	}
	Player h2 = new Human();
	if (amtPlayers > 2){
	    System.out.println("Please state player three's name:");
	    String name2 = Keyboard.readString();
	    h2 = new Human(name2);
	    h2.draw(5, deck);
	}
	Player h3 = new Human();
	if (amtPlayers > 3){
	    System.out.println("Please state player four's name:");
	    String name3 = Keyboard.readString();
	    h3 = new Human(name3);
	    h3.draw(5, deck);
	}

//PLAY GAME ====================================================================
	int index;
	while (cardNum < 3){
	    //PLAYER 1 =========================================================
	    if ((turns % amtPlayers) == 0){
		System.out.println(h0.getField());
		if (amtPlayers > 1){
		    System.out.println(h1.getField());
		}
		if (amtPlayers > 2){
		    System.out.println(h2.getField());
		}
		if (amtPlayers > 3){
		    System.out.println(h3.getField());
		}
		if (cardNum == 0){
		    h0.draw(2, deck);
		}
		System.out.println(h0);
		System.out.println("Pick the index of the card you want to play:");
		System.out.println("Or: Enter 99 if you would like to end your turn.");
		index = Keyboard.readInt();
		if (index == 99) {
		    cardNum = 3;
		}
		else {
		    //PROPRETY CARDS============================================
		    if (((Cards)(h0.hand.get(index))).getID() < 11){
			h0.addProperty(index);
		    }
		    //MONEY CARDS===============================================
		    else if (((Cards)(h0.hand.get(index))).getID() >= 11 && ((Cards)(h0.hand.get(index))).getID() <= 16) {
			h0.addBank(index);
		    }
		    //RENT CARDS ===============================================
		    else if (((Cards)(h0.hand.get(index))).getID() >= 17 && ((Cards)(h0.hand.get(index))).getID() <= 22) {
			h0.playRent(index);
		    }
		    //ACTION CARDS =============================================
		    else {
			System.out.println("If you want to play action, type 'play'. If you want to add to bank, type 'bank'.");
			if(Keyboard.readString().equals("play")){
			    h0.playAction(index);
			}
			else {
			    h0.addBank(index);
			}
		    }
		    cardNum += 1;
		}
		if (cardNum == 3) {
		    if (h0.hand.size() > 7) {
			System.out.println("You have too many cards in your hand. Please discard until you have 7 cards");
			for (int x = 0; x < h0.hand.size() - 7; x++) {
			    System.out.println(h0);
			    System.out.println("Pick the index of the card that you wish to discard");
			    index = Keyboard.readInt();
			    ((Human)h0).discard(index);
			} 
		    }
		    cardNum = 0;
		    turns += 1;
		}
	    }
	    //PLAYER 2 =========================================================
	    if ((turns % amtPlayers) == 1){
		if (cardNum == 0){
		    System.out.println(h0.getField());
		    System.out.println(h1.getField());
		    if (amtPlayers > 2){
			System.out.println(h2.getField());
		    }
		    if (amtPlayers > 3){
			System.out.println(h3.getField());
		    }
		    h1.draw(2, deck);
		}
		System.out.println(h1); 
		System.out.println("Pick the index of the card you want to play:");
		System.out.println("Or: Enter 99 if you would like to end your turn.");
		index = Keyboard.readInt();
		if (index == 99) {
		    cardNum = 3;
		}
		else {
		    //PROPRETY CARDS============================================
		    if (((Cards)(h1.hand.get(index))).getID() < 11){
			h1.addProperty(index);
		    }
		    //MONEY CARDS===============================================
		    else if (((Cards)(h1.hand.get(index))).getID() >= 11 && ((Cards)(h1.hand.get(index))).getID() <= 16) {
			h1.addBank(index);
		    }
		    //RENT CARDS ===============================================
		    else if (((Cards)(h1.hand.get(index))).getID() >= 17 && ((Cards)(h1.hand.get(index))).getID() <= 22) {
			h1.playRent(index);
		    }
		    //ACTION CARDS =============================================
		    else {
			System.out.println("If you want to play action, type 'play'. If you want to add to bank, type 'bank'.");
			if(Keyboard.readString().equals("play")){
			    h1.playAction(index);
			}
			else {
			    h1.addBank(index);
			}
		    }
		    cardNum += 1;
		}
		if (cardNum == 3) {
		    if (h1.hand.size() > 7) {
			System.out.println("You have too many cards in your hand. Please discard until you have 7 cards");
			for (int x = 0; x < h1.hand.size() - 7; x++) {
			    System.out.println(h1);
			    System.out.println("Pick the index of the card that you wish to discard");
			    index = Keyboard.readInt();
			    ((Human)h1).discard(index);
			} 
		    }
		    cardNum = 0;
		    turns += 1;
		}
	    }
	    //PLAYER 3 =========================================================
	    if ((turns % amtPlayers) == 2){
		System.out.println(h0.getField());
		System.out.println(h1.getField());
		System.out.println(h2.getField());
		if (amtPlayers > 3){
		    System.out.println(h3.getField());
		}
		if (cardNum == 0){
		    h2.draw(2, deck);
		}
		System.out.println(h2);
		System.out.println("Pick the index of the card you want to play:");
		System.out.println("Or: Enter 99 if you would like to end your turn.");
		index = Keyboard.readInt();
		if (index == 99) {
		    cardNum = 3;
		}
		else {
		    //PROPRETY CARDS============================================
		    if (((Cards)(h2.hand.get(index))).getID() < 11){
			h2.addProperty(index);
		    }
		    //MONEY CARDS===============================================
		    else if (((Cards)(h2.hand.get(index))).getID() >= 11 && ((Cards)(h2.hand.get(index))).getID() <= 16) {
			h2.addBank(index);
		    }
		    //RENT CARDS ===============================================
		    else if (((Cards)(h2.hand.get(index))).getID() >= 17 && ((Cards)(h2.hand.get(index))).getID() <= 22) {
			h2.playRent(index);
		    }
		    //ACTION CARDS =============================================
		    else {
			System.out.println("If you want to play action, type 'play'. If you want to add to bank, type 'bank'.");
			if(Keyboard.readString().equals("play")){
			    h2.playAction(index);
			}
			else {
			    h2.addBank(index);
			}
		    }
		    cardNum += 1;
		}
		if (cardNum == 3) {
		    if (h2.hand.size() > 7) {
			System.out.println("You have too many cards in your hand. Please discard until you have 7 cards");
			for (int x = 0; x < h2.hand.size() - 7; x++) {
			    System.out.println(h2);
			    System.out.println("Pick the index of the card that you wish to discard");
			    index = Keyboard.readInt();
			    ((Human)h2).discard(index);
			} 
		    }
		    cardNum = 0;
		    turns += 1;
		}
	    }
	    //PLAYER 4 =========================================================
	    if ((turns % amtPlayers) == 3){
		System.out.println(h0.getField());
		System.out.println(h1.getField());
		System.out.println(h2.getField());
		System.out.println(h3.getField());
		if (cardNum == 0){
		    h3.draw(2, deck);
		}
		System.out.println(h3);
		System.out.println("Pick the index of the card you want to play:");
		System.out.println("Or: Enter 99 if you would like to end your turn.");
		index = Keyboard.readInt();
		if (index == 99) {
		    turns += 1;
		    cardNum = 0;
		}
		else {
		    //PROPRETY CARDS============================================
		    if (((Cards)(h3.hand.get(index))).getID() < 11){
			h3.addProperty(index);
		    }
		    //MONEY CARDS===============================================
		    else if (((Cards)(h3.hand.get(index))).getID() >= 11 && ((Cards)(h3.hand.get(index))).getID() <= 16) {
			h3.addBank(index);
		    }
		    //RENT CARDS ===============================================
		    else if (((Cards)(h3.hand.get(index))).getID() >= 17 && ((Cards)(h3.hand.get(index))).getID() <= 22) {
			h3.playRent(index);
		    }
		    //ACTION CARDS =============================================
		    else {
			System.out.println("If you want to play action, type 'play'. If you want to add to bank, type 'bank'.");
			if(Keyboard.readString().equals("play")){
			    h3.playAction(index);
			}
			else {
			    h3.addBank(index);
			}
		    }
		    cardNum += 1;
		}
		if (cardNum == 3) {
		    if (h3.hand.size() > 7) {
			System.out.println("You have too many cards in your hand. Please discard until you have 7 cards");
			for (int x = 0; x < h3.hand.size() - 7; x++) {
			    System.out.println(h3);
			    System.out.println("Pick the index of the card that you wish to discard");
			    index = Keyboard.readInt();
			    ((Human)h3).discard(index);
			} 
		    }
		    cardNum = 0;
		    turns += 1;
		}
	    }
	}		
    }

    public static void createDeck(ArrayList <Cards> deck) {
	//PROPERTY =============================================================

	//MONEY ================================================================
	Cards money0 = new Money(10, 11);
	Cards money1 = new Money(1, 12);
	Cards money2 = new Money(2, 13);
	Cards money3 = new Money(3, 14);
	Cards money4 = new Money(4, 15);
	Cards money5 = new Money(5, 16);
	for (int x = 0; x < 1; x++) {
	    deck.add(money0);
	}
	for (int x = 0; x < 6; x++) {
	    deck.add(money1);
	}
	for (int x = 0; x < 5; x++) {
	    deck.add(money2);
	}
	for (int x = 0; x < 3; x++) {
	    deck.add(money3);
	}
	for (int x = 0; x < 3; x++) {
	    deck.add(money4);
	}
	for (int x = 0; x < 2; x++) {
	    deck.add(money5);
	}
	
	//ACTION================================================================
	Cards action0 = new Action(5, 23, "Deal Breaker", "Steal a complete set of properties from any player (Includes any buildings).");
	Cards action1 = new Action(3, 24, "Debt Collector", "Force any player to pay you 5M.");
	Cards action2 = new Action(1, 25, "Double The Rent!", "Needs to be played with a rend card.");
	Cards action3 = new Action(3, 26, "Forced Deal", "Swap any property with another player (Cannot be part of a full set).");
	Cards action4 = new Action(4, 27, "Hotel", "Add onto any full set you own to add $4M to the rent value.");
	Cards action5 = new Action(3, 28, "House", "Add onto any full set you own to add $3M to the rent value.");
	Cards action6 = new Action(2, 29, "It's My Birthday!", "All players give you $2M as a 'gift'.");
	Cards action7 = new Action(4, 30, "Just Say No!", "Use any time when an action card is played against you.");
	Cards action8 = new Action(1, 31, "Pass GO", "Draw 2 extra cards.");
	Cards action9 = new Action(3, 32, "Sly Deal", "Steal a property from the player of your choice (Cannot be part of a full set).");
	for (int x = 0; x < 2; x++) {
	    deck.add(action0);
	}
	for (int x = 0; x < 3; x++) {
	    deck.add(action1);
	}
	for (int x = 0; x < 2; x++) {
	    deck.add(action2);
	}
	for (int x = 0; x < 4; x++) {
	    deck.add(action3);
	}
	for (int x = 0; x < 3; x++) {
	    deck.add(action4);
	}
	for (int x = 0; x < 3; x++) {
	    deck.add(action5);
	}
	for (int x = 0; x < 3; x++) {
	    deck.add(action6);
	}
	for (int x = 0; x < 3; x++) {
	    deck.add(action7);
	}
	for (int x = 0; x < 10; x++) {
	    deck.add(action8);
	}
	for (int x = 0; x < 3; x++) {
	    deck.add(action9);
	}
	
	//RENT==================================================================

    }

    private static void swap( int i, int j, ArrayList <Cards> Deck) {
	Deck.set( i, Deck.set(j, Deck.get(i) ) );
    }
    
    public static void shuffle (ArrayList <Cards> Deck) {
    	for (int i = 0; i < Deck.size(); i += 1) {
	    swap(i, (int)(Math.random() * Deck.size()), Deck);
	}
    }
}

