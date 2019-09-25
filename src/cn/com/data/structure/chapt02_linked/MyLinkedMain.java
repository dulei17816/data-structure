package cn.com.data.structure.chapt02_linked;

public class MyLinkedMain {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        for (int i = 0; i < 12; i++) {
            list.add(i);
        }
        System.out.println(list.get(5));

    }
}
