package arrayList_pack;

import java.util.ArrayList;
import java.util.Scanner;

public class first_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(5);
//        list.add(54);
//        list.add(558);
//        list.add(57);
//        list.add(52);
//        list.add(533);
//
//        System.out.println(list);
//
//        System.out.println(list.contains(57));
//        System.out.println(list.contains(555));
//
//        list.set(0,51);
//        System.out.println(list);
//
//        list.remove(1);
//        System.out.println(list);
//
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));

        }
    }
}


// - size if fixed internally
// -