public class Action extends Cards {
    private String name;
    private String desc;

    public Action() {
	super();
	name = "";
	desc = "";
    }

    public Action(int Val, int id, String newName, String newDesc) {
	super(Val, id);
	name = newName;
	desc = newDesc;
    }

    public String readDesc() {
	return desc;
    }
}
