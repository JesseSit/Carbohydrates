public class Rent extends Cards {
    private String color0;
    private String color1;
    private boolean Multicolor;
    private boolean payAll;

    public Rent (){
	super;
	color0 = "NA";
	color1 = "NA";
	Multicolor = false;
	payAll = false
    }

    public Rent(String Color0, String Color1, boolean multi, boolean payall) {
	color0 = Color0;
	color1 = Color1;
	Multicolor = multi;
	payAll = payall
    }
}
