// Import
import java.util.Scanner;

public class Program {
    // Private scanner
    private static final Scanner inputHandler = new Scanner(System.in);

    // Program entry point
    public static void main(String[] args)
    {
        // Prompt the user
        System.out.println("How many number would you like in the array: ");

        // Get response
        int arrayLength = inputHandler.nextInt();

        // Run test
        runTest(arrayLength);
    }

    // Run program test
    private static void runTest(final int iLength)
    {
        // Pre-defined range
        final int[] testRange = {1, 999};

        // Get randomised array
        final int[] arrayOfNumbers = RandomArrayGenerator.generateRandomArray(iLength, testRange);

        // Collect data
        int smallestNumber = DataInterpreter.getSmallestNumber(arrayOfNumbers);
        int largestNumber  = DataInterpreter.getLargestNumber(arrayOfNumbers);
        double averageNumber = DataInterpreter.getAverageNumber(arrayOfNumbers);

        // Output data
        System.out.println("All the generated numbers are:");
        DataOutputter.outputArrayOfInts(arrayOfNumbers, 5);

        DataOutputter.outputDataInt("The smallest number is: ", smallestNumber, true, true);
        DataOutputter.outputDataInt("The largest number is: ", largestNumber, false, true);
        DataOutputter.outputDataDouble("The average number is: ", averageNumber, false, true);
    }
}
