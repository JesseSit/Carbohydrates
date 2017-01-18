public abstract class Cards {
    protected int value;
    protected int ID;
    public Cards (){
	value = 0;
	ID = 0;
    }
    public Cards (int Val, int id){
	value = Val;
	ID = id;
    }
    public int getID(){
	return ID;
    }
    public int getVal(){
	return value;
    }
}
