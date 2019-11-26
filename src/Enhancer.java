import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Enhancer {
    String pass;

    Enhancer(String passwd){
        pass = passwd;
    }

    String enhancePass(){
        Map<Character, Character> lib = initLib();
        StringBuilder enPass = new StringBuilder(pass);
        Random random = new Random();

        for(int i = 0; i < pass.length(); i++) {
            if(random.nextBoolean() && lib.containsKey(enPass.charAt(i))) {
                enPass.setCharAt(i, lib.get(enPass.charAt(i)));
            }
            else {
                if (random.nextBoolean() && Character.isLowerCase(enPass.charAt(i))) {
                    enPass.setCharAt(i, Character.toUpperCase(enPass.charAt(i)));
                }

                if (random.nextBoolean() && Character.isUpperCase(enPass.charAt(i))) {
                    enPass.setCharAt(i, Character.toLowerCase(enPass.charAt(i)));
                }
            }
        }

        return enPass.toString();
    }

    Map initLib() {
        Map<Character, Character> lib = new HashMap<>();
        lib.put('a', '@');
        lib.put('c', '<');
        lib.put('e', '3');
        lib.put('f', '?');
        lib.put('h', '#');
        lib.put('i', '!');
        lib.put('j', '|');
        lib.put('l', '1');
        lib.put('n', '^');
        lib.put('o', '0');
        lib.put('p', '%');
        lib.put('s', '$');
        lib.put('x', '+');
        lib.put('z', '=');
        lib.put(' ', '_');

        return lib;
    }
}
