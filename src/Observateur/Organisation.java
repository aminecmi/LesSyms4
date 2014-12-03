package Observateur;


import Person.eMode;

public class Organisation extends SujetObserveAbstrait {
    protected eMode modeFonctionnement;
    protected Organisation parent;

    public Organisation() {
        this.modeFonctionnement = eMode.ND;
        this.parent = null;
    }

    public Organisation(Organisation parent) {
        this.modeFonctionnement = eMode.ND;
        this.parent = parent;
    }

    public void setModeFonctionnement(eMode modeFonctionnement) {
        this.modeFonctionnement = modeFonctionnement;
        this.update();
    }

    @Override
    public void update() {
        for (ObservateurAbstrait o : liste) {
            o.update(modeFonctionnement);
        }
    }
}
