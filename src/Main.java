import Comportements.ComportementAPiedAvecHache;
import Comportements.ComportementParlerCommeUnePrincesse;

public class Main {
    public static void main(String[] args){
        SimulationJeu s = new SimulationJeu();
        s.creationPersonnages();
        System.out.println(s.afficheTous());
        System.out.println(s.emmetreUnSonTous());
        System.out.println(s.lancerCombar());
        s.changerComportementCombat(s.liste.get(0), new ComportementAPiedAvecHache());
        s.changerComportementEmmetreSon(s.liste.get(0), new ComportementParlerCommeUnePrincesse());
        System.out.println(s.emmetreUnSonTous());
        System.out.println(s.lancerCombar());
    }
}
