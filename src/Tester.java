public class Tester {
    public static void main(String[] args) {
//        //System.out.print("MOE");
////        System.out.println("Is this character a digit " + test.isDigit());
////        System.out.println("Is this character a Letter " + test.isLetter());
////        System.out.println("Give me ASCII of 97(a) to uppercase " + test.toUpperCase());
////        System.out.println("Give me ASCII of 65(A) to lowercase " + test2.toLowerCase());
////        System.out.println("size of array " + Cap.length);
//
//        RString r = new RString("hfllo");
//        RString string = new RString(Cap);
//        System.out.println(string.hashCode());
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(r.compareTo(r2));
//        System.out.println(r.equals(r2));
//
//        ArrayList<String> arrayList = new ArrayList();
        RString r2 = new RString("hello");
        RString r3 = new RString("hello");
//        arrayList.add("D");
//        arrayList.add("E");
//        arrayList.add("F");
//        arrayList.add("G");

        //STRING ARRAYLIST
        RArrayList<String> arrayList = new RArrayList<>();
        RArrayList<String> arrayList2 = new RArrayList<>();
        arrayList.add("hello");
        arrayList2.add("hello");
        System.out.println(arrayList.toString());
        System.out.println("List Size is: " + arrayList.getListSize());
        System.out.println("String Array List Hashcode: " + arrayList.hashCode());
        System.out.println("String Array List Hashcode: " + arrayList2.hashCode());
        System.out.println("Are both String ArrayLists Equal "+arrayList2.equals(arrayList));
        //RCHAR ARRAYLIST
        RArrayList<RChar> arrayList3 = new RArrayList<>();
        RArrayList<RChar> arrayList4 = new RArrayList<>();
        RChar test = new RChar('s');
        RChar test2 = new RChar(97);
        arrayList3.add(test);
        arrayList4.add(test2);
        System.out.println(arrayList3.toString());
        System.out.println(arrayList4.toString());
        System.out.println("List Size is: " + arrayList.getListSize());
        System.out.println("Rchar Array List Hashcode: " + arrayList3.hashCode());
        System.out.println("Rchar Array List Hashcode: " + arrayList4.hashCode());
        System.out.println("Are both Rchar ArrayLists Equal "+arrayList3.equals(arrayList4));
        //RSTRING ARRAYLIST
        RArrayList<RString> arrayList5 = new RArrayList<>();
        RArrayList<RString> arrayList6 = new RArrayList<>();
        RChar test3 = new RChar('s');
        RChar test4 = new RChar(97);
        arrayList3.add(test);
        arrayList4.add(test2);
        System.out.println(arrayList3.toString());
        System.out.println(arrayList4.toString());
        System.out.println("List Size is: " + arrayList.getListSize());
        System.out.println("Rchar Array List Hashcode: " + arrayList3.hashCode());
        System.out.println("Rchar Array List Hashcode: " + arrayList4.hashCode());
        System.out.println("Are both Rchar ArrayLists Equal "+arrayList3.equals(arrayList4));
    }
}
