import java.util.Locale;

public class StringLoops
{
    // default constructor; no instance variables
    public StringLoops() { }

    /* Returns the number of times "character" appears in "searchString"
       This should be NON-case sensitive!

       Examples:
       - if character = "a" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2

        DO THIS WITH A FOR LOOP!
      */
    public int countCharacters(String character, String searchString) {
        int count = 0;
        int length = searchString.length();
        String lower = character.toLowerCase();
        String upper = character.toUpperCase();
        String newOne = character;

        for (int i = 1; i < length; i++) {
            if(searchString.contains(upper)) {
                searchString = searchString.replaceFirst(upper, "");
                count ++;
            } else if (searchString.contains(lower)) {
                searchString = searchString.replaceFirst(lower, "");
                count ++;
            }
        }
        return count;
    }

    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString(String origString) {
        int length = origString.length();
        String newString = "";
        for (int i = length; i >= 1; i--) {
            newString += origString.substring(i-1, i);
        }
        return newString;
    }

}
