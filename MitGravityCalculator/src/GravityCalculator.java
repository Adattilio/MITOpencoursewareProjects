/*
 * This class was created to complete the MIT open courseware assignment called "Gravity Calculator".
 * The initial code provided by MIT would output the following sentence to the console :" The object's
 * position after 10 seconds is 0 m. " The code below is modified, as required for part 2 of the assignment,
 * to make an actual calculation with the given variables. This assignment and others can be found at this
 * course link : https://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-092-introduction-to-programming-in-java-january-iap-2010/assignments/
 *
 * @author Alex Dattilio
 */
public class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.812;
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.5 * gravity * Math.pow(fallingTime, 2) + initialVelocity * fallingTime
                + initialPosition;
        System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
    }

}
