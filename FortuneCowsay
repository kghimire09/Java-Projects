/*Fortune files are text files with random sayings and quotes in them, where each entry is separated by a line containing
only a percent sign (%). See the file /opt/local/share/games/fortune/fortunes in the lab for an example. Note there are
also fortune files that end in -o that contain quotes that could be considered offensive. These files have had a trivial
 encryption applied to prevent accidental reading (it would be nice if they were not part of the fortune install at all).
  So do not go looking at them unless you are willing to be offended. Your task is to modify your cowsay program to
  display a random quote from the fortune file fortunes.txt in your program's current working directory (the directory
  it is run from, most IDEs will let you set this for testing as well). If the fortunes.txt file does not exists, then
  your program should print an informative error message and quit. Your cowsay program now has to handle multi-line
  messages (as most fortunes have a few lines). Your program also has to handle two optional command line arguments.
  If the String "debug" is given as an argument then information about the number of fortunes in the fortunes.txt
  file and which fortune number was selected must be printed along with the regular output (note fortune numbers
  start at 1). Additionally, if an integer is given as a command line argument, then that is the fortune number
  that should be printed (i.e. not a random one). All other command line arguments should be ignored. You can make and
  submit your own non-offensive fortunes.txt file or use one of the non-offensive files from the lab. However, you should
  expect that I will also test you program with my own files. Also, note that while the real fortune program uses
  precomputed offsets to make look ups fast, you can take multiple passes over the data file to get the information you
  need.
 */

import java.io.*;
import java.util.*;

public class Exercise02 {

    static Random numbers = new Random();

    public static void main(String[] args) {
        //uses delimiter to separate the the statements.

        Scanner console = null;
        try {
            console = getInput();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String print = "";
        int numLines = 0;
        String[] line = new String[10000];
        assert console != null;
        console.useDelimiter("%");
        //as long as there are values it will keep printing the lines.
        while (console.hasNext()) {
            line[numLines] = console.next();
            numLines++;
        }
        int random_numbers = numbers.nextInt(numLines);
        int firstArg = 0;
        if (args.length > 0) {
            try {
                firstArg = Integer.parseInt(args[0]);
            } catch (NumberFormatException ex) {
            }
            if (firstArg > 0 && firstArg < numLines) {
                print = (line[firstArg]);
                System.out.printf("The fortune from line %d has been printed.\n", firstArg);
            } else {
                print = (line[random_numbers]);
//
//                console.close();
            }
            if (args[0].equals("debug")) {
                System.out.printf("There are %d fortunes in the file.\n", numLines);
                System.out.println("This fortune printed is from line: " + random_numbers);
            }
        } else {
            print = (line[random_numbers]);
            console.close();
        }

        // printing in the correct format part!!
        String fortunePrint = print;
        String[] fortunePrintArray = fortunePrint.split("\n");

        int cowWidth = 0;
        for (int counter = 0; counter < fortunePrintArray.length; counter++) {
            if (fortunePrintArray[counter].length() > cowWidth) {
                cowWidth = fortunePrintArray[counter].length();
            }
        }
        printCowWidth(cowWidth);
        System.out.print(print);
        printCowWidth(cowWidth);
        System.out.println();
        printCow();
    }

    // checks to see if the input is an actual file
    public static Scanner getInput() throws FileNotFoundException {
        File fortune = new File("///Users/kshitizghimire/2670/Homework03/Exercise02/fortunes");
        Scanner input = new Scanner(fortune);

        while (!fortune.canRead()) {
            System.out.println("File cannot be found. Please try again.");
            fortune = new File(input.nextLine());
        }
        //now that we know fortune is a file, we can return it from here
        return new Scanner(fortune);

    }

    private static void printCow() {
        System.out.println("        \\   ^__^");
        System.out.println("         \\  (oo)\\_______");
        System.out.println("            (__)\\       )\\/\\");
        System.out.println("                ||----w |");
        System.out.println("                ||     ||");
    }

    private static void printCowWidth(int cowWidth) {
        for (int counter = 0; counter < cowWidth; counter++) {
            System.out.print("_");
        }

    }
}




