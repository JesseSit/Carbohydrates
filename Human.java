import java.util.ArrayList;

public class Human extends Player {
    public Human(){
	hand = new ArrayList<Cards>();
    }
    public String toString(){
        String retStr = "";
	retStr += "HAND" + "\n";
	for (int x = 0; x < hand.size(); x++){
	    retStr += x + " : ";
	    retStr += hand.get(x) + "\n";
	}
	return retStr;
    }
}
