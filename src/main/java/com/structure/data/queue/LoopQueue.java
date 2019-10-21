package com.structure.data.queue;

/**
 * @Auther: ZMJ
 * @Date: 2019/10/21 16:16
 * @Description:用数组实现一个循环队列
 */
public class LoopQueue {
    private int [] array;

    private int head;

    private int tail;

    private int size;

    public LoopQueue(int n) {
        this.array = new int[n];
        this.head=0;
        this.tail=0;
        this.size=n;
    }

    public boolean addData(int m){
        if((tail+1)%size==head){
            return false;
        }
        array[tail]=m;
        tail=(tail+1)%size;
        return true;
    }

    public int removeData(){
        if(head==tail) return 0;
        int m=array[head];
        head=(head+1)%size;
        return m;
    }
}
