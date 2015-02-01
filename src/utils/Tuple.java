package utils;

public class Tuple<P, O, C> {
    public final P p;
    public final O o;
    public final C c;

    public Tuple(P p, O o, C c) {
        this.p = p;
        this.o = o;
        this.c = c;
    }
}