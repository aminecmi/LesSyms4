package Cases.utils;

public class Coordonnees {
    private int col;
    private int ligne;

    public Coordonnees(int vert, int hor) {
        this.col = vert;
        this.ligne = hor;
    }

    public int getLigne() {
        return ligne;
    }

    public int getCol() {
        return col;
    }

    @Override
    public String toString() {
        return "col " + getCol() + " ligne " + getLigne();
    }
}
