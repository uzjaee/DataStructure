package list;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList4<Integer> l2 = new ArrayList4<>(3);
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);

        ArrayList<Integer> l3 = new ArrayList<>(3);

    }

}

//        List<String> l1= new LinkedList<>();
//        l1.append("강아지");
//        l1.append("고양이");
//        l1.append("망아지");
//        l1.append("사자");
//        l1.append("캥거루");
//        l1.insert(0,"호랑이");
//        l1.remove(0);
//        System.out.println(l1.getValue(0));
//
//        List<Integer> l2 = new LinkedList<>();
//        l2.append(2);
//        l2.append(3);
//        l2.append(8);
//        l2.append(7);
//        l2.append(5);
//        l2.insert(2,99);
//        l2.insert(1,888);
//        for(int i =0;i<l2.length();i++){
//            System.out.print(l2.getValue(i) + " ");
//        }
//        System.out.println();
//        ArrayList<String> l1 = new ArrayList<>(8);
//
//        l1.append("사자");
//        l1.append("고양이");
//        l1.append("개");
//        l1.append("표범");
//        l1.test();
//        System.out.println(l1.getValue(2));
//        System.out.println(l1.getValue(3));
