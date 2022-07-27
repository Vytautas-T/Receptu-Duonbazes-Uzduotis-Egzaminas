package Entity;

public class ReceptaiIngredientai {
    private int receptoID;
    private  int ingredientoID;

    public ReceptaiIngredientai(int receptoID, int ingredientoID) {
        this.receptoID = receptoID;
        this.ingredientoID = ingredientoID;
    }

    public ReceptaiIngredientai(int receptoID) {
    }

    public int getReceptoID() {
        return receptoID;
    }

    public void setReceptoID(int receptoID) {
        this.receptoID = receptoID;
    }

    public int getIngredientoID() {
        return ingredientoID;
    }

    public void setIngredientoID(int ingredientoID) {
        this.ingredientoID = ingredientoID;
    }

    @Override
    public String toString() {
        return "ReceptaiIngredientai{" +
                "receptoID=" + receptoID +
                ", ingredientoID=" + ingredientoID +
                '}';
    }
}
