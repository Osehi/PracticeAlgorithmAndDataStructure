

public class FindTheFirstNonRepeatingNumber {

    public static void main(String[] args) {
        int[] arr = {4,5,1,2,0,4};
        int result = findFirstUnique(arr);
        System.out.println(result);

    }

    public static int findFirstUnique(int[] arr)
    {
        int result = 0;
        // write your code here
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                result = arr[i];
                return result;
            } else {
                count = 0;
            }
        }
        return result;
    }
}
