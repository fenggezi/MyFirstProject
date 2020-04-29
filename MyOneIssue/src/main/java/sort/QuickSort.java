package sort;

public class QuickSort {
    public void quickSort(int [] arr,int start ,int end){
        int i =start;
        int j =end;
        int middle = 0;

        if(end -start>0){
            while(i<j){
                while(i<j &&arr[j]<=arr[i]){
                    j--;
                }
                if(i<j){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
                while(i<j &&arr[i]>=arr[j]){
                    i++;
                }
                if(i<j){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
            middle =i; // 相遇  ij

            quickSort(arr,0,middle-1);
            quickSort(arr,middle+1,end);
        }else if(end -start<=0){
            return ;//出口
        }
    }
}
