import cs1.Keyboard;
import java.util.ArrayList;

//game executer file
public class Woo{
    
    public static void main(String[] args) {
	int turns = 0;
	int cardNum = 0;
	//setup game by shuffling deck
	
	//create deck
	ArrayList <Cards> deck = new ArrayList<Cards>();
	Cards temp = new DarkBlue("boardwalk", 4, 0, 3, 8, 0, 0, 2);
	Cards temp1 = new DarkBlue("park place", 4, 0, 3, 8, 0, 0, 2);

	deck.add(temp1);
	for (int i = 0; i < 100; i++) {
	    deck.add(temp);
	}
	
	System.out.println("Please select the number of players (2-4):");
	//create players
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
	int index;
	while (cardNum < 3){
	    if ((turns % amtPlayers) == 0){
		System.out.println(h0);
		System.out.println("Pick the index of the card you want to play:");
		index = Keyboard.readInt();
		if (((Cards)(h0.hand.get(index))).getID() < 11){
		    h0.addProperty(index);
		}
		h0.drawOne(deck);
	    }
	    if ((turns % amtPlayers) == 1){
		System.out.println(h1); 
		System.out.println("Pick the index of the card you want to play:");
		index = Keyboard.readInt();
		if (((Cards)(h1.hand.get(index))).getID() < 11){
		    h1.addProperty(index);
		}
		h1.drawOne(deck);
	    }
	    if ((turns % amtPlayers) == 2){
		System.out.println(h2);
		System.out.println("Pick the index of the card you want to play:");
		index = Keyboard.readInt();
		if (((Cards)(h2.hand.get(index))).getID() < 11){
		    h2.addProperty(index);
		}
		h2.drawOne(deck);
	    }
	    if ((turns % amtPlayers) == 3){
		System.out.println(h3);
		System.out.println("Pick the index of the card you want to play:");
		index = Keyboard.readInt();
		if (((Cards)(h3.hand.get(index))).getID() < 11){
		    h3.addProperty(index);
		}
		h3.drawOne(deck);
	    }
	    cardNum += 1;
	    if (cardNum == 3) {
		cardNum = 0;
		turns += 1;
	    }
	}
	
	

	//deal hands
	
	
	
	
	
    }

}
