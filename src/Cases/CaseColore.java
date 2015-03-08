package Cases;

import java.awt.*;

public class CaseColore extends CaseAbstraite {
    private Color couleur;

    public CaseColore(int vert, int hor) {
        super(vert, hor);
        this.couleur = Color.WHITE;
    }

    public String affichageSpecial() {
        if (Color.white.getRGB() != this.couleur.getRGB()) {
            return this.couleur.getBlue() + this.couleur.getRed() + this.couleur.getGreen() + "";
        }
        return " ";
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }
}
