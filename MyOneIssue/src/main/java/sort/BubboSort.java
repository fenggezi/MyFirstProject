package sort;

public class BubboSort {
    public int[] bubboSort1(int[] arr ){
        //冒泡排序就是将响铃的位置的数如果排序不真确就互换
        int length = arr.length;
        for(int i =0 ;i<arr.length-1;i++ ){// 对当前的组
            for(int j = 0 ;j<arr.length-1-i;j++){// 这里  j-i-1 是对当前 已近排过顺序的前 i 位 不必再排序
                if(arr[j]>arr[j+1]){
                    int tmp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
}
