package homeTask10;

/**
 * Created by Света on 30.09.2015.
 */
public class CaeserAlgorithm {
    static String caesar(String value) {

        char[] word = value.toCharArray();
        for (int i = 0; i < word.length; i++) {
            char letter = word[i];
            letter = (char) (letter + 10);
            if (letter > 'z' && letter > 'Z') {
                letter = (char) (letter - 26);
            } else if (letter < 'a' && letter < 'A') {
                letter = (char) (letter + 26);
            }
            word[i] = letter;
        }
        return new String(word);}
    static String deCaesar(String value){
        char[] codeWord = value.toCharArray();
        for (int i = 0; i < codeWord.length; ++i) {
            char letter = codeWord[i];
            letter = (char) (letter - 10);
            if (letter > 'z' && letter > 'Z') {
                letter = (char) (letter - 26);
            }else if (letter < 'a' && letter < 'A') {
                letter = (char) (letter + 26);
            }
            codeWord [i] = letter;
        }
        return new String(codeWord);

    }
    public static void main (String[] args){
        String someWord = "People";
        String codeWord = caesar(someWord);
        String deCodeWord = deCaesar(codeWord);
        System.out.println(codeWord);
        System.out.println(deCodeWord);


    }

}
