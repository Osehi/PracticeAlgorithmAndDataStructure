package measuringtimecomplexity;

public class NestedLoops {
    public static void main(String[] args) {
        int n = 5; // 1 step
        int m = 7; // 1 step
        int sum = 0; // 1 step
        for (int i = 0; i < n; i++){ // n steps
            for (int j = 0; j < m; j++){ // n * n steps
                sum++; // n * n steps
            }
        }
        System.out.println(sum); // 2 steps
    }
}
