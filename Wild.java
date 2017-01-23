public class Wild extends Property {
    private String color0;
    private String color1;
    private boolean Multi_color; 

    public Wild (){
	super();
	color0 = "";
	color1 = "";
	Multi_color = true;
    }
    
    public Wild(int Val, String c0, String c1, boolean x) {
	value = Val;
	ID = 10;
	color0 = c0;
	color1 = c1;
	Multi_color = x;
    }
    public String toString(){
	String retStr = "";
	retStr += "Wild card: ";
	if (Multi_color == true){
	    retStr += "MultiColor Property";
	}
	else {
	    retStr += "color one: " + color0 + ", ";
	    retStr += "color two: " + color1;
	}
	return retStr;
    }
}
