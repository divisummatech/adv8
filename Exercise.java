package javaoopadvanced._1;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        //VEDI CLASSE DOG
    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        public class AnimalExercises {
            public static void main(String[] args) {
                Dog dog = new Dog("Bracco pointer", 0.8, 25);
                Fish fish = new Fish("Troute", 0.4, 6);
                Bird bird = new Bird("Parrot", 1.5, 0.2, 0.5);

                double dogSpeed = dog.runSpeedMetersPerSecond();
                double fishSpeed = fish.swimSpeedMetersPerSecond();
                double birdSpeed = bird.flySpeedMetersPerSecond();

                if (dogSpeed > fishSpeed && dogSpeed > birdSpeed) {
                    System.out.println("The dog is the fastest at " + dogSpeed + " meters per second");
                } else if (fishSpeed > dogSpeed && fishSpeed > birdSpeed) {
                    System.out.println("The fish is the fastest at " + fishSpeed + " meters per second");
                } else {
                    System.out.println("The bird is the fastest at " + birdSpeed + " meters per second");
                }
            }
        }

    }
}
