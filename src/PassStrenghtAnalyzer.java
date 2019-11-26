public class PassStrenghtAnalyzer {
    String pass;

    PassStrenghtAnalyzer(String paswd) {
        this.pass = paswd;
    }

    String passStrength() {
        double passEntrophy;

        passEntrophy = pass.length() * (Math.log(passAlpabetLenghth()) / Math.log(2));

        if(passEntrophy < 50) return "Siła hasła: słabe";
        else if(passEntrophy > 50
                && passEntrophy < 60) return "Siła hasła: średnie";
        else if(passEntrophy > 60) return "Siła hasła: silne";
        else return "Siła hasła: ";
    }

    private int passAlpabetLenghth() {
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

    private boolean isSpecialCharacter(Character ch) {
        if((ch >= '!' && ch <= '/')
                || (ch >= ':' && ch <= '@')
                || (ch >= '[' && ch <= '`')
                || (ch >= '{' && ch <= '~'))
            return true;
        else return false;
    }

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
}
