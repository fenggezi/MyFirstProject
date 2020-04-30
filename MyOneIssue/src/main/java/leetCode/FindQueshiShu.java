package leetCode;

public class FindQueshiShu {

    public static  int finNum(int [] arr){

        int result = arr.length;
        for(int i = 0 ;i<arr.length;i++){
            result = result^arr[i]^i;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {1,4,3,0,6};
        int i = FindQueshiShu.finNum(arr);
        System.out.println(i);
    }
}
