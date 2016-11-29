package main.Enum;

/**
 * Created by Bashark on 2016/11/29.
 */
public class EnumImplementation {
    public static <T> void printNext(Generator<T> rg) {
        System.out.println(rg.next());
    }

    public static void main(String[] args) {
        CartoonCharacter cc = CartoonCharacter.BOB;
        for (int i = 0; i < 10; i++) {
            printNext(cc);
        }
    }
}
