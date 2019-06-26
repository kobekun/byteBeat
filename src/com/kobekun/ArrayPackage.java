package com.kobekun;

public class ArrayPackage {

    private int[] data;
    private int size;

    //有参构造函数
    public ArrayPackage(int capacity){
        data = new int[capacity];
        size = 0;
    }

    //无参构造函数
    public ArrayPackage(){
        this(10);
    }

    //获取元素中的数组个数
    public int getSize(){
        return size;
    }

    //获取数组的容量
    public int getCapacity(){
        return data.length;
    }

    //数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }
}
