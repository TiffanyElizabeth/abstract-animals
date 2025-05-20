package animals;

public class Cane extends Animale {
    @Override
    public void verso() {
        System.out.println("abbaia");
    }

    @Override
    public void mangia() {
        System.out.println("carne, verdura, fruttà");
    }
}
