//The number of segments (an integer from 1 to 10) should be
// controlled by the first command line argument. The height of each segments (an integer from 1 to 10) should be
// controlled by the second command line argument. In the case of erroneous input, print an informative error message.
//              *
//             ***
//            *****
//           *******
//             ***
//            *****
//           *******
//          *********
//              *
//              *
//           *******

public class Main {
    public static final int DEFAULT_NUMBER_ROWS = 5;
    public static final int HEIGHT = 4;

    public static void main(String[] args) {
        int numberOfRows = DEFAULT_NUMBER_ROWS;
        int heightOfTree = HEIGHT;
        if (args.length == 2) {
            try {
                numberOfRows = Integer.parseInt(args[0]);
                heightOfTree = Integer.parseInt(args[1]);
            } catch (NumberFormatException ex) {
                System.err.println("Both the given values must be a number");
                System.exit(1);
            }
        }
        if(numberOfRows<1 || heightOfTree <1 || numberOfRows >10 || heightOfTree>10){
            System.err.println("The number of rows and the height of the trees should be between 1 and 10");
            System.exit(1);
        }
        makeTree(numberOfRows, heightOfTree);
    }

    public static void makeTree(int numberOfRows, int heightOfTree) {
        int maxStars = 2 * heightOfTree + 2 * numberOfRows - 3;
        String maxStr = " ";
        for (int len=0; len<maxStars; len++){
            maxStr+=" ";
        }
        for(int i=1; i<=numberOfRows; i++){
            for(int line=1; line<= heightOfTree; line++){
                String starStr= " ";
                for (int j=1; j<= 2*line+2*i-3; j++)
                {
                    starStr+="*";
                }
                for(int space=0; space <= maxStars-(heightOfTree+line+i); space++) {
                    starStr = " " + starStr;
                }
                System.out.println(starStr);
            }
        }
        for (int i=0; i <= maxStars/1.5; i++){
            System.out.print(" ");
        }
        System.out.print("*\n");
        for(int i = 0; i <=maxStars/1.5;i++){
            System.out.print(" ");
        }
        System.out.print("*\n");
        for(int i =1; i <= maxStars/1.75;i++){
            System.out.print(" ");
        }
        System.out.print("*******\n");
    }
}




