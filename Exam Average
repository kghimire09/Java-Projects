/* Write a program that prompts (using a Scanner to parse input) for the homework average, exam average, and final exam score for a student in this class. Your
program should then print the final average and letter grade the student will receive. Be sure to follow all of the rules of the syllabus and validate your input (prompting
the user again if needed). Include a text file (testCases.txt) in your project with the valid test cases, with expected results, you used. Of course you should also test
invalid cases, but you only have to report the valid ones. */
/* Points format that will be used :-
Homework 30%
Exam     40%
Final    30%
Average values are between 0 and 100
Grade assignment Scale
90-100      A
80-89       B
70-79       C
55-69       D
0-54        F

 */
import java.util.Scanner;

public class Exercise03 {

        public static final int LOWER_LIMIT = 0;
        public static final int UPPER_LIMIT = 100;



        public static void main(String[] args) {
            Scanner inputValue = new Scanner(System.in);
            calculateFinalAverage(inputValue);
        }

        // this method checks whether valid homework average is entered or not.
        public static Double checkHomework(Scanner inputValue) {
            double homeworkAverage = 0;
            boolean badInput = true; ;
            System.out.print("What is your homework average?: ");
            while (badInput==true) {
                while (!inputValue.hasNextDouble()) {
                    System.out.println(inputValue.next()+" is not a number");
                    System.out.print("What is you homework average?: ");
                }
                homeworkAverage = inputValue.nextDouble();
                if (homeworkAverage < LOWER_LIMIT || homeworkAverage > UPPER_LIMIT) {
                    System.out.println("Please enter a number between 0 and 100.");
                    System.out.print("What is you homework average?: ");
                } else {
                    badInput=false;
                }
            }
            return homeworkAverage;

        }




        // this method checks whether valid exam average is entered or not.
        public static double checkExam(Scanner inputValue) {
            double examAverage = 0;
            boolean badInput = true;
            System.out.print("What is your exam average?: ");
            while (badInput==true) {
                while (!inputValue.hasNextDouble()) {
                    System.out.println(inputValue.next()+ "is not a number.");
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


        // this method check whether valid final exam points are entered or not.
        public static double checkFinalExam(Scanner inputValue) {
            double finalExamPoints = 0;
            boolean badInput = true;
            System.out.print("What is your final exam points?: ");

            while (badInput==true) {
                while (!inputValue.hasNextDouble()) {
                    inputValue.next();
                    System.out.println("You need to enter a number.");
                    System.out.print("What is your final exam points?: ");
                }
                finalExamPoints = inputValue.nextDouble();
                if (finalExamPoints < LOWER_LIMIT|| finalExamPoints > UPPER_LIMIT) {
                    System.out.println("Please enter a number between 0 and 100.");
                    System.out.print("What is your final exam points?: ");

                } else
                    badInput = false;
            }
            return finalExamPoints;
        }

        //calculates the final average points for the class.
        public static void calculateFinalAverage(Scanner inputValue){
            double finalAverage = ((checkHomework(inputValue) * 0.3) + (checkExam(inputValue) * 0.4) + (checkFinalExam(inputValue) * 0.3));
            System.out.println("Your final average for the class is: " + finalAverage);
            if (finalAverage >= 90) System.out.println("Your final grade is: A");
            else if (finalAverage>=80) System.out.println("Your final grade is: B");
            else if (finalAverage >= 70) System.out.println("Your final grade is: C");
            else if (finalAverage < 70 && finalAverage >= 55) System.out.println("Your final grade is D");
            else System.out.println("Your final grade is F");
        }


    }


