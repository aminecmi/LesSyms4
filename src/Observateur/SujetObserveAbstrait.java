package Observateur;

import java.util.ArrayList;

public abstract class SujetObserveAbstrait {

    final ArrayList<ObservateurAbstrait> liste;

    SujetObserveAbstrait() {
        liste = new ArrayList<ObservateurAbstrait>();
    }

    public void attach(ObservateurAbstrait observateurAbstrait) {
        liste.add(observateurAbstrait);
    }


    public void remove(ObservateurAbstrait observateurAbstrait) {
        liste.remove(observateurAbstrait);
    }

    public abstract boolean update();
}
