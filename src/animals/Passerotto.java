package animals;

public class Passerotto extends Animale {
    @Override
    public void verso() {
        System.out.println("cinguetta");
    }

    @Override
    public void mangia() {
        System.out.println("fruttà, verdura");
    }
}
