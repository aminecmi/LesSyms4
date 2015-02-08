import Fabriques.Objets.FabriqueObjetBattleSnow;
import Fabriques.Objets.FabriqueObjetBattleZone;
import Fabriques.Objets.FabriqueObjetFootball;
import Fabriques.Personnages.FabriquePersonnagesBattleSnow;
import Fabriques.Personnages.FabriquePersonnagesBattleZone;
import Fabriques.Personnages.FabriquePersonnagesFootball;
import Fabriques.Plateau.FabriquePlateauBattleSnow;
import Fabriques.Plateau.FabriquePlateauBattleZone;
import Fabriques.Plateau.FabriquePlateauFootball;
import Fabriques.Scenario.FabriqueScenarioBattleSnow;
import Fabriques.Scenario.FabriqueScenarioBattleZone;
import Fabriques.Scenario.FabriqueScenarioFootball;

import java.util.Scanner;

class Main {
    public static void main(String[] args){
        System.out.println("1 -> BattleZone");
        System.out.println("2 -> Batle Snow");
        System.out.println("3 -> Foot");
        Scanner s = new Scanner(System.in);
        int choix = s.nextInt();
        SimulationJeu sim = null;
        if (choix == 1) {
            sim = new SimulationJeu(new FabriqueScenarioBattleZone(new FabriquePlateauBattleZone(), new FabriquePersonnagesBattleZone(), new FabriqueObjetBattleZone()));
        }
        if (choix == 2) {
            sim = new SimulationJeu(new FabriqueScenarioBattleSnow(new FabriquePlateauBattleSnow(), new FabriquePersonnagesBattleSnow(), new FabriqueObjetBattleSnow()));
        }
        if (choix == 3) {
            sim = new SimulationJeu(new FabriqueScenarioFootball(new FabriquePlateauFootball(), new FabriquePersonnagesFootball(), new FabriqueObjetFootball()));
        }
        sim.lancerJeu();
    }
}
