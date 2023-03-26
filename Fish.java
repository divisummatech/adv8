public class Fish extends Animal {
    private String species;

    public Fish(String species, int height, int weight) {
        super(height, weight);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}

//3
class Fish extends Animal {
    private String species;

    public Fish(String species, double height, double weight) {
        super(height, weight);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double swimSpeedMetersPerSecond() {
        return getWeight() * 2;
    }
}