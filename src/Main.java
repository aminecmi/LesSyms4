import Fabriques.Personnages.FabriquePersonnagesBattleZone;
import Fabriques.Plateau.FabriquePlateauBattleZone;
import Fabriques.Scenario.FabriqueScenarioMoyenAge;

public class Main {
    public static void main(String[] args){
        SimulationJeu s = new SimulationJeu(new FabriqueScenarioMoyenAge(new FabriquePlateauBattleZone(), new FabriquePersonnagesBattleZone()));
        s.lancerJeu();
    }
}
