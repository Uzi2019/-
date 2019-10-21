package com.structure.data.queue;

/**
 * @Auther: ZMJ
 * @Date: 2019/10/21 11:53
 * @Description:用链表实现一个队列
 */
public class ListQueue<T> {
    int size;

    Node<T> head;

    Node<T> tail;

    public ListQueue() {
        this.size = 0;
        this.head=null;
        this.tail=null;

    }

    public boolean addData(T data){
        if(head==null){
            Node node=new Node(data);
            tail=head=node;
            size++;
            return  true;
        }else{
            Node tails=tail;
            Node node=new Node(data);
            tails.next=node;
            tail=node;
            size++;
            return true;
        }

    }

    public T removeData(){
        if(head==null){
            return null;
        }
        T t=this.head.data;
        Node head=this.head.next;
        this.head.next=null;
        this.head=head;
        size--;
        return t;
    }

    public class Node<T> {
        Node next;
        T data;

       public  Node(T data){
            this.data=data;
        }

    }

    public static void main(String[] args) {
        ListQueue<Integer> queue=new ListQueue();
        queue.addData(3);
        queue.addData(5);
        queue.addData(9);
        queue.addData(10);
        queue.addData(4);
        queue.addData(8);
        queue.addData(9);
        queue.addData(3);
        Integer a=queue.removeData();
        Integer m=queue.removeData();
        System.out.println(m);


    }


    }
