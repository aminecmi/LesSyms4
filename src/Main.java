import Fabriques.Personnages.FabriquePersonnagesBattleZone;
import Fabriques.Plateau.FabriquePlateauBattleZone;
import Fabriques.Scenario.FabriqueScenarioMoyenAge;
import Person.eMode;

public class Main {
    public static void main(String[] args){
        SimulationJeu s = new SimulationJeu(new FabriqueScenarioMoyenAge(new FabriquePlateauBattleZone(), new FabriquePersonnagesBattleZone()));
        s.creationPersonnages();
        System.out.println(s.afficheTous());
        System.out.println(s.emmetreUnSonTous());
        System.out.println(s.lancerCombar());
        s.changerEtat(eMode.GUERRE);
        System.out.println(s.lancerCombar());
    }
}
