package Composition;

import java.util.ArrayList;

public class GroupeAbstrait extends PersonnagesAbstraits {
    ArrayList<PersonnagesAbstraits> list = new ArrayList<PersonnagesAbstraits>();

    public GroupeAbstrait(ArrayList<PersonnagesAbstraits> list) {
        this.list = list;
    }
}
