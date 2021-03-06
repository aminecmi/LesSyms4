package Cases.utils;

import java.util.Random;

class RandomPointCardinal<E extends Enum> {

    private static final Random RND = new Random();
    private final E[] values;

    public RandomPointCardinal(Class<E> token) {
        values = token.getEnumConstants();
    }

    public E random() {
        return values[RND.nextInt(values.length)];
    }
}
