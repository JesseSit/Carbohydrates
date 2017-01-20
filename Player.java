import java.util.ArrayList;

public class Player {
    protected ArrayList hand;
    protected ArrayList bank;
    protected ArrayList property;
   
    public void play(int index){
	System.out.println(hand.remove(index));
    }

    public void draw(int amtDraw, ArrayList<Cards> deck) {
	for (int i = 0; i < amtDraw; i++) {
	    drawOne(deck);
	    //hand.add(deck.remove(0));
	}
    }
	    
    public void drawOne(ArrayList<Cards> deck) {
	hand.add(deck.remove(0));
    }

    public void addProperty(int index) {
	    property.add(hand.remove(index));
    }
    public void addBank(int index) {
	    bank.add(hand.remove(index));
    }
}
