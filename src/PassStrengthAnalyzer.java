/**
 * Class analyzing password strength
 * @author IwonaD
 */

public class PassStrengthAnalyzer {
    String pass;

    /**
     * @param passwd password to analyze
     */
    PassStrengthAnalyzer(String passwd) {
        this.pass = passwd;
    }

    /**
     * Analyzes strength based on Shannon entrophy
     * @return Five possible strings "Siła hasła: bardzo słabe/
     *         słabe/średnie/dobre/silne"
     */
    String passStrength() {
        double passEntrophy;

        passEntrophy = pass.length() * (Math.log(passAlphabetLenghth()) / Math.log(2));

        if(passEntrophy < 40) return "Siła hasła: bardzo słabe";
        else if(passEntrophy > 40
                && passEntrophy < 60) return "Siła hasła: słabe";
        else if(passEntrophy > 60
                && passEntrophy < 80) return "Siła hasła: średnie";
        else if(passEntrophy > 80
                && passEntrophy < 100) return "Siła hasła: dobre";
        else return "Siła hasła: silne";
    }

    /**
     * Checks alphabet (not the number od unique chars contained in password) from which password was created
     * @return alphabet length
     */
    private int passAlphabetLenghth() {
        int len = 0;

        boolean isDigit = false; //0-9
        boolean isUpCaseLetter = false;
        boolean isLoCaseLetter = false;
        boolean isUpCasePolishLetter = false;
        boolean isLoCasePolishLetter = false;
        boolean isSpecial = false;


        for(Character ch : pass.toCharArray()) {
            if(Character.isDigit(ch)
                    && (isDigit == false)) {
                len += 10;
                isDigit = true;
            }

            if(Character.isLetter(ch)
                    && Character.isUpperCase(ch)
                    && isUpCaseLetter == false) {
                len += 26;
                isUpCaseLetter = true;
            }

            if(Character.isLetter(ch)
                    && Character.isLowerCase(ch)
                    && isLoCaseLetter == false) {
                len += 26;
                isLoCaseLetter = true;
            }

            if(isUpperCasePolishLetter(ch)
                    && isUpCasePolishLetter == false) {
                len += 9;
                isUpCasePolishLetter = true;
            }

            if(isLowerCasePolishLetter(ch)
                    && isLoCasePolishLetter == false) {
                len += 9;
                isLoCasePolishLetter = true;
            }

            if(isSpecialCharacter(ch)
                    && isSpecial == false) {
                len += 32;
                isSpecial = true;
            }
        }

        return len;
    }

    /**
     * Checks if char is lower case polish letter
     * @param ch
     * @return
     */
    private boolean isLowerCasePolishLetter(Character ch) {
        if(ch == 'ą'
                || ch == 'ć'
                || ch == 'ę'
                || ch == 'ł'
                || ch == 'ń'
                || ch == 'ó'
                || ch == 'ś'
                || ch == 'ź'
                || ch == 'ż')
            return true;
        else return false;
    }

    /**
     * Checks if a char is upper case polish letter
     * @param ch
     * @return
     */
    private boolean isUpperCasePolishLetter(Character ch) {
        if(ch == 'Ą'
                || ch == 'Ć'
                || ch == 'Ę'
                || ch == 'Ł'
                || ch == 'Ń'
                || ch == 'Ó'
                || ch == 'Ś'
                || ch == 'Ź'
                || ch == 'Ż')
            return true;
        else return false;
    }

    /**
     * Checks if char is a special character
     * @param ch
     * @return
     */
    private boolean isSpecialCharacter(Character ch) {
        if((ch >= '!' && ch <= '/')
                || (ch >= ':' && ch <= '@')
                || (ch >= '[' && ch <= '`')
                || (ch >= '{' && ch <= '~'))
            return true;
        else return false;
    }
}
