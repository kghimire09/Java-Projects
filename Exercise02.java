//Take n to be the value of the first command line argument and print the resulting fraction sum.

public class Exercise02 {


    public static final int NUMBER = 3;

    public static void main(String[] args) {
        int number = errorChecking(args, NUMBER);

        double sum = 0;
        for (int i = 1; i <= number; i++) {
            double fractions = (double) 1 / i;
            sum += fractions;

        }
        System.out.println("The fraction sum is: " + sum);
    }

    public static int errorChecking(String[] args, int numberForFraction) {
        if (args.length > 0) {
            try {
                numberForFraction = Integer.parseInt(args[0]);
            } catch (NumberFormatException ex) {
                System.err.println(args[0] + " is not a number");
                System.exit(1);
            }

            if (numberForFraction < 0 || numberForFraction > 20) {
                System.err.println(args[0] + " is not between 0 and 20");
                System.exit(1);

            }
        }
        return numberForFraction;
    }
}


