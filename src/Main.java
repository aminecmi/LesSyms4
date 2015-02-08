import Fabriques.Objets.FabriqueObjetBattleZone;
import Fabriques.Personnages.FabriquePersonnagesBattleZone;
import Fabriques.Plateau.FabriquePlateauBattleZone;
import Fabriques.Scenario.FabriqueScenarioBattleZone;

class Main {
    public static void main(String[] args){
        SimulationJeu s = new SimulationJeu(new FabriqueScenarioBattleZone(new FabriquePlateauBattleZone(), new FabriquePersonnagesBattleZone(), new FabriqueObjetBattleZone()));
        s.lancerJeu();
    }
}
