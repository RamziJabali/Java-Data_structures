public class Tester {
    public static void main(String[] args) {
        RString r = new RString("hello");
        RString string = new RString("hello");
        System.out.println(r.equals(string));
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
        arrayList.add("hell");
        arrayList2.add("hello");
        System.out.println(arrayList.toString());
        System.out.println("List Size is: " + arrayList.getListSize());
        System.out.println("List Size is: " + arrayList2.getListSize());
        System.out.println("String Array List Hashcode: " + arrayList.hashCode());
        System.out.println("String Array List Hashcode: " + arrayList2.hashCode());
        System.out.println("Are both String ArrayLists Equal " + arrayList2.equals(arrayList));
        //RCHAR ARRAYLIST
        RArrayList<RChar> arrayList3 = new RArrayList<>();
        RArrayList<RChar> arrayList4 = new RArrayList<>();
        RChar test = new RChar('s');
        RChar test2 = new RChar(97);
        arrayList3.add(test);
        arrayList4.add(test2);
        System.out.println(arrayList3.toString());
        System.out.println(arrayList4.toString());
        System.out.println("List Size is: " + arrayList3.getListSize());
        System.out.println("List Size is: " + arrayList4.getListSize());
        System.out.println("Rchar Array List Hashcode: " + arrayList3.hashCode());
        System.out.println("Rchar Array List Hashcode: " + arrayList4.hashCode());
        System.out.println("Are both Rchar ArrayLists Equal " + arrayList3.equals(arrayList4));
        //RSTRING ARRAYLIST
        RArrayList<RString> arrayList5 = new RArrayList<>();
        RArrayList<RString> arrayList6 = new RArrayList<>();
        RString test3 = new RString("hi");
        RString test4 = new RString("googlyyyyyyyyyy");
        RString test7 = new RString("Moggllyyy");
        RString test5 = new RString("I'm");
        RString test6 = new RString("Ramzi");
        arrayList5.add(test3);
        arrayList5.add(test5);
        arrayList6.add(test3);
        arrayList6.add(test5);
        System.out.println(arrayList5.toString());
        System.out.println(arrayList6.toString());
        System.out.println("List Size is: " + arrayList5.getListSize());
        System.out.println("List Size is: " + arrayList6.getListSize());
        System.out.println("RString Array List Hashcode: " + arrayList5.hashCode());
        System.out.println("RString Array List Hashcode: " + arrayList6.hashCode());
        System.out.println("Are both RString ArrayLists Equal " + arrayList5.equals(arrayList6));

        System.out.println(arrayList5);
        System.out.println("get node at index 0 " + arrayList5.getNodeAt(0));
        System.out.println("get node at index 1 " + arrayList5.getNodeAt(1));
        System.out.println("ArrayList 1 " + arrayList5);
        System.out.println("ArrayList 2 " + arrayList6);
        System.out.println("Is ArrayList1 equal to ArrayList 2 " + arrayList5.equals(arrayList6));
        arrayList6.clearArrayList();
        test3 = new RString("I cleared the List");
        arrayList6.add(test3);
        System.out.println("Is ArrayList2: " + arrayList6);
        arrayList6.add(test4);
        arrayList6.add(test5);
        System.out.println("Is ArrayList2 in reverse " + arrayList6.getReverseArrayList());
        System.out.println("Is ArrayList2: " + arrayList6);
    }
}
