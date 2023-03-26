public class Bird extends Animal {
    private int wingSpan;

    public Bird(int wingSpan, int height, int weight) {
        super(height, weight);
        this.wingSpan = wingSpan;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }
}

//3

class Bird extends Animal {
    private double wingSpan;

    public Bird(double wingSpan, double height, double weight) {
        super(height, weight);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public double flySpeedMetersPerSecond() {
        return getWingSpan() * 4;
    }
}