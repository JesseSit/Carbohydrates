import java.util.ArrayList;

public class Player {
    protected ArrayList hand;
    protected ArrayList bank;
    protected ArrayList property;
    protected String name;

    public String getField(){
	String retStr = name + "'s field:" + "\n\n";
	retStr += "Bank:" + "\n";
	for (int y = 0; y < bank.size(); y++){
	    retStr += y + " : ";
	    retStr += "$" + ((Cards)(bank.get(y))).getVal() + "\n";
	}
	retStr += "Property:" + "\n";
	for (int z = 0; z < property.size(); z++){
	    retStr += z + " : ";
	    retStr += property.get(z) + "\n";
	}
	return retStr;
    }
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
    public void playRent(int index) {
	hand.remove(index);
    }
    public void playAction(int index) {
	hand.remove(index);
    }
}
