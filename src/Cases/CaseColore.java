package Cases;

import java.awt.*;

public class CaseColore extends CaseAbstraite {
    Color couleur;

    public CaseColore(int vert, int hor) {
        super(vert, hor);
        this.couleur = Color.WHITE;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }
}
