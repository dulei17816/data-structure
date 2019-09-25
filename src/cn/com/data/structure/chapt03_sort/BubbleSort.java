package cn.com.data.structure.chapt03_sort;

/**
 * 冒泡排序算法
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] as = {3,6,2,7,9,12,6};
        bubble(as);
        for (int i = 0; i < as.length; i++) {
            System.out.println(as[i]);
        }
    }

    /**
     * 普通的冒泡排序方法
     */
    public static void bubble(int[] as) {
        for (int i = 0; i < as.length; i++) {
            for (int j = 0; j < as.length - i - 1; j++) {
                if (as[j] > as[j + 1]) {
                    int tmp = as[j];
                    as[j] = as[j + 1];
                    as[j + 1] = tmp;
                }
            }
        }
    }

    /**
     * 优化后的冒泡排序方法
     */
    public static void betterBubble(int[] as) {
        for (int i = 0; i < as.length; i++) {
            boolean flag = false;
            for (int j = 0; j < as.length - i - 1; j++) {
                if (as[j] > as[j + 1]) {
                    int tmp = as[j];
                    as[j] = as[j + 1];
                    as[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}
