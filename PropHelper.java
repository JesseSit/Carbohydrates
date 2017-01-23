public class PropHelper {
    
    private String color;
    private int amt;
    public int[] rentVal;
    public int setNum;

    public PropHelper(String newColor, int newAmt, int rent0, int rent1, int rent2, int rent3, int setnum) {
	color = newColor;
	amt = newAmt;
	rentVal = new int[4];
	rentVal[0] = rent0;
	rentVal[1] = rent1;
	rentVal[2] = rent2;
	rentVal[3] = rent3;
	setNum = setnum;
    }
    
    public String getColor() {
	return color;
    }

    public int getAmt() {
	return amt;
    }

    public String toString() {
	String retStr = "";
	retStr += color;
	retStr += " : ";
	retStr += amt;
	retStr += "\n";
	return retStr;
    }

    public void addOne() {
	amt += 1;
    }
}
