import java.util.ArrayList;

public class Player {
    protected ArrayList hand;
    public String toString(){
	for (int x = 0; x < hand.size(); x++){
	    System.out.println(hand.get(x));
	}
	return "";
    }
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

}
