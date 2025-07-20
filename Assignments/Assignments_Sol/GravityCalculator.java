class GravityCalculator {
    public static void main(String[] arguments) {
    	//Part 1
        double gravity = -9.81;  // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
        finalPosition = initialPosition + initialVelocity * fallingTime + 0.5 * gravity * fallingTime * fallingTime;
        //Qustion: The value of the local variable initialPosition is not used
        //Part 2
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }
}
