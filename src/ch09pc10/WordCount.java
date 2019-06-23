package ch09pc10;
import java.util.StringTokenizer;

/**
 *
 * @author Frank
 */
public class WordCount {
    //fields
    private StringBuilder text;
    private int count;
    
    //constructors
    public WordCount(String input) {
        text = new StringBuilder(input);
    }
    
    //methods
    /**
     * 
     * @return  the total word count in the file 
     */
    public int getCount(){
        //instantiate StringTokenizer class
        StringTokenizer token = new StringTokenizer(text.toString(), " ", false);
        
        count = token.countTokens();
        
        
        return count;
    }
}
