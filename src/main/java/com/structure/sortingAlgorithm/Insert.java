package com.structure.sortingAlgorithm;

/**
 * @Auther: ZMJ
 * @Date: 2019/12/2 11:18
 * @Description:
 */
public class Insert {

    public static int[] sortArray(int[] array){
        //从1开始插入
        for(int i=1;i<array.length;i++){
            //定义要插入的值
            int value=array[i];
            int j=i-1;
            for(;j>=0;j--){
                if(array[j]>value){
                    array[j+1]=array[j];
                }else{
                    break;
                }
            }
            array[j+1]=value;

        }
        return array;
    }

    public static void main(String[] args) {
        int [] m={1,5,6,2,4,8,3};
        int [] n=sortArray(m);
        for(int z=0;z<n.length;z++){
            System.out.println(n[z]);
        }
    }
}
