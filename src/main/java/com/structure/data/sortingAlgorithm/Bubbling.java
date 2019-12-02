package com.structure.data.sortingAlgorithm;

/**
 * @Auther: ZMJ
 * @Date: 2019/11/23 16:49
 * @Description:冒泡排序
 */
public class Bubbling {

    public static int[] sortArray(int[] array){
        int d=0;
        for(int i=0;i<array.length;i++){
            boolean falg=true;
            for(int j=0;j<array.length-i-1;j++){
                d++;
                if(array[j]>array[j+1]){
                    int b=array[j];
                    array[j]=array[j+1];
                    array[j+1]=b;
                    falg=false;
                }
            }
            if(falg){
                System.out.println(d);
                break;
            }
        }
        return  array;
    }

    public static void main(String[] args) {
        int [] m={1,5,6,2,4,8,3};
        int [] n=sortArray(m);
        for(int z=0;z<n.length;z++){
            System.out.println(n[z]);
        }
    }
}
