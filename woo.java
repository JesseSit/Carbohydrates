import cs1.Keyboard;
import java.util.ArrayList;

//game executer file
public class woo{
    
    public static void main(String[] args) {
	int turns = 0;
	int cardNum = 0;
	//setup game by shuffling deck
	
	//create deck
	ArrayList <Cards> deck = new ArrayList<Cards>();
	Cards temp = new DarkBlue("broadwalk", 3, 8, 0, 0, 2);
	Cards temp1 = new DarkBlue("park place", 3, 8, 0, 0, 2);

	deck.add(temp1);
	for (int i = 0; i < 100; i++) {
	    deck.add(temp);
	}
	
	System.out.println("Please select the number of players (2-4)");
	//create players
	int amtPlayers = Keyboard.readInt();
	if (amtPlayers > 4 || amtPlayers < 2) {
	    System.out.println("Not in player range!");
	}
	    Player h0 = new Human();
	    if (amtPlayers > 0){
		h0.draw(5, deck);
	    }
	    Player h1 = new Human();
	    if (amtPlayers > 1){
		h1.draw(5, deck);
	    }
	    Player h2 = new Human();
	    if (amtPlayers > 2){
		h2.draw(5, deck);
	    }
	    Player h3 = new Human();
	    if (amtPlayers > 3){
		h3.draw(5, deck);
	    }
	int index;
	while (cardNum < 3){
	    if ((turns % amtPlayers) == 0){
		System.out.println("Pick the index of the card you want to play");
	    index = Keyboard.readInt();
		h0.play(index);
	    }
	    cardNum += 1;
	}
	
	

	//deal hands
	
	
	
	
	
    }

}
