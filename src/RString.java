public class RString {
    private RChar[] rString;

    public RChar[] getrString() {
        return rString;
    }

    public RString(RChar rChar) {
        rString = new RChar[1];
        rString[0] = rChar;
    }

    public RString(RChar[] rChars) {
        rString = new RChar[rChars.length];
    }

    public RString(char character) {
        rString = new RChar[1];
        rString[0] = new RChar(character);
    }

    public RString(String word) {
        rString = new RChar[word.length()];
        for (int i = 0; i < word.length(); i++) {
            rString[i] = new RChar(word.charAt(i));
        }
    }
}