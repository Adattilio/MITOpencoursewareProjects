/*
 * This class was created to complete the MIT open courseware assignment called "Foo Corporation".
 * I also added more calculations than the assignment required to clearly show all the code worked as it was designed
 * to work.  This assignment and others can be found at this course link :
 * https://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-092-introduction-to-programming-in-java-january-iap-2010/assignments/
 *
 * @author Alex Dattilio
 */
public class FooCorporation {
    public static void main(String[] args) {
        calculatePay(7.50, 35);
        calculatePay(8.20, 47);
        calculatePay(10.00, 73);
        calculatePay(9.68, 50);
        calculatePay(13.52, 15);
    }

    public static void calculatePay(double basePay, int hoursWorked) {
        double overtimeMultiplier = 1, overtimePayCalculation = 0.0, basePayCalculation = 0.0,
                totalPay = 0.0;
        String printMessage = "";
        if (basePay >= 8.0 && hoursWorked <= 60) {
            if (hoursWorked > 40) {
                overtimeMultiplier = 1.5;
                overtimePayCalculation = (hoursWorked -= 40) * (overtimeMultiplier * basePay);
            }
            basePayCalculation = hoursWorked * basePay;
            totalPay = basePayCalculation + overtimePayCalculation;
            printMessage = "The total pay for this employee is " + totalPay;
        } else {
            if (basePay <= 8.0) {
                printMessage = "Base pay does not meet the minimum wage of $8 an hour!";
            } else {
                printMessage = "Too many hours were worked! Hours worked must be less than 60!";
            }
        }
        System.out.println(printMessage);
    }

}
