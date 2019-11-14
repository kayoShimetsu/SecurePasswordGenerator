import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class Generator {
    String library;
    int passLen;


    Generator(int passLenght,
              boolean az,
              boolean aZ,
              boolean num,
              boolean sPolChars,
              boolean bPolChars,
              String specials) {
        library = "";
        passLen = passLenght;

        if(az) library += "abcdefghijklmnopqrstuvwxyz";
        if(aZ) library += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if(num) library += "0123456789";
        if(sPolChars) library += "ąćęłńóśźż";
        if(bPolChars) library += "ĄĆĘŁŃÓŚŹŻ";
        library += specials;
    }

    String generatePass() {
        String genPass = "";
        Random random = new Random();

        List<Character> shuffledLibrary = shuffleLibrary();

        for(int i = 0; i < passLen; i++) {
            genPass += shuffledLibrary.get(random.nextInt(shuffledLibrary.size()));
        }

        return genPass;
    }

    List<Character> shuffleLibrary() {
        List<Character> shuffledLibrary = new LinkedList<>();
        for(char c : library.toCharArray()) {
            shuffledLibrary.add(c);
        }

        Collections.shuffle(shuffledLibrary);

        return shuffledLibrary;
    }
}
