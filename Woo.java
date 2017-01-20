import cs1.Keyboard;
import java.util.ArrayList;

//game executer file
public class Woo{
    
    public static void main(String[] args) {
	int turns = 0;
	int cardNum = 0;
	
//CREATE DECK ==================================================================
	ArrayList <Cards> deck = new ArrayList<Cards>();
	Cards temp = new DarkBlue("boardwalk", 4, 0, 3, 8, 0, 0, 2);
	Cards temp1 = new DarkBlue("park place", 4, 0, 3, 8, 0, 0, 2);
	Cards temp2 = new Rent(1, 15, "Blue", "Green", false);
	Cards temp3 = new Rent(1, 16, "NA", "NA", true);

	deck.add(temp1);
	deck.add(temp2);
	deck.add(temp3);
	for (int i = 0; i < 100; i++) {
	    deck.add(temp);
	}
	
	System.out.println("Please select the number of players (2-4):");

//CREATE PLAYERS ===============================================================
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
		    //PROPRETY CARDS===================================
		    if (((Cards)(h0.hand.get(index))).getID() < 11){
			h0.addProperty(index);
		    }
		    //MONEY CARDS================================
		    else if (((Cards)(h0.hand.get(index))).getID() >= 11 && ((Cards)(h0.hand.get(index))).getID() <= 16) {
			h0.addBank(index);
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
		    if (((Cards)(h1.hand.get(index))).getID() < 11){
			h1.addProperty(index);
		    }
		    //MONEY CARDS================================
		    else if (((Cards)(h1.hand.get(index))).getID() >= 11 && ((Cards)(h1.hand.get(index))).getID() <= 16) {
			h1.addBank(index);
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
		    if (((Cards)(h2.hand.get(index))).getID() < 11){
			h2.addProperty(index);
		    }
		    //MONEY CARDS================================
		    else if (((Cards)(h2.hand.get(index))).getID() >= 11 && ((Cards)(h2.hand.get(index))).getID() <= 16) {
			h2.addBank(index);
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
		    if (((Cards)(h3.hand.get(index))).getID() < 11){
			h3.addProperty(index);
		    }
		    //MONEY CARDS================================
		    else if (((Cards)(h3.hand.get(index))).getID() >= 11 && ((Cards)(h3.hand.get(index))).getID() <= 16) {
			h3.addBank(index);
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
}
