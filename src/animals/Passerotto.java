package animals;

public class Passerotto extends Animale {
    // characteristics
    protected String color;

    // getters and setters
    public String getColor() {
        return this.color;
    }

    public void setName(String color) {
        this.color = color;
    }

    // constructor
    public Passerotto(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void verso() {
        System.out.println("cinguetta");
    }

    @Override
    public void mangia() {
        System.out.println("fruttà, verdura");
    }
}
