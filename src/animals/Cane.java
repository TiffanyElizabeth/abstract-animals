package animals;

public class Cane extends AbstractAnimale {
    // characteristics
    protected String breed;

    // getters and setters
    public String getBreed() {
        return this.breed;
    }

    public void setName(String breed) {
        this.breed = breed;
    }

    // constructor
    public Cane(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void verso() {
        System.out.println("abbaia");
    }

    @Override
    public void mangia() {
        System.out.println("carne, verdura, fruttà");
    }
}
