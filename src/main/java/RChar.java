public final class RChar implements Comparable<RChar> {
    private int rCharacter;

    public static RChar getFirstCharacter(String word) {
        if (word.isEmpty()) {
            return new RChar(0);
        }
        return new RChar(word.charAt(0));
    }

    public RChar(int ascii) {
        rCharacter = ascii;
    }

    public RChar(char character) {
        rCharacter = getStringAsAscii(character + "");
    }

    private RChar(String letter) {
        rCharacter = getStringAsAscii(letter);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof RChar)) {
            return false;
        }
        return ((RChar) obj).getValueOf() == rCharacter;
    }

    @Override
    public int hashCode() {
        return rCharacter;
    }

    @Override
    public String toString() {
        return getAsciiToString(rCharacter);
    }

    @Override
    public int compareTo(RChar rChar) {
        if (rCharacter < rChar.getValueOf()) {
            return -1;
        }
        if (rCharacter == rChar.getValueOf()) {
            return 0;
        }
        return 1;
    }

    public int getValueOf() {
        return rCharacter;
    }

    public int toUpperCase() {
        if (!isLetter()) {
            return rCharacter;
        }
        if (isLowerCase()) {
            return rCharacter - 32;
        }
        return rCharacter;
    }

    public Boolean isDigit() {
        return rCharacter >= 48 && rCharacter <= 57;
    }

    public Boolean isLetter() {
        return rCharacter >= 65 && rCharacter <= 90 || rCharacter >= 97 && rCharacter <= 122;
    }

    public boolean isLowerCase() {
        return rCharacter >= 97 && rCharacter <= 122;
    }

    public int toLowerCase() {
        if (!isLetter()) {
            return rCharacter;
        }
        if (isUpperCase()) {
            return rCharacter + 32;
        }
        return rCharacter;
    }

    public boolean isUpperCase() {
        return rCharacter >= 65 && rCharacter <= 90;
    }

    public boolean isEmpty() {
        return isSpace();
    }

    public boolean isSpace() {
        return rCharacter == 32;
    }

    private String getAsciiToString(int ascii) {
        String character = "";
        switch (ascii) {
            case 32:
                character = " ";
            case 33:
                character = "!";
                break;
            case 34:
                character = "\"";
                break;
            case 35:
                character = "#";
                break;
            case 36:
                character = "$";
                break;
            case 37:
                character = "%";
                break;
            case 38:
                character = "&";
                break;
            case 39:
                character = "\'";
                break;
            case 40:
                character = "(";
                break;
            case 41:
                character = ")";
                break;
            case 42:
                character = "*";
                break;
            case 43:
                character = "+";
                break;
            case 44:
                character = ",";
                break;
            case 45:
                character = "-";
                break;
            case 46:
                character = ".";
                break;
            case 47:
                character = "/";
                break;
            case 48:
                character = "0";
                break;
            case 49:
                character = "1";
                break;
            case 50:
                character = "2";
                break;
            case 51:
                character = "3";
                break;
            case 52:
                character = "4";
                break;
            case 53:
                character = "5";
                break;
            case 54:
                character = "6";
                break;
            case 55:
                character = "7";
                break;
            case 56:
                character = "8";
                break;
            case 57:
                character = "9";
                break;
            case 58:
                character = ":";
                break;
            case 59:
                character = ";";
                break;
            case 60:
                character = "<";
                break;
            case 61:
                character = "=";
                break;
            case 62:
                character = ">";
                break;
            case 63:
                character = "?";
                break;
            case 64:
                character = "@";
                break;
            case 65:
                character = "A";
                break;
            case 66:
                character = "B";
                break;
            case 67:
                character = "C";
                break;
            case 68:
                character = "D";
                break;
            case 69:
                character = "E";
                break;
            case 70:
                character = "F";
                break;
            case 71:
                character = "G";
                break;
            case 72:
                character = "H";
                break;
            case 73:
                character = "I";
                break;
            case 74:
                character = "J";
                break;
            case 75:
                character = "K";
                break;
            case 76:
                character = "L";
                break;
            case 77:
                character = "M";
                break;
            case 78:
                character = "N";
                break;
            case 79:
                character = "O";
                break;
            case 80:
                character = "P";
                break;
            case 81:
                character = "Q";
                break;
            case 82:
                character = "R";
                break;
            case 83:
                character = "S";
                break;
            case 84:
                character = "T";
                break;
            case 85:
                character = "U";
                break;
            case 86:
                character = "V";
                break;
            case 87:
                character = "W";
                break;
            case 88:
                character = "X";
                break;
            case 89:
                character = "Y";
                break;
            case 90:
                character = "Z";
                break;
            case 91:
                character = "[";
                break;
            case 92:
                character = "\\";
                break;
            case 93:
                character = "]";
                break;
            case 94:
                character = "^";
                break;
            case 95:
                character = "_";
                break;
            case 96:
                character = "`";
                break;
            case 97:
                character = "a";
                break;
            case 98:
                character = "b";
                break;
            case 99:
                character = "c";
                break;
            case 100:
                character = "d";
                break;
            case 101:
                character = "e";
                break;
            case 102:
                character = "f";
                break;
            case 103:
                character = "g";
                break;
            case 104:
                character = "h";
                break;
            case 105:
                character = "i";
                break;
            case 106:
                character = "j";
                break;
            case 107:
                character = "k";
                break;
            case 108:
                character = "l";
                break;
            case 109:
                character = "m";
                break;
            case 110:
                character = "n";
                break;
            case 111:
                character = "o";
                break;
            case 112:
                character = "p";
                break;
            case 113:
                character = "q";
                break;
            case 114:
                character = "r";
                break;
            case 115:
                character = "s";
                break;
            case 116:
                character = "t";
                break;
            case 117:
                character = "u";
                break;
            case 118:
                character = "v";
                break;
            case 119:
                character = "w";
                break;
            case 120:
                character = "x";
                break;
            case 121:
                character = "y";
                break;
            case 122:
                character = "z";
                break;
            case 123:
                character = "{";
                break;
            case 124:
                character = "|";
                break;
            case 125:
                character = "}";
                break;
            case 126:
                character = "~";
                break;
        }
        return character;
    }

    private int getStringAsAscii(String word) {
        int ascii = 0;
        switch (word) {
            case " ":
                ascii = 32;
                break;
            case "!":
                ascii = 33;
                break;
            case "\"":
                ascii = 34;
                break;
            case "#":
                ascii = 35;
                break;
            case "$":
                ascii = 36;
                break;
            case "%":
                ascii = 37;
                break;
            case "&":
                ascii = 38;
                break;
            case "\'":
                ascii = 39;
                break;
            case "(":
                ascii = 40;
                break;
            case ")":
                ascii = 41;
                break;
            case "*":
                ascii = 42;
                break;
            case "+":
                ascii = 43;
                break;
            case ",":
                ascii = 44;
                break;
            case "-":
                ascii = 45;
                break;
            case ".":
                ascii = 46;
                break;
            case "/":
                ascii = 47;
                break;
            case "0":
                ascii = 48;
                break;
            case "1":
                ascii = 49;
                break;
            case "2":
                ascii = 50;
                break;
            case "3":
                ascii = 51;
                break;
            case "4":
                ascii = 52;
                break;
            case "5":
                ascii = 53;
                break;
            case "6":
                ascii = 54;
                break;
            case "7":
                ascii = 55;
                break;
            case "8":
                ascii = 56;
                break;
            case "9":
                ascii = 57;
                break;
            case ":":
                ascii = 58;
                break;
            case ";":
                ascii = 59;
                break;
            case "<":
                ascii = 60;
                break;
            case "=":
                ascii = 61;
                break;
            case ">":
                ascii = 62;
                break;
            case "?":
                ascii = 63;
                break;
            case "@":
                ascii = 64;
                break;
            case "A":
                ascii = 65;
                break;
            case "B":
                ascii = 66;
                break;
            case "C":
                ascii = 67;
                break;
            case "D":
                ascii = 68;
                break;
            case "E":
                ascii = 69;
                break;
            case "F":
                ascii = 70;
                break;
            case "G":
                ascii = 71;
                break;
            case "H":
                ascii = 72;
                break;
            case "I":
                ascii = 73;
                break;
            case "J":
                ascii = 74;
                break;
            case "K":
                ascii = 75;
                break;
            case "L":
                ascii = 76;
                break;
            case "M":
                ascii = 77;
                break;
            case "N":
                ascii = 78;
                break;
            case "O":
                ascii = 79;
                break;
            case "P":
                ascii = 80;
                break;
            case "Q":
                ascii = 81;
                break;
            case "R":
                ascii = 82;
                break;
            case "S":
                ascii = 83;
                break;
            case "T":
                ascii = 84;
                break;
            case "U":
                ascii = 85;
                break;
            case "V":
                ascii = 86;
                break;
            case "W":
                ascii = 87;
                break;
            case "X":
                ascii = 88;
                break;
            case "Y":
                ascii = 89;
                break;
            case "Z":
                ascii = 90;
                break;
            case "[":
                ascii = 91;
                break;
            case "\\":
                ascii = 92;
                break;
            case "]":
                ascii = 93;
                break;
            case "^":
                ascii = 94;
                break;
            case "_":
                ascii = 95;
                break;
            case "`":
                ascii = 96;
                break;
            case "a":
                ascii = 97;
                break;
            case "b":
                ascii = 98;
                break;
            case "c":
                ascii = 99;
                break;
            case "d":
                ascii = 100;
                break;
            case "e":
                ascii = 101;
                break;
            case "f":
                ascii = 102;
                break;
            case "g":
                ascii = 103;
                break;
            case "h":
                ascii = 104;
                break;
            case "i":
                ascii = 105;
                break;
            case "j":
                ascii = 106;
                break;
            case "k":
                ascii = 107;
                break;
            case "l":
                ascii = 108;
                break;
            case "m":
                ascii = 109;
                break;
            case "n":
                ascii = 110;
                break;
            case "o":
                ascii = 111;
                break;
            case "p":
                ascii = 112;
                break;
            case "q":
                ascii = 113;
                break;
            case "r":
                ascii = 114;
                break;
            case "s":
                ascii = 115;
                break;
            case "t":
                ascii = 116;
                break;
            case "u":
                ascii = 117;
                break;
            case "v":
                ascii = 118;
                break;
            case "w":
                ascii = 119;
                break;
            case "x":
                ascii = 120;
                break;
            case "y":
                ascii = 121;
                break;
            case "z":
                ascii = 122;
                break;
            case "{":
                ascii = 123;
                break;
            case "|":
                ascii = 124;
                break;
            case "}":
                ascii = 125;
                break;
            case "~":
                ascii = 126;
                break;
        }
        return ascii;
    }
}