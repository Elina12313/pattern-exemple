package org.exemple;

import List.MyList;
import List.MyNode;


public class Main {
public static void main(String[] args) {
//        System.out.println("Hello world!");
    MyList<Integer> list = new MyList<>();

    list.add(14);
    list.add(16);
    list.add(18);
    list.add(20);
    MyNode<Integer> list1 =list.getHead();
//    while(list1 != null) {
        System.out.println(list.getHead());
//        list1 = list1.getNext();
//    }


list.remove(14);
    System.out.println(list.getHead());
 }

}