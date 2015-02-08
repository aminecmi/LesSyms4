package Composition;

import Person.Personnage;

import java.util.ArrayList;

public class EquipeDeFoot extends GroupeAbstrait {

    private final String nom;

    public EquipeDeFoot(ArrayList<Personnage> list) {
        super(list);
        this.nom = "Equipe";
    }

    public EquipeDeFoot(ArrayList<Personnage> list, String nom) {
        super(list);
        this.nom = nom;

    }
}
