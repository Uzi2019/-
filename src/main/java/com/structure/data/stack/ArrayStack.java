package com.structure.data.stack;

/**
 * @Auther: ZMJ
 * @Date: 2019/10/21 10:21
 * @Description:用数组实现一个栈
 */
public class ArrayStack {
    /**数据长度**/
    private    int n;

    private    int[] array;
    /**元素个数**/
    private    int size;

    public ArrayStack(int n) {
        this.array=new int[n];
        this.n=n;
        this.size=0;
    }

    /**入栈**/
    public boolean addData(int m){
        if(size==n){
            return false;
        }
        array[size]=m;
        size++;
        return true;
    }

    /**出栈操作**/
    public int removeData(){
        if(size==0){
            return 0;
        }
        int z=array[size-1];
        size--;
        return z;
    }

    public static void main(String[] args) {
        ArrayStack stack=new ArrayStack(10);
        stack.addData(5); stack.addData(3);
        stack.addData(7);
        stack.addData(8);
        stack.addData(9);
        stack.addData(10);
        int z=stack.removeData();
        stack.addData(11);
        System.out.println(z);
        for(int a:stack.array){
            System.out.println(a);
        }


    }


}
