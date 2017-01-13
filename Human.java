import java.util.ArrayList;

public class Human extends Player {
    public Human(){
	hand = new ArrayList<Cards>();
    }
    public String toString(){
	System.out.println(hand.get(0));
	return "";
    }
}
