import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Tester {
    public static void main(String[] args) {
        //System.out.print("MOE");
//        RChar test = new RChar('s');
//        RChar test2 = new RChar(97);
        RChar Cap[] = new RChar[5];
//        System.out.println("Is this character a digit " + test.isDigit());
//        System.out.println("Is this character a Letter " + test.isLetter());
//        System.out.println("Give me ASCII of 97(a) to uppercase " + test.toUpperCase());
//        System.out.println("Give me ASCII of 65(A) to lowercase " + test2.toLowerCase());
//        System.out.println("size of array " + Cap.length);
        for (int i = 0; i < Cap.length; i++) {
            Cap[i] = new RChar(65 + i);
        }

        RString r = new RString("hfllo");
        RString r2 = new RString("hello");
        RString string = new RString(Cap);
        System.out.println(string.hashCode());
        System.out.println(Integer.MAX_VALUE);
        System.out.println(r.compareTo(r2));
        System.out.println(r.equals(r2));
    }
}
