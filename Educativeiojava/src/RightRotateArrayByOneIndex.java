

public class RightRotateArrayByOneIndex {
    public static void main(String[] args) {
        int[] scores = {1,2,3,4,5,6};
        int startRotate = 0;
        int numberOfRotate = 1;
        while (startRotate < numberOfRotate){
            for (int i = scores.length - 1; i > 0; i--){
                if (i > 0){
//                    int score = scores[i ];
//                    int assignScore = scores[i + 1];
                    scores[i] = scores[i - 1];
                } else if (i == 0){
//                    int score = scores[i - (scores.length - 1)];
                    scores[i] = scores[scores.length - 1];
                }
            }

            startRotate++;
        }
        System.out.println(arrayToString(scores));
    }

    public static String arrayToString(int arr[]){
        if (arr.length > 0){
            String result = "";
            for(int i = 0; i < arr.length; i++) {
                result += arr[i] + " ";
            }
            return result;
        }
        else {
            return "Empty Array!";
        }
    }
}
