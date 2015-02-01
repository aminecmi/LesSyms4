package Cases;

import java.awt.*;

public class CaseColore extends CaseAbstraite {
    Color couleur;

    public CaseColore(int vert, int hor) {
        super(vert, hor);
        this.couleur = Color.WHITE;
    }

    public String affichageSpecial() {
        if (this.couleur.getRGB() < 0)
            return String.valueOf(String.valueOf(this.couleur.getRGB()).charAt(0));
        return " ";
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }
}
