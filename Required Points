/* Write a program that prompts (Using a Scanner for parsing input) for the
homework average and exam average for a student in this class. Your program should then print
a nicely formatted table of the final exam scores needed to receive each possible letter
grade. Make sure that your output makes sense and only possible outcomes are displayed (e.g it is not
possible to get a negative score on the final). Be sure to follow all of the rules of the syllabus and
validate your input prompting the user again if needed. Include a txt file in your project with the valid test cases,
with expected results, you used. Of Course, you should also test invalid cases, but you only have to report the valid ones.
*/

import java.util.Scanner;

public class Exercise04 {

    public static final int LOWER_LIMIT = 0;
    public static final int UPPER_LIMIT = 100;


    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        grades(inputValue);
    }

    public static Double checkHomework(Scanner inputValue) {
        double homeworkAverage = 0;
        boolean badInput = true;
        ;
        System.out.print("What is your homework average?: ");
        while (badInput) {
            while (!inputValue.hasNextDouble()) {
                System.out.println(inputValue.next() + " is not a number");
                System.out.print("What is you homework average?: ");
            }
            homeworkAverage = inputValue.nextDouble();
            if (homeworkAverage < LOWER_LIMIT || homeworkAverage > UPPER_LIMIT) {
                System.out.println("Please enter a number between 0 and 100.");
                System.out.print("What is you homework average?: ");
            } else {
                badInput = false;
            }
        }
        return homeworkAverage;

    }

    // this method checks whether valid exam average is entered or not.
    public static double checkExam(Scanner inputValue) {
        double examAverage = 0;
        boolean badInput = true;
        System.out.print("What is your exam average?: ");
        while (badInput == true) {
            while (!inputValue.hasNextDouble()) {
                System.out.println(inputValue.next() + "is not a number.");
                System.out.print("What is you exam average?: ");
            }
            examAverage = inputValue.nextDouble();
            if (examAverage < LOWER_LIMIT || examAverage > UPPER_LIMIT) {
                System.out.println("Please enter a number between 0 and 100");
                System.out.print("What is your exam average?: ");
            } else
                badInput = false;

        }
        return examAverage;
    }

    public static void grades(Scanner inputValue) {
        double homeworkPoints = checkHomework(inputValue);
        double examPoints = checkExam(inputValue);
        double pointsA = ((90 - homeworkPoints * 0.3 - examPoints * 0.4) / 0.3);
        double pointsB = ((80 - homeworkPoints * 0.3 - examPoints * 0.4) / 0.3);
        double pointsC = (70 - homeworkPoints * 0.3 - examPoints * 0.4) / 0.3;
        double pointsD = (55 - homeworkPoints * 0.3 - examPoints * 0.4) / 0.3;
        double pointsE = (0 - homeworkPoints * 0.3 - examPoints * 0.4) / 0.3;

        System.out.printf("%s", "------------------------------------------------");
        System.out.println(" ");
        System.out.printf("%10s %5s %15s", "Grades", "|", "Required Final Exam Scores");
        System.out.println(" ");
        System.out.printf("%s", "------------------------------------------------");
        System.out.println(" ");
        if (pointsA > 0) {
            System.out.printf("%10s %5s %.1f", "A", "|", pointsA);
        }
        System.out.println(" ");
        if (pointsB > 0) {
            System.out.printf("%10s %5s %.1f", "B", "|", pointsB);
        }
        System.out.println(" ");
        if (pointsC > 0) {
            System.out.printf("%10s  %4s %.1f", "C", "|", pointsC);
        }
        System.out.println(" ");
        if (pointsD > 0) {
            System.out.printf("%10s  %4s %.1f", "D", "|", pointsD);
        }
        System.out.println(" ");
        if (pointsE > 0) {
            System.out.printf("%10s  %4s %.1f", "E", "|", pointsE);
        }
        System.out.println(" ");
        System.out.printf("%s", "------------------------------------------------");
    }

}





