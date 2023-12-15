package array_pack;

import java.util.Arrays;
import java.util.Scanner;

public class multidimension {
    public static void main(String[] args) {
        int [][] arr2d = {
                {1,2,3,},
                {4,5,6,},
                {7,8,9,}
        };
        Scanner sc = new Scanner(System.in) ;
        int[][] arr = new int [3][2];
        System.out.println(arr.length);
        for (int row=0;row<arr.length;row++){
            for(int col =0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Another way to print arrays");
        for (int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        System.out.println("Another way to print arrays");

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println("Another way to print arrays");
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

        }
}
