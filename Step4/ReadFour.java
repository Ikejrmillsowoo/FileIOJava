package Step4;

import java.io.FileReader;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {
            // Print out a running total of all the
            try{
                int runningTotal = 0;
                Scanner fileIn = new Scanner(new File("Step4/input.txt"));
                while( fileIn.hasNextLine()){
                    String nextInt = fileIn.nextLine();
                    for (int i = 0; i < nextInt.length(); i++) {
                        runningTotal += Integer.parseInt(nextInt);
                    }

                    System.out.println("Running Total = "+ runningTotal);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            // values in the input file.
        }
}