package ch09pc10;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Frank
 * @date 11/21/17
 * purpose: to count the number of words in a text file.
 */
public class Ch09pc10 {

    public static void main(String[] args) throws IOException {
        // variables
        String fileName;
        String text = " ";
        
        //instantiate Scanner class
        Scanner keyboard = new Scanner(System.in);
        
        //Request file name from user
        System.out.println("Please enter the file name: ");
        fileName = keyboard.nextLine();
        
        //open the file
        File file = new File(fileName);
        
        //instantiate Scanner class
        Scanner inputFile = new Scanner(file);
        
        while (inputFile.hasNextLine()) {
            text += inputFile.nextLine() + " ";
        }

        //close the file
        inputFile.close();
        
        //instantiate the WordCount class
        WordCount count = new WordCount(text);
        
        //Display count to user
        System.out.printf("The file %s has %,d words.\n", fileName, count.getCount());
        
    }
    
}
