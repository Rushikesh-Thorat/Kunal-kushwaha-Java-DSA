package array_pack;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        int[] arr =new int[5];
        arr[0] = 20;
        arr[1] = 30;
        arr[2] = 40;
        arr[3] = 50;
        arr[4] = 60;
        // stores data [20,30,40,50,60]
//        System.out.println(arr[3]);
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<arr.length;i++){
//            arr[i]= sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int num :arr){
            System.out.print(num +" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println();


        //String
        String[] str = new String[5];
        for (int i = 0 ; i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));
        str[2] ="Rushikesh";
        System.out.println(Arrays.toString(str));

    }
}
