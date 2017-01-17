public abstract class Property extends Cards {
    protected String name;
    protected int[] rentVal = new int[4];
    protected int setNum;
    public Property (){
	name = "";
	rentVal[0] = 0;
	rentVal[1] = 0;
	rentVal[2] = 0;
	rentVal[3] = 0;
	setNum = 0;
    }
    public Property (int Val, int id, int rentVal0, int rentVal1, int rentVal2, int rentVal3, int SetNum){
	super(Val, id);
	rentVal[0] = rentVal0;
	rentVal[1] = rentVal1;
	rentVal[2] = rentVal2;
	rentVal[3] = rentVal3;
	setNum = SetNum;
    }
    public int getID(){
	return ID;
    }
    public String toString(){
	String retStr = "";
	retStr += "name: " + name + ", ";
	retStr += "value: " + value + ", ";
	retStr += "rent for one:" + rentVal[0] + ", ";
	retStr += "rent for two:" + rentVal[1] + ", ";
	if (rentVal[2]!= 0){
	    retStr += "rent for three:" + rentVal[2] + ", ";
	}
	if (rentVal[3] != 0){
	    retStr += "rent for four:" + rentVal[3] + ", ";
	}
	retStr += "full set:" + setNum;
	return retStr;
    }
}
