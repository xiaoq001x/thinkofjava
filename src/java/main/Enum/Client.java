package main.Enum;

/**
 * Created by Bashark on 2016/11/28.
 */

import static main.Enum.Animal.*;

public class Client {
    public void caseAnimal(String animal) {
        switch (Animal.getAnimal(animal)) {
            case CAT:
                System.out.println("this is " + CAT.name());
                break;
            case dog:
                System.out.println("this is " + dog.name());
                break;
            case bear:
                System.out.println("this is " + bear.name());
                break;
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Client client = new Client();
        client.caseAnimal("CAT");
    }
}
