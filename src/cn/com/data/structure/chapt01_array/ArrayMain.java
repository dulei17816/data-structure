package cn.com.data.structure.chapt01_array;

public class ArrayMain {
    public static void main(String[] args) {
        MyArray<Integer> array = new MyArray();
        array.insert(1);
        array.insert(2);
        array.insert(3);
        System.out.println(array.get(0));
        System.out.println(array.remove(1));
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        System.out.println("-------------------------");
        MyArray<Integer> ten = new MyArray<Integer>();
        for (int i = 0; i < 12; i++) {
            ten.insert(i, i);
        }
        for (int i = 0; i < 12; i++) {
            System.out.println(ten.get(i));
        }
        System.out.println("-------------------------");
        ten.addFirst(111);
        for (int i = 0; i < ten.size(); i++) {
            System.out.println(ten.get(i));
        }
    }
}
