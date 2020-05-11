//http://en.wikipedia.org/wiki/Pascal%27s_triangle for examples).
// Your program should take two command line arguments. The first is the number
// of rows of the triangle to display. The second is an optional argument for the
// modulus. If no modulus is given generate Pascal's triangle as normal. Otherwise,
// reduce each entry in the triangle mod the given modulus. Use System.out.printf()
// to format (or manually format) the output into appropriately sized fields so the
// triangle is displayed correctly. Be sure not to have either too little or too much space in
// between each field. As a hint, you may want to generate the triangle twice. Once to
// find the maximum value (to set the field size) and once to print the triangle.

import java.util.Scanner;
public class Exercise06
 {
    public static final int Default_Number_Prints = 5;

    public static void main(String[] args) {

        int numberOfRows = Default_Number_Prints;
        int modulus = 0;

        String modulusArgs = "";
        boolean hasModulus = false;

        if (args.length > 0) {
            try {
                numberOfRows = Integer.parseInt(args[0]);
            } catch (NumberFormatException ex) {
                System.err.println(args[0] + " is not a number");
                System.exit(1);
            }
        }
        try {
            modulusArgs = args[1];
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        if (modulusArgs.length() > 0) {
            modulus = Integer.parseInt(args[1]);
            hasModulus = true;
        }

        for (int numberOfLines = 0; numberOfLines < numberOfRows; numberOfLines++) {      // number of lines to print.
            int numberToPrint = 1;                                               // value to print in the outer triangle.
            System.out.printf("%" + (numberOfRows - numberOfLines) * 2 + "s", "");      // prints the padding spaces required.
            for (int j = 0; j <= numberOfLines; j++) {// values for the inner triangles.
                if (hasModulus) {  // modulus calculation.
                    System.out.printf("%4d", numberToPrint % modulus);
                } else {
                    System.out.printf("%4d", numberToPrint);
                }
                numberToPrint = numberToPrint * (numberOfLines - j) / (j + 1);  // increment in the values to be printed.

            }
            System.out.println();
        }

    }

}

