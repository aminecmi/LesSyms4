package Person;

import Cases.CaseAbstraite;
import Comportements.ComportementAction;
import Composition.EquipeDeFoot;
import Composition.GroupeAbstrait;
import Objets.ObjetBallon;

import java.util.ArrayList;
import java.util.Random;

public class PersonnageFootball extends Personnage {

    private EquipeDeFoot equipe;

    public PersonnageFootball(String name, double lifePoint, double strength, double speed, int portee, ComportementAction parDefaut) {
        super(name, lifePoint, strength, speed, portee, parDefaut);
        // TODO Auto-generated constructor stub
    }


    public GroupeAbstrait getEquipe() {
        return equipe;
    }

    public void setEquipe(EquipeDeFoot equipe) {
        this.equipe = equipe;
    }

    public void lancerBallon(ObjetBallon objetOccupant, ArrayList<CaseAbstraite> cases) {
        int size = cases.size();
        int item = new Random().nextInt(size);
        CaseAbstraite dest = cases.get(item);

        objetOccupant.setCaseCourante(dest);
        dest.setObjetOccupant(objetOccupant);
    }
}
