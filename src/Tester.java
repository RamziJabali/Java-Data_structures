public class Tester {
    public static void main(String[] args) {
        RChar test = new RChar(65);
        RChar test2 = new RChar(97);
        RChar Cap[] = new RChar[10];
//        System.out.println("Is this character a digit " + test.isDigit());
//        System.out.println("Is this character a Letter " + test.isLetter());
//        System.out.println("Give me ASCII of 97(a) to uppercase " + test.toUpperCase());
//        System.out.println("Give me ASCII of 65(A) to lowercase " + test2.toLowerCase());
//        System.out.println("size of array " + Cap.length);
//        for (int i = 0; i <= Cap.length; i++) {
//            Cap[i] = new RChar(65 + i);
//        }
        RString string = new RString("ramzi");
        RChar word[] = string.getrString();
        for (int j = 0; j < word.length; j++) {
            System.out.print(word[j]);
        }
    }
}
