//The number of stairs printed should be controlled by the first
//        command line argument. Ensure that this value an integer between 0 and 20. If it is not, or no argument is given,
//        print an informative error message.
//                o  *******
//               /|\ *     *
//               / \ *     *
//           o  ******     *
//          /|\ *          *
//          / \ *          *
//      o  ******          *
//     /|\ *               *
//     / \ *               *
//    **********************

public class Main {

    //establishing class constants
    public static final int STAIRS = 5;
    public static final int STARS = STAIRS * 5;

    public static void main(String[] args) {
        int numberOfStairs = errorChecking(args, STAIRS);
        int stairWidth = numberOfStairs * 5;




        for (int i = 1; i <= numberOfStairs; i++) {


            for (int x = 1; x <= (stairWidth + (i * (-5))); x++) {
                System.out.print(" ");
            }


            head();


            for (int y = 1; y <= ((i - 1) * 5); y++) {
                System.out.print(" ");
            }

            System.out.println("*");


            for (int x = 1; x <= (stairWidth + (i * (-5))); x++) {
                System.out.print(" ");
            }


            body();

            //calculating the number of spaces after the 1st middle line of the stair
            for (int y = 1; y <= (i * 5); y++) {
                System.out.print(" ");
            }

            System.out.println("*");


            for (int x = 1; x <= (stairWidth + (i * (-5))); x++) {
                System.out.print(" ");
            }


            legs();


            for (int y = 1; y <= (i * 5); y++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }


        for (int z = 1; z <= (stairWidth + 7); z++) {
            System.out.print("*");
        }
    }

    public static void head() {
        System.out.print("  o  ******");
    }

    public static void body() {
        System.out.print(" /|\\ *");
    }

    public static void legs() {
        System.out.print(" / \\ *");
    }

    public static int errorChecking(String[] args, int numberOfStairs) {
        if (args.length > 0) {
            try {
                numberOfStairs = Integer.parseInt(args[0]);
            } catch (NumberFormatException ex) {
                System.err.println(args[0] + " is not a number");
                System.exit(1);
            }

            if (numberOfStairs < 0 || numberOfStairs > 20) {
                System.err.println(args[0] + " is not between 0 and 20");
                System.exit(1);

            }
        }
        return numberOfStairs;
    }
}