package university.fmi.oop.utility;

import university.fmi.oop.constant.Constant;

import java.util.Random;

/**
 * A class that generates random numbers
 */
public class RandomGenerator {

    private RandomGenerator() {
        // default private constructor that prevents creating an objects of this class
    }

    public static int generate() {
        return generate(Constant.DEFAULT_MIN_VALUE, Constant.DEFAULT_MAX_VALUE);
    }

    public static int generate(int min, int max) {
        Random random = new Random();

        return random.nextInt(max - min) + min;
    }
}
