package array_pack;

public class first_array {
    public static void main(String[] args){
        int[] rno1 = new int[5];
        // int = datatype
        // rno1 = refrence veriable
        // new = use to create an object
        //new int [5] = creating object in heap memory
        int[] rno2 = {10,20,30,40,50};
        //there are two type of represent arrays


        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; //actually hare obj is being created in the memory(heap)
        System.out.println(ros[1]); // by default is 0 when empty : {0,0,0,0,0}

        String[] arr = new String[4];
        System.out.println(arr[3]);// by default is null when empty
    }
}
//heap : - array object are in heap
//       - heap object are not continuos
//       - Dynamic memory allocation


//datatypes store in stack : primitive datatypes int,char,float,double,byte,long ...
// datatypes store in heap : refrence type (non primitive datatypes) = String,arrays
