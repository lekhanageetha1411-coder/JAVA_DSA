class OddNumDigit{
    public int FindDisappear(int[] nums){
        int count = 0;
        for(int num : nums){
            int digit = 0;

            while(num > 0){
            num = num / 10;
            digit++;
            }
            if(digit % 2 != 0){
                count++;
            }
        }
        return count;
        
    }
    public static void main(String[] args){
        int[] nums = {12,345,2,6,7896};
        EvenNumDigit obj = new EvenNumDigit();

        System.out.println("output:"+obj.FindDisappear(nums));
    }
    
}