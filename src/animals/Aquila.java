package animals;

public class Aquila extends Animale {
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
    public Aquila(String name, String subspecies) {
        super(name);
        this.subspecies = subspecies;
    }

    @Override
    public void verso() {
        System.out.println("grida");
    }

    @Override
    public void mangia() {
        System.out.println("carne");
    }
}
