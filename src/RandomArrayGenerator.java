// Import
import java.util.Random;
import java.util.Arrays;
public class RandomArrayGenerator {
    // Private variables
    private static final Random generator = new Random();

    // Private methods
    private static int[] getVerifiedRange(final int[] iRange)
    {
        // Ensure range is only two values
        int[] arrayRange = new int[2];

        // Sets the values
        arrayRange[0] = iRange[0];
        arrayRange[1] = iRange[1];

        // Sort the array
        Arrays.sort(arrayRange);

        // Return the array
        return arrayRange;
    }

    private static int[] generateArray(final int iRequiredNumbers, final int[] iRange)
    {
        // Generates the array of variable size
        int[] generatedArray = new int[iRequiredNumbers];

        // Calculates the ranges upper bound for lower bound is 0
        final int offsetUpperBound = (iRange[1] - iRange[0]);

        // For loop - fills the array
        for (int i = 0; i < iRequiredNumbers; i++) generatedArray[i] = generator.nextInt(offsetUpperBound) + iRange[0];

        // Return the array
        return generatedArray;
    }

    // Public methods
    public static int[] generateRandomArray(final int iArrayLength, final int[] iRange)
    {
        // Ensure range is only two values
        int[] arrayRange = getVerifiedRange(iRange);

        // Generate & return the array
        return generateArray(iArrayLength, arrayRange);
    }
}
