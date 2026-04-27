public class maxConsecutiveZeros {
    public static void main(String[] args){
        int[] nums = {1,1,0,0,0,1,1,0,0,0,0};
        int count = 0;
        int max_count = 0;

        for(int num : nums){

            if(num == 0){
                count++;
                if(count > max_count){
                    max_count = count;

                }
            }else{
                count = 0;
            }
        }
        System.out.println(max_count);
    }
}
    

