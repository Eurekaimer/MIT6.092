public class Baby {
    String name;
    boolean isMale;
    double weight = 5.0;
    double decibels;
    int numPoops = 0;

    Baby(String myname, boolean maleBaby) {
        name = myname;
        isMale = maleBaby;
    }

    void sayHi() {
        System.out.println("Hi, my name is.. " + name);
    }

    void eat(double foodWeight) {
        if (foodWeight >= 0) {
            weight = weight + foodWeight;
            System.out.println(name + " just ate " + foodWeight + " units of food. New weight: " + weight);
        } else {
            System.out.println("Food weight must be a positive value.");
        }
    }
}