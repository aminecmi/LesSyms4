package Comportements;

import Cases.CaseAbstraite;
import Objets.ObjetAbstrait;
import Person.Personnage;
import utils.Tuple;

import java.util.ArrayList;

public interface ComportementAction {
    public void executerAction(Personnage joueur, Tuple<ArrayList<Personnage>, ArrayList<ObjetAbstrait>, ArrayList<CaseAbstraite>> t);
}
