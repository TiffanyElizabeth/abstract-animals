package animals;

public class Aquila extends Animale {
    @Override
    public void verso() {
        System.out.println("grida");
    }

    @Override
    public void mangia() {
        System.out.println("carne");
    }
}
