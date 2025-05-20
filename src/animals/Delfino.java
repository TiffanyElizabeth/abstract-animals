package animals;

public class Delfino extends Animale {
    // characteristics
    protected String subspecies;

    // getters and setters
    public String getSubspecies() {
        return this.subspecies;
    }

    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }

    // constructor
    public Delfino(String name, String subspecies) {
        super(name);
        this.subspecies = subspecies;
    }

    @Override
    public void verso() {
        System.out.println("fischia");
    }

    @Override
    public void mangia() {
        System.out.println("pesce");
    }
}
