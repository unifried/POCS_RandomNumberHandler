public class DataOutputter {
    public static void outputArrayOfInts(final int[] iArray, final int iNumbersPerLine)
    {
        // Current line counter
        int numbersOnLine = 0;

        // Number padding
        int numberPadding = String.valueOf(iArray[iArray.length - 1]).length();

        for (int i = 0; i < iArray.length; i++)
        {
            // Increases the number of numbers registered on the line
            numbersOnLine += 1;

            // Outputs the number
            System.out.printf("%-" + numberPadding + "s ", iArray[i]);

            // Checks if a new line is needed
            if (numbersOnLine >= iNumbersPerLine) {
                System.out.println(" ");
                numbersOnLine = 0;
            }
        }
    }

    public static void outputDataInt(String text, int dataPoint, boolean beforePadding, boolean afterPadding)
    {
        // Adds padding before output
        if (beforePadding)
            System.out.println(" ");

        // Outputs the data
        System.out.println(text + dataPoint);

        // Adds padding after output
        if (afterPadding)
            System.out.println(" ");
    }

    public static void outputDataDouble(String text, double dataPoint, boolean beforePadding, boolean afterPadding)
    {
        // Adds padding before output
        if (beforePadding)
            System.out.println(" ");

        // Outputs the data
        System.out.println(text + dataPoint);

        // Adds padding after output
        if (afterPadding)
            System.out.println(" ");
    }
}
