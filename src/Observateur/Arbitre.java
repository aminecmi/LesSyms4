package Observateur;

import java.util.Random;

public class Arbitre extends SujetObserveAbstrait {

    private int max = 10;
    private int tour = 1;

    public Arbitre() {
        max = new Random().nextInt(10) + 10;
    }

    @Override
    public boolean update() {
        System.out.println("----------------- TOUR NUMERO " + tour + " ------------------");
        tour++;
        if (tour == max) {
            System.out.println("STOP!");
            for (ObservateurAbstrait o : liste) {
                o.update();
            }
            return false;
        }
        return true;
    }
}
