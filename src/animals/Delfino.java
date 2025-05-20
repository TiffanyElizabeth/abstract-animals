package animals;

public class Delfino extends Animale {
    @Override
    public void verso() {
        System.out.println("fischia");
    }

    @Override
    public void mangia() {
        System.out.println("pesce");
    }
}
