public class Main {
    public static final int Default_Number_Prints = 10;
   
    public static void main(String[] args) {
        int numberOfPrints=Default_Number_Prints;
        if (args.length>0){
            try{
                numberOfPrints=Integer.parseInt(args[0]);
            }
            catch (NumberFormatException ex)
            {
                System.err.println(args[0]+" is not a number");
                System.exit(1);
            }
        }
        if (numberOfPrints < 1 || numberOfPrints > 80){
            System.err.println(args[0]+ " is not between 1 and 80");
            System.exit(1);
        }
	for (int lineNumber=1;lineNumber<=numberOfPrints;lineNumber++){
	    for(int spaces=lineNumber;spaces<numberOfPrints;spaces++){
	        System.out.print(" ");
        }
	    for(int stars=1;stars<=(2*lineNumber-1);stars++){
	        if(stars==1||lineNumber==numberOfPrints||stars==(2*lineNumber-1)){
	            System.out.print("*");

            }else {
	            System.out.print(" ");
            }
        }
	    System.out.println("");
    }
    }
}
