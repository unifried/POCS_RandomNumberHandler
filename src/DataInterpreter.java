public class DataInterpreter {
    // Private methods
    private static int calculateSum(final int[] iArray)
    {
        // Set sum to 0
        int arraySum = 0;

        // For loop that adds each value to the sum
        for (int i = 0; i < iArray.length; i++) arraySum += iArray[i];

        // Return the sum
        return arraySum;
    }

    private static int arraySearchSmallest(final int[] iArray)
    {
        // Sets the number to the first index of the array
        int smallestNumber = iArray[0];

        // Simple algorithm to search an array for its smallest value
        for (int i = 1; i < iArray.length; i++)
            if (iArray[i] < smallestNumber)
                smallestNumber = iArray[i];

        // Returns the smallest number
        return smallestNumber;
    }

    private static int arraySearchLargest(final int[] iArray)
    {
        // Sets the number to the first index of the array
        int largestNumber = iArray[0];

        // Simple algorithm to search an array for its largest value
        for (int i = 1; i < iArray.length; i++)
            if (iArray[i] > largestNumber)
                largestNumber = iArray[i];

        // Returns the largest number
        return largestNumber;
    }

    private static double arrayGetAverage(final int[] iArray)
    {
        // Gets the sum then divides by the number of entries
        int arraySum = calculateSum(iArray);

        // Returns the average
        return (double) arraySum / iArray.length;
    }

    // Public methods
    public static int getSmallestNumber(final int[] iArray)
    {
        return arraySearchSmallest(iArray);
    }

    public static int getLargestNumber(final int[] iArray)
    {
        return arraySearchLargest(iArray);
    }

    public static double getAverageNumber(final int[] iArray)
    {
        return arrayGetAverage(iArray);
    }
}
