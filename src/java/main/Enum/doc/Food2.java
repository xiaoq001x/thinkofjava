package main.Enum.doc;

import main.Enum.Food;

/**
 * Created by Bashark on 2016/11/29.
 */
public interface Food2 extends Food {
    enum Appetizer implements Food {
        SALAD, SOUP, SPING_ROLLS, WATER
    }
}
