import AllAniaml.Animal;
import AllAniaml.Cow;
import AllAniaml.Lion;

public class Tester {
    public static void main(String[]args){
        Animal animal = new Animal("Generic animal");
        Lion lion = new Lion("Pino");
        Cow cow = new Cow("Lina");

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }


}
