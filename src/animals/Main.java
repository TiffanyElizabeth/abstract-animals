package animals;

public class Main {
    public static void main(String[] args) {
        Cane shiloh = new Cane("shiloh", "cavalier king charles spaniel");
        shiloh.dormi();
        shiloh.mangia();
        shiloh.verso();

        Passerotto chipper = new Passerotto("chipper", "brown");
        chipper.dormi();
        chipper.mangia();
        chipper.verso();

        Aquila baldy = new Aquila("baldy", "bald");
        baldy.dormi();
        baldy.mangia();
        baldy.verso();

        Delfino blue = new Delfino("blue", "bottlenose");
        blue.dormi();
        blue.mangia();
        blue.verso();
    }
}
