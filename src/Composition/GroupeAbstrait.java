package Composition;

import Person.Personnage;

import java.util.ArrayList;

public class GroupeAbstrait extends PersonnagesAbstraits {
    ArrayList<Personnage> list = new ArrayList<Personnage>();

    public GroupeAbstrait(ArrayList<Personnage> list) {
        this.list = list;
    }

    public ArrayList<Personnage> getList() {
        return list;
    }

    public void setList(ArrayList<Personnage> list) {
        this.list = list;
    }
}
