import java.util.ArrayList;

public class Human extends Player {
    

    public Human(){
	name = "";
	hand = new ArrayList<Cards>();
	bank = new ArrayList<Cards>();
	property = new ArrayList<Property>();
    }

    public Human(String Name){
	name = Name;
	hand = new ArrayList<Cards>();
	bank = new ArrayList<Cards>();
	property = new ArrayList<Property>();
    }

    public String toString(){
        String retStr = "Current player: " + name + "\n\n";
	retStr += "Hand:" + "\n";
	for (int x = 0; x < hand.size(); x++){
	    retStr += x + " : ";
	    retStr += hand.get(x) + "\n";
	}
	return retStr;
    }
    
    public void discard(int index){
	System.out.println(hand.remove(index));
    }
}
