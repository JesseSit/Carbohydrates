import java.util.ArrayList;

public class Human extends Player {
    public Human(){
	hand = new ArrayList<Cards>();
    }
    public String toString(){
        String retStr = "";
	for (int x = 0; x < hand.size(); x++){
	    retStr += hand.get(x) + "\n";
	}
	return retStr;
    }
}
