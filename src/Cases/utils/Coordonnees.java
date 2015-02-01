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

    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    @Override
    public String toString() {
        return "col " + getCol() + " ligne " + getLigne();
    }
}
