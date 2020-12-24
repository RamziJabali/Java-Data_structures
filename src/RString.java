public class RString {
    private RChar[] rString;

    public RString(RChar rChar) {
        rString = new RChar[1];
        rString[0] = rChar;
    }

    public RString(RChar[] rChars) {
        rString = new RChar[rChars.length + 1];
    }

    public RString(char character) {

    }

    public RString(String word) {

    }
}
