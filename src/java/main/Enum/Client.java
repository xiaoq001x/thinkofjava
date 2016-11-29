package main.Enum;

/**
 * Created by Bashark on 2016/11/28.
 */
public class Client {
    public void caseAnimal(String animal) {
        switch (Animal.getAnimal(animal)) {
            case cat:
                System.out.println("this is a cat" + Animal.cat);
                break;
            case dog:
                System.out.println("this is a dog");
                break;
            case bear:
                System.out.println("this is a bear");
                break;
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Client client = new Client();
        client.caseAnimal("cat");
    }
}
