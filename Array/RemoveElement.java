class RemoveElememt{
    public static int array(int arr[],int val){

        int k = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != val ){
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int val = 2;
        int[] arr = {1,2,3,4,5,6};
        int newlength = array(arr,val);

        System.out.println("the element removed and remaing length is:"+ newlength);

        System.out.println("the new array:");
        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i] +" ");
    }
}