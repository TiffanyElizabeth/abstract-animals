package animals;

public abstract class AbstractAnimale {
    // characteristics
    protected String name;

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // constructor
    public AbstractAnimale(String name) {
        this.name = name;
    }

    // methods
    public void dormi() {
        System.out.println("Zzzz");
    };

    public abstract void verso();

    public abstract void mangia();

}