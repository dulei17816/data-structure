package cn.com.data.structure.chapt01_array;

import java.sql.Array;
import java.util.ArrayList;

public class MyArray<T> {

    /**
     * 保存数据
     */
    private Object[] data;

    /**
     * 实际长度
     */
    private int size;

    /**
     * 定义空数据
     */
    private static final Object[] EMPTY_ELEMENTDATA = {};

    /**
     * 定义默认容量
     */
    private static final int DEFAULT_CAPACITY = 10;


    public MyArray() {
        this.data = EMPTY_ELEMENTDATA;
        this.size = 0;
    }

    public MyArray(int size) {
        this.data = new Object[size];
        this.size = 0;
    }

    public boolean insert(T o) {
        ensureCapacity(size+1);//容量已经满了,进行扩容
        data[size++] = o;
        return true;
    }

    public int size() {
        return this.size;
    }

    /**
     * 扩容保证容量正确
     * @param minCapacity
     */
    private void ensureCapacity(int minCapacity) {
        if (this.data == EMPTY_ELEMENTDATA){
            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        }
        if (minCapacity - data.length > 0) {
            int oldCapacity = this.data.length;
            int newCapacity = oldCapacity + oldCapacity >> 1;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            if (newCapacity > Integer.MAX_VALUE - 8) {
                newCapacity = Integer.MAX_VALUE;
            }
            Object[] newObjects = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newObjects[i] = data[i];
            }
            this.data = newObjects;
        }
    }

    public T get(int index) {
        rangeCheck(index);
        return elementData(index);
    }

    private void rangeCheck(int index) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private T elementData(int index) {
        return (T) data[index];
    }

    /**
     * 删除元素
     * @param index
     * @return
     */
    public boolean remove(int index) {
        rangeCheck(index);
        for (int i = index; i < size-1; i++) {
            data[i] = data[i + 1];
        }
        --size;
        return true;
    }

    public boolean contains(T o) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int find(T o) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public void insert(int index, T o) {
        rangeCheck(index);
        ensureCapacity(size + 1);
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = o;
        size++;
    }

    public void addFirst(T o) {
        insert(0, o);
    }

    public void addLast(T o) {
        insert(size, o);
    }

    public void removeFirst() {
        remove(0);
    }



}
