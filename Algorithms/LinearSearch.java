package Algorithms;

public class LinearSearch {
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,9};
        int target = 7;
        int found = 0;

        for(int i = 0; i < arr.length;i++){
            if(arr[i] == target){
                System.out.println("target found at index : " + i);
                found = 1;
                break;
            }
        }
        if(found == 0){
            System.out.println("target not found in array.");

        }
    }
}
    

