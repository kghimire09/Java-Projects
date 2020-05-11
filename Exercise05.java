//Simulate a 2D random walk starting at (0,0). At each step print out the current location
//        then move one step to the right, left, up, or down, chosen at random. The simulation
//        stops when you have returned to the origin (0,0). thus, the simulation could stop
//        quickly or run until terminated. Note this is not a GUI program you are just printing
//        each point visited. It is also a random walk so it could terminate quickly or run forever.

import java.util.*;

public class Exercise05 {

        public static void main(String[] args) {

            Random numbers = new Random();
            int i = 0;
            int j = 0;
            System.out.printf("Your starting point is: (%d,%d)\n\n",i,j);
            do {
                int direction = numbers.nextInt(3);
                if (direction == 0) {
                    j = j + 1;
                    System.out.print("You are in the upward direction.   ");
                } else if (direction == 1) {
                    i = i = 1;
                    System.out.print("You are moving towards right.  ");
                } else if (direction == 2) {
                    j = j - 1;
                    System.out.print("You are moving in the downwards direction.  ");
                } else if (direction == 3) {
                    i = i - 1;
                    System.out.print("You are moving towards left.   ");
                }
                System.out.printf("%d,%d\n", i, j);
            }
            while(i != 0 || j != 0);
            System.out.printf("You returned to the starting point:  (%d,%d",i,j);




        }

    }

