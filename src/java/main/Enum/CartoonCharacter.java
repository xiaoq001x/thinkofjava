package main.Enum;

import java.util.Random;

/**
 * Created by Bashark on 2016/11/29.
 */
public enum CartoonCharacter implements Generator {
    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
    private Random rand = new Random(47);

    @Override
    public CartoonCharacter next() {
        return values()[rand.nextInt(values().length)];
    }
}
