package Observateur;


public class Organisation extends SujetObserveAbstrait {
    protected Organisation parent;

    public Organisation() {
        this.parent = null;
    }

    public Organisation(Organisation parent) {
        this.parent = parent;
    }

    @Override
    public void update() {

    }
}
