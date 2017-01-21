public class Money extends Cards {

    public Money () {
	super();
    }
    
    public Money (int Value, int id) {
	super(Value, id);
    }

    public String toString() {
	String retStr = "";
	retStr += "money : value : " + value;
	return retStr;
    }
}
