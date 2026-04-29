public class MissingNumber {
    public int misArrNum(int[] arr){

        int n = arr.length;

        int sum1=0;
        int total_sum = 0;

        total_sum = n * (n+1) /2;

        for(int i =0;i<n;i++){
            sum1 += arr[i];
        }
        total_sum = total_sum - sum1;
    
    return total_sum;
    }
    public static void main(String[] args) {
        int[] arr = {3,0,1};

        MissingNumber obj = new MissingNumber();
        int missing = obj.misArrNum(arr);

        System.out.println("the output is:"+missing);

    }
}
