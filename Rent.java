public class Rent extends Cards {
    private String color0;
    private String color1;
    private boolean Multicolor;

    public Rent (){
	super();
	color0 = "NA";
	color1 = "NA";
	Multicolor = false;
    }

    public Rent(int Val, int id, String Color0, String Color1, boolean multi) {
	super(Val, id);
	color0 = Color0;
	color1 = Color1;
	Multicolor = multi;
    }

    public String toString() {
	String retStr = "";
	retStr += "Rent Card :    ";
	if (Multicolor) {
	    retStr += "Multicolor rent";
	}
	else {
	    retStr += "Color0 : " + color0 + ", ";
	    retStr += "Color1 : " + color1;
	}
	return retStr;
    }
}
