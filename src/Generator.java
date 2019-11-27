import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


/**
 * Class generating random passwords based on chosen length and charset
 * @author IwonaD
 */

public class Generator {
    String library;
    int passLen;

    /**
     * @param passLength length of password
     * @param az use [a-z]
     * @param aZ use [A-Z]
     * @param num use [0-9]
     * @param sPolChars use [ą, ć, ę, ł, ń, ó, ś, ź, ż]
     * @param bPolChars use [Ą, Ć, Ę, Ł, Ń, Ó, Ś, Ź, Ż]
     * @param specials use selected special chars
     */
    Generator(int passLength,
              boolean az,
              boolean aZ,
              boolean num,
              boolean sPolChars,
              boolean bPolChars,
              String specials) {
        library = "";
        passLen = passLength;

        if(az) library += "abcdefghijklmnopqrstuvwxyz";
        if(aZ) library += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if(num) library += "0123456789";
        if(sPolChars) library += "ąćęłńóśźż";
        if(bPolChars) library += "ĄĆĘŁŃÓŚŹŻ";
        library += specials;
    }

    /**
     * @return generated random password
     */
    String generatePass() {
        String genPass = "";
        Random random = new Random();

        List<Character> shuffledLibrary = shuffleLibrary();

        for(int i = 0; i < passLen; i++) {
            genPass += shuffledLibrary.get(random.nextInt(shuffledLibrary.size()));
        }

        return genPass;
    }

    /**
     * Enters characters from string to list and shuffles list
     * @return shuffled list of charset
     */
    List<Character> shuffleLibrary() {
        List<Character> shuffledLibrary = new LinkedList<>();
        for(char c : library.toCharArray()) {
            shuffledLibrary.add(c);
        }

        Collections.shuffle(shuffledLibrary);

        return shuffledLibrary;
    }
}
