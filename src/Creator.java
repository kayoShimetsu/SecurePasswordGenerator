import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Creator {
    LinkedList<String> words;

    Creator(String w1, String w2, String w3, String w4, String w5)
    {
        words = new LinkedList();
        words.add(w1);
        words.add(w2);
        words.add(w3);
        words.add(w4);
        words.add(w5);
    }

    String createPass(){
        String pass = "";

        Collections.shuffle(words);

        Random random = new Random();
        String places = Integer.toBinaryString(random.nextInt(2^(words.size())));

        while(places.length() < words.size() + 1) places = '0' + places;

        for(int i = 0; i < words.size(); i++) {
            if(places.charAt(i) == '1') pass += random.nextInt(10);
            pass += new Enhancer(words.get(i)).enhancePass();
        }

        if(places.charAt(words.size()) == '1') pass += random.nextInt(10);

        while(pass.length() < 8) {
            pass += (char)(random.nextInt(93) + 33);
        }

        return pass;
    }
}
