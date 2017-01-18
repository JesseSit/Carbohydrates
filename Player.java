import java.util.ArrayList;

public class Player {
    protected ArrayList hand;
    protected ArrayList bank;
    protected ArrayList properties;
   
    public void play(int index){
	System.out.println(hand.remove(index));
    }

    public void draw(int amtDraw, ArrayList<Cards> deck) {
	for (int i = 0; i < amtDraw; i++) {
	    hand.add(deck.remove(0));
	}
    }
	    
    public void drawOne(ArrayList<Cards> deck) {
	Cards temp = deck.get(0);
	deck.remove(0);
	hand.add(temp);
    }

    public void addProperty(int index) {
	if (((Cards)hand.get(index)).getID() < 10) {
	    bank.add(hand.remove(index));
	}
    }
}
