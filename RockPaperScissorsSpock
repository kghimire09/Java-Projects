/*Write a program that allows the user to play Rock-paper-scissors-lizard-Spock (en.wikipedia.org/wiki/Rock-paper-scissors-lizard-Spock)
against the computer. The user should be able to play as many games as they wish without restarting your program. The program should
keep track of the score for the current session of the game and the overall total score for all sessions played. Think about how you
can efficiently represent the rules for winning.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Exercise03 {

    public static int userScore = 0;
    public static int overallUserScore = 0;
    public static int computerScore = 0;
    public static int overallComputerScore = 0;

    public static void main(String[] args){
    welcomeMessage();
        try {
            saveScore();
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean play = true;
    do {
        game();
        try {
            saveScore();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } while (play);

    }

    public static void welcomeMessage(){
        System.out.println("Welcome to Rock-paper-scissors-lizard-spock.");
        System.out.println("Please choose your element from: ");
        System.out.println("Rock " + "Paper " + "Scissors " + "Lizard " + "Spock");

    }
    public static void saveScore() throws IOException {
        File saveScore = new File("Score.txt");
        boolean exists = saveScore.exists();

        if(exists){
            loadScore();
        }
    }
    public static void saveFile() throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter("Score.txt"));
        writer.println(overallUserScore);
        writer.println(overallComputerScore);
        writer.close();
    }
    public static void loadScore() throws IOException{
        String[] overall = new String[2];
        File saveScore = new File("Score.txt");
        Scanner readScore = new Scanner(saveScore);
        for(int count= 0; count <= 1; count++){
            overall[count]= readScore.nextLine();
        }
        overallUserScore = Integer.parseInt(overall[0]);
        overallComputerScore = Integer.parseInt(overall[1]);
        System.out.println("Overall total score for all sessions played: Player = " + overallUserScore + " and" +
                " Computer = " + overallComputerScore);


    }

    public static String computerPlayer() {
        String computerPick = "";
        Random rand = new Random();
        List<String> values = Arrays.asList("Rock", "Paper", "Scissors", "Lizard", "Spock");
        int elements = 1;
        for (int i = 0; i < elements; i++) {
            int randomIndex = rand.nextInt(values.size());
            computerPick = values.get(randomIndex);

        }
        return computerPick;
    }
    public static Scanner userEntry() {
        System.out.println("Please enter you choice: ");
        Scanner console = new Scanner(System.in);
        //console.close();
        return console;
    }
    public static void score(int winner){
        if (winner == 1){
            userScore++;
        }
        else if (winner == 0){
            computerScore++;
        }
        System.out.printf("The user score is: %d and the computer score is: %d", userScore, computerScore);
    }


    public static void game() {
        int winner;
        String pick = computerPlayer();
        String userEntry = userEntry().next();

        if(userEntry.equals(pick)){
            System.out.println("You have chosen " + userEntry + " and the computer has chosen " + pick);
            System.out.println("It was a draw");
            winner = 2;
        }

        if (userEntry.equals("Rock") && (pick.equals("Lizard")||pick.equals("Scissors"))) {
            System.out.println("You have chosen Rock and the computer has chosen "+pick);
            System.out.println("You have won");
            winner = 1;

            }
        else if (userEntry.equals("Paper") && (pick.equals("Rock") || pick.equals("Spock"))){
            System.out.println("You have chosen Paper and the computer has chosen "+pick);
            System.out.println("You have won");
            winner = 1;

            }
        else if (userEntry.equals("Scissors")&&(pick.equals("Paper") || pick.equals("Lizard"))){
            System.out.println("You have chosen Scissors and the computer has chosen "+pick);
            System.out.println("You have won");
            winner = 1;

            }
        else if (userEntry.equals("Lizard") && (pick.equals("Spock") || pick.equals("Paper"))){
            System.out.println("You have chosen Lizard and the computer has chosen "+pick);
            System.out.println("You have won.");
            winner = 1;

            }
        else if (userEntry.equals("Spock") && (pick.equals("Scissors") || pick.equals("Rock"))) {
            System.out.println("You have chosen Spock and the computer has chosen " + pick);
            System.out.println("You have won");
            winner = 1;
        }
        else {
            System.out.println("The computer chose "+ pick+ " so you lost.");
            winner = 0;

        }
        calculateTotal(winner);

    }
    public static void calculateTotal(int winner) {
        if (winner == 1){
            overallUserScore++;
            userScore++;
        } else if(winner == 0){
            overallComputerScore++;
            computerScore++;
        }
        System.out.println("User score is: "+ userScore + ". Computer score is: "+ computerScore);
    }


}
