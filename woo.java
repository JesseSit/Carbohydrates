import cs1.Keyboard;
import java.util.ArrayList;

//game executer file
public class woo{
    
    public static void main(String[] args) {
	//setup game by shuffling deck
	System.out.println("Please select the number of players (2-4)");
	//create players
	int amtPlayers = Keyboard.readInt();
	if (amtPlayers > 4 || amtPlayers < 2) {
	    System.out.println("Not in player range!");
	}
	Player human0 = new Human(); 
	Player human1 = new Human(); 
	Player human2 = new Human();
	Player human3 = new Human();
	
	//create deck
	ArrayList <Cards> deck = new ArrayList<Cards>();
	Cards temp = new DarkBlue("broadwalk", 3, 8, 0, 0, 2);
	
	for (int i = 0; i < 100; i++) {
	    deck.add(temp);
	}

	//deal hands
	human0.drawOne(deck);
	human1.drawOne(deck);
	human2.drawOne(deck);
	human3.drawOne(deck);
<<<<<<< HEAD
	System.out.println(human1);
	
=======
>>>>>>> 134100d9152168792f83f34450e2093abd630546
    }

}
