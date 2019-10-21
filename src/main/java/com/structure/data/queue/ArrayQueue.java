package com.structure.data.queue;

/**
 * @Auther: ZMJ
 * @Date: 2019/10/21 10:45
 * @Description:用数组实现一个队列
 */
public class ArrayQueue {
    private int[] array;

    private int head;

    private int tail;

    private int size;

    public ArrayQueue(int n) {
        this.array = new int[n];
        this.head = 0;
        this.tail = 0;
        this.size = n;
    }
    /**数据迁移版本的入队列**/
    public boolean addData(int d) {
        if (tail == size && head==0) {
            return false;
        }
        if(tail == size){
            for(int i=head;i<size;i++){
                array[i-head]=array[head];

            }
            tail=tail-head;
            head=0;
        }
        array[tail]=d;
        tail++;
        return true;
    }

    public int removeData() {
        if (tail == head) {
            return 0;
        }
        int z = array[head];
        head++;
        return z;
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(10);
        queue.addData(1);
        queue.addData(2);
        queue.addData(3);
        queue.addData(4);
        queue.addData(5);
        queue.addData(6);
        int z=queue.removeData();
        int g=queue.removeData();
        System.out.println(g);
    }

}
