import java.util.ArrayList;

public class Human extends Player {
    

    public Human(){
	name = "";
	hand = new ArrayList<Cards>();
	bank = new ArrayList<Cards>();
	property = new ArrayList<PropHelper> ();
    }

    public Human(String Name){
	name = Name;
	hand = new ArrayList<Cards>();
	bank = new ArrayList<Cards>();
	property = new ArrayList <PropHelper>();
	PropHelper PropHelper0 = new PropHelper("Brown", 0);
	property.add(PropHelper0);
	PropHelper PropHelper1 = new PropHelper("DarkBLue", 0);
	property.add(PropHelper1);
	PropHelper PropHelper2 = new PropHelper("Green", 0);
	property.add(PropHelper2);
	PropHelper PropHelper3 = new PropHelper("LightBlue", 0);
	property.add(PropHelper3);
	PropHelper PropHelper4 = new PropHelper("Orange", 0);
	property.add(PropHelper4);
	PropHelper PropHelper5 = new PropHelper("Purple", 0);
	property.add(PropHelper5);
	PropHelper PropHelper6 = new PropHelper("Railroad", 0);
	property.add(PropHelper6);
	PropHelper PropHelper7 = new PropHelper("Red", 0);
	property.add(PropHelper7);
	PropHelper PropHelper8 = new PropHelper("Utility", 0);
	property.add(PropHelper8);
	PropHelper PropHelper9 = new PropHelper("Yellow", 0);
	property.add(PropHelper9);
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
