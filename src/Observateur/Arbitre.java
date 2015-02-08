package Observateur;

public class Arbitre extends SujetObserveAbstrait {

    private int iter = 10;

    @Override
    public void update() {
        iter--;
        if (iter == 0) {
            System.out.println("STOP!");
            for (ObservateurAbstrait o : liste) {
                o.update();
            }
            iter = 10;
        }
    }
}
