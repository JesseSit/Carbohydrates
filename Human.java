import java.util.ArrayList;

public class Human extends Player {
    public String name;
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
}
