package main.Enum;

/**
 * Created by Bashark on 2016/11/29.
 */
public enum Activity {
    SITTING, LYING, STANDING, HOPPING, RUNING, DODGING, JUMPING, FALLING, FLYING;

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++)
            System.out.println(Enums.random(Activity.class));
    }
}
