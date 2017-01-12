import cs1.Keyboard;

//game executer file
public class woo{
    
    

    public static void main(String[] args) {
	//setup game by shuffling deck
	System.out.println("Please select the number of players (2-4)");
	int amtPlayers = Keyboard.readInt();
	if (amtPlayers == 2) {
	    Player human0 = new Human(); 
	    Player human1 = new Human(); 
	}
	else if (amtPlayers == 3) {
	    Player human0 = new Human(); 
	    Player human1 = new Human(); 
	    Player human2 = new Human(); 
	}
	else if (amtPlayers == 4) {
	    Player human0 = new Human(); 
	    Player human1 = new Human(); 
	    Player human2 = new Human();
 	    Player human3 = new Human(); 
	}
	else {
	    System.out.println("Not in player range!");
	}
    }
}
