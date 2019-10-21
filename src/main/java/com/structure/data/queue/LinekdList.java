package com.structure.data.queue;

public class LinekdList<T> {
    int size;
    Node list;

    public LinekdList() {
        this.size = 0;
    }
    public void put(T data){
        Node head=list;
        Node node=new Node(data,head);
        list=node;
        size++;
    }
    public void remove(int index){
        checkIndex(index);
        Node head=list;
        Node cur=list;
        for(int i=0;i<index;i++){
            head=cur;
            cur=cur.next;
        }
        head.next=cur.next;
        cur.next=null;
        size--;
    }

    public void remove(T data){
        Node head=list;
        Node cur=list;
        while(!(cur.data==data)){
            head=cur;
            cur=cur.next;
        }
        if(cur.next==null){
            head.next=null;
        }else{
            head.next=cur.next;
            cur.next=null;
        }
        size--;
    }

    @Override
    public String toString() {
        Node head=list;
        for(int i=0;i<size;i++){
            System.out.println(head.data);
            head=head.next;
        }
        return super.toString();
    }

    public void put(int index, T data){

        checkIndex(index);
        Node head=list;
        Node cur=list;
        for(int i=0;i<index;i++){
            head=cur;
            cur=cur.next;
        }
        Node node=new Node(data,cur);
        head.next=node;
        size++;
    }

    public void checkIndex(int index){
        if(index>size || index<0){
            throw new ArrayIndexOutOfBoundsException("index:"+index+"size:"+size) ;
        }
    }

    public class Node{
         T data;
         Node next;

        public Node(T data,Node next) {
            this.data=data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LinekdList<Integer> list=new LinekdList();
        for(int m=0;m<5;m++){
            list.put(m);
        }
        Integer i=0;
        list.remove(i);
        list.toString();
    }
}
