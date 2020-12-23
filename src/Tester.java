public class Tester {
    public static void main(String[] args) {
        RChar test = new RChar(65);

        System.out.println("Is this character a digit " +test.isDigit());
        System.out.println("Is this character a Letter " +test.isLetter());
    }
}
