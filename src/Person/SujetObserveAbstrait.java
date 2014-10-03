package Person;

import java.util.ArrayList;

public abstract class SujetObserveAbstrait {

    ArrayList<ObservateurAbstrait> liste;

    protected SujetObserveAbstrait() {
        liste = new ArrayList<ObservateurAbstrait>();
    }

    public void attach(ObservateurAbstrait observateurAbstrait) {
        liste.add(observateurAbstrait);
    }


    public void remove(ObservateurAbstrait observateurAbstrait) {
        liste.remove(observateurAbstrait);
    }

    public abstract void update();
}
