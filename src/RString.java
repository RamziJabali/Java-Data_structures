import java.util.Arrays;

public final class RString implements Comparable<RString> {
    private RChar[] rString;

    private RString() {
    }

    public RString(RChar rChar) {
        rString = new RChar[1];
        rString[0] = rChar;
    }

    public RString(char character) {
        rString = new RChar[1];
        rString[0] = new RChar(character);
    }

    public RString(RChar[] rChars) {
        rString = rChars;
    }

    public RString(String word) {
        rString = new RChar[word.length()];
        for (int i = 0; i < word.length(); i++) {
            rString[i] = new RChar(word.charAt(i));
        }
    }

    public RChar[] getRCharArray() {
        return rString;
    }

    public int getSize() {
        return rString.length;
    }

    public RString getReverse() {
        RChar[] reverseString = new RChar[rString.length];
        if (isEmpty() || getSize() == 1) {
            return this;
        }

        if (getSize() % 2 == 0) {
            for (int i = 0; i < reverseString.length / 2; i++) {
                final RChar placeholder = rString[i];
                reverseString[i] = rString[getSize() - (i + 1)];
                reverseString[getSize() - (i + 1)] = placeholder;
            }
        } else {
            for (int i = 0, j = getSize() - 1; i <= j; i++, j--) {
                final RChar increasingPointer = rString[i];
                final RChar decreasingPointer = rString[j];
                reverseString[j] = increasingPointer;
                reverseString[i] = decreasingPointer;
            }
        }
        return new RString(reverseString);
    }

    public boolean isEmpty() {
        return rString.length == 0;
    }

    @Override
    public String toString() {
        String word = "";
        if (rString.length > 1) {
            for (int j = 0; j < rString.length; j++) {
                word += rString[j];
            }
        } else {
            word = rString[0].toString();
        }
        return word;
    }


    @Override
    public int hashCode() {
        int hashCode = 0;
        int precidence;
        for (int i = 0; i < getSize(); i++) {
            precidence = (int) Math.pow(31, (getSize() - i));
            hashCode += rString[i].getValueOf() * precidence;
        }
        return hashCode;
    }

    @Override
    public int compareTo(RString o) {
        if (o.getSize() > getSize()) {
            return -1;
        }
        if (o.getSize() < getSize()) {
            return 1;
        }
        for (int i = 0; i < getSize(); i++) {
            if (o.rString[i].getValueOf() < rString[i].getValueOf()) {
                return 1;
            }
            if (o.rString[i].getValueOf() > rString[i].getValueOf()) {
                return -1;
            }
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof RString)) {
            return false;
        }
        return ((RString) obj).compareTo(this) == 0;
    }
}