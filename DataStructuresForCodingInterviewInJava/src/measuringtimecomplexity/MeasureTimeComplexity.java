package measuringtimecomplexity;

public class MeasureTimeComplexity {
    public static void main(String[] args) {
        /**
         * Assignment: - calculate the time it takes to carryout this a loop of n-iterations.
         * How will I do this? By looking for the number of operations in the algorithm
         * Expected answer: - 9n + 8
         */

        int n = 10; // 1 operation => assigning values to variables
        int sum = 0; // 1 operation => assigning values to variables
        /**
         * in the forloop,
         * There are three(3) variables here, with different operations
         * a. Initialization, int i = 0,
         * number of operations here is 1 - it happens once - assigning value to a variable
         * // the question I have about the initialization is "does the initialization take place
         * all the time.
         * b. i < n
         *  the operations here are:
         *  1. reading from the variable i. ( accessing)
         *  2. reading from n  (accessing)
         *  3. comparing the two values
         *  These 3-operations takes place repeatedly. => for (n + 1) times
         *  So the number of times will be => 3 * (n + 1)
         *  c. sum += 1
         *  the operations here are:
         *  1. assigning the outcome of ( sum + 1) ( updating)
         *  2. performing an addition operation  (addition or adding one )
         *  3. accessing the values in the variable.
         *  ** How many times will it perform these tasks?
         *  that will be n-times ==> n * 3 = 3n.
         *  d. System.out.println(sum)
         *  the operations here are:
         *  1. reading from the variable "sum".
         *  2. display from the variable "sum".
         *  ** How many times will the task be performed?
         *  that will be n-times ==> n * 2 = 2n
         *
         *  e. i++
         *  the operations are:
         *  1. reading from the variable.
         *  2. perform an addition operation
         *  3. it stores the result back to the variable
         *  ** how many times it does this? n-times, i.e => n * 3 => 3n
         *
         *  Now do the summation of everything.
         *  1+1+1+3(n+1)+3n+3n+2 = 3+3n+3+6n+2 = 8+9n
         */
        for(int i = 0; i < n; i++){
            sum += 1;
        }
        System.out.println(sum);

    }
}

