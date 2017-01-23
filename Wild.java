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
    
    public Wild(int Val, int id, int rentVal0, int rentVal1, int rentVal2, int rentVal3, int setNum, String c0, String c1, boolean x) {
	super(Val, id, rentVal0, rentVal1, rentVal2, rentVal 3, setNum, c0, c1, x);
	color0 = c0;
	color1 = c1;
	Multi_color = x;
    }
}
