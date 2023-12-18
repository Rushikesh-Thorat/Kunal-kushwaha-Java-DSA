package E_problems_BinarySearch_pack;

public class ceiling {
    public static void main(String[] args) {
        int[] nums ={-88,-12,-2,2,3,4,5,6,7,8,9,11,22,33,45};
        int target = 13;
        int ans = ceilingS(nums,target);
        System.out.println(nums[ans]);

    }
    static  int ceilingS(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            // int mid =(start+end)/2; // might be possible that exceed the range of int
            int mid = start +(end-start)/2;

            if (target < arr[mid]){
                end =mid-1;
            } else if (target>arr[mid]) {
                start =mid+1;

            }
            else {
                return mid;
            }
        }
        return start;
    }
    }

