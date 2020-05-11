//Make a program that outputs the pattern:
//        *
//        **
//        * *
//        *  *
//        *   *
//        ******
//        The number of rows print should be controlled by the first command line argument. Ensure that this value an integer
//        between 1 and 80. If it is not, or no argument is given, print an informative error message.

public class Main {

    public static final int Default_Number_Prints = 6;

    public static void main(String[] args) {
        int numberOfPrints = Default_Number_Prints;
        if (args.length > 0) {
            try {
                numberOfPrints = Integer.parseInt(args[0]);
            } catch (NumberFormatException ex) {
                System.err.println(args[0] + " is not a number");
                System.exit(1);
            }

        }
        if (numberOfPrints < 0 || numberOfPrints > 80) {
            System.err.println(args[0] + " is not between 1 and 80");
            System.exit(1);

        }
        for (int lineNumber = 1; lineNumber <= numberOfPrints; lineNumber++) {
            for (int stars = 1; stars <= lineNumber; stars++) {
                if (stars == 1 || stars == lineNumber || lineNumber == numberOfPrints) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
