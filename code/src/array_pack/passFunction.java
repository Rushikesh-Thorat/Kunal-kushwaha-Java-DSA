package array_pack;

import java.util.Arrays;

public class passFunction {
    public static void main(String[] args) {
        int[] nums = {2,3,5,4,5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }// Arrays in java are mutable it changeble
    static void change (int[] arr){
        arr[0] =22;
    }
}
