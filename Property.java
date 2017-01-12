public class Property extends Cards {
    protected String name;
    protected int[] rentVal[] = new int[3];
    protected int setNum;
    public Property (){
	name = "";
	rentVal[0] = [];
	setNum = 0;
    }
    public Property (String Name, int rentVal0, int rentVal1, int rentVal2, int SetNum){
	name = Name;
	rentVal[0] = rentVal0;
	rentVal[1] = rentVal1;
	rentval[2] = rentVal2;
	setNum = SetNum;
    }
}
