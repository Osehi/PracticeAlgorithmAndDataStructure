package practiceoop;

import java.util.ArrayList;

public class PracticeOOP {

    public static class P {
        {
            System.out.print("1");
        }
        static {
            System.out.print("2");
        }
    }

    public static class C extends P {
        {
            System.out.print("3");
        }
        static {
            System.out.print("4");
        }
    }

    public static void main(String[] args) {
//        P p = new P();
//        C c = new C();
        ArrayList<String> listA = new ArrayList<>();
        listA.add("A");
        ArrayList<String> listB = listA;
        ArrayList<String> listC = new ArrayList<>(listB);
        listA.clear();
        listB.add("B");
        listC.add("C");

        System.out.println(listA);
        System.out.println(listB);
        System.out.println(listC);
    }
}
