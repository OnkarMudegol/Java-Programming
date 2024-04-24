//WAP to create a generic method that takes a list of numbers and return the sum of all the even and odd numbers.
import java.util.*;

public class calculatorProblem {
    public static <T extends Number> void calculateSum(List<T> numbers) {
        double evenSum = 0;
        double oddSum = 0;

        for (T number : numbers) {
            int intValue = number.intValue(); // Convert to integer
            if (intValue % 2 == 0) {
                evenSum += intValue;
            } else {
                oddSum += intValue;
            }
        }

        System.out.println("Original list of numbers: " + numbers);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Double> doubles = Arrays.asList(2.0, 1.5, 4.5, 2.5, 1.5); // Use Arrays.asList()
        calculateSum(integers);
        calculateSum(doubles);
    }
}

