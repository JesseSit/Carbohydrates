public class PropHelper {
    
    private String color;
    private int amt;

    public PropHelper(String newColor, int newAmt) {
	color = newColor;
	amt = newAmt;
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
