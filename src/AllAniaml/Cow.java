package AllAniaml;

public class Cow extends Animal {

    public Cow(String animalName) {
        super(animalName);
    }
    @Override
    public void animalSound() {
        super.animalSound();
        System.out.println(animalName + ": Muuuuuuu");
    }
}
