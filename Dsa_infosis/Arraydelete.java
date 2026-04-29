public class Arraydelete {
    public static void delete(char arr[],int pos){

        for(int i = pos-1;i<arr.length;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length] = '0';
        
    }
    public static void main(String[] args){
        char[] arr = {'A','B','J','C','D','E','F'};
        
        Arraydelete.delete(arr, 3);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
    }
}
