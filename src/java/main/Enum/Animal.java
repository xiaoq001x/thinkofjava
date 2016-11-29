package main.Enum;

/**
 * Created by Bashark on 2016/11/28.
 */
public enum Animal {
    dog, cat, bear;

    public static Animal getAnimal(String animal) {
        return valueOf(animal.toLowerCase());
    }
}