import java.util.*;
public class day4 {
    public static void main(String[] args) {
        int [][]arr=new int[4][5];
        System.out.println(arr);
//        printArr(arr);
    }
    public static void initial(int arr[][]){
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int) (Math.random() * 11);

            }
        }
    }
    public static void printArr(int arr[][]){
        /**
         * @param
         */
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


}
