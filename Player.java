import java.util.ArrayList;

public class Player {
    protected ArrayList<Cards> hand;

    public void draw(int amtDraw, ArrayList<Cards> deck) {
	for (int i = 0; i < amtDraw; i++) {
	    hand.add(deck.remove(0));
	}
    }
	    
    public void drawOne(ArrayList<Cards> deck) {
	    hand.add(deck.remove(0));
    }

}
