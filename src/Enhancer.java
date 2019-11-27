import java.util.HashMap;
import java.util.Map;
import java.util.Random;


/**
 * Class enhancing password strength
 * @author IwonaD
 */

public class Enhancer {
    String pass;

    Enhancer(String passwd) {
        pass = passwd;
    }

    /**
     * @return enhanced password
     */
    String enhancePass() {
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
                else if (random.nextBoolean() && Character.isUpperCase(enPass.charAt(i))) {
                    enPass.setCharAt(i, Character.toLowerCase(enPass.charAt(i)));
                }
            }
        }

        return enPass.toString();
    }

    /**
     * Initializes library for enhancing password
     * @return
     */
    Map initLib() {
        Map<Character, Character> lib = new HashMap<>();
        lib.put('a', 'ą');
        lib.put('b', '6');
        lib.put('c', 'ć');
        lib.put('e', '3');
        lib.put('f', '?');
        lib.put('h', '#');
        lib.put('i', '!');
        lib.put('j', '|');
        lib.put('l', 'ł');
        lib.put('n', '^');
        lib.put('o', '.');
        lib.put('p', '%');
        lib.put('s', '$');
        lib.put('u', 'ó');
        lib.put('x', '+');
        lib.put('z', '=');
        lib.put(' ', '_');
        lib.put('A', '&');
        lib.put('B', '}');
        lib.put('C', '[');
        lib.put('D', ')');
        lib.put('E', 'Ę');
        lib.put('F', '~');
        lib.put('G', '9');
        lib.put('H', '-');
        lib.put('J', ']');
        lib.put('L', '1');
        lib.put('O', '0');
        lib.put('S', '5');
        lib.put('U', 'Ó');
        lib.put('Z', 'Ż');

        return lib;
    }
}
