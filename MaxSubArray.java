public class MaxSubArray {

    // this is brute force method which time complexity is bad

    // public static void printMaxSubArray(int numbers[]) {
    // int currSum = 0;
    // int maxSum = Integer.MIN_VALUE;
    // for (int i = 0; i < numbers.length; i++) {
    // int start = i;
    // for (int j = i; j < numbers.length; j++) {
    // int end = j;
    // for (int k = start; k <= end; k++) {
    // currSum = +numbers[k];
    // }
    // System.out.println(currSum);
    // if (maxSum < currSum) {
    // maxSum = currSum;
    // }
    // }

    // }
    // System.out.println("max sum = " + maxSum);
    // }

    // By Prefix method

    // public static void printMaxSubArray(int numbers[]) {
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     int prefix[] = new int[numbers.length];
    //     prefix[0] = numbers[0];

    //     // calculate prefix sum
    //     for (int i = 1; i < prefix.length; i++) {
    //         prefix[i] = numbers[i - 1] + numbers[i];
    //     }
    //     for (int i = 0; i < numbers.length; i++) {
    //         int start = i;
    //         for (int j = i; j < numbers.length; j++) {
    //             int end = j;
    //             currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

    //             if (maxSum < currSum) {
    //                 maxSum = currSum;
    //             }
    //         }

    //     }
    //     System.out.println("max sum = " + maxSum);

    // }

    // Kedans Algorithm 

    public static void kedans(int numbers[]){
        int ms= Integer.MIN_VALUE;
        int cs=0;
        for(int i = 0; i<numbers.length; i++){
            cs = cs+numbers[i];
            if (cs<0) {
                cs=0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our maximum sub Array is : " + ms);
    }

    public static void main(String[] args) {
        // int numbers[] = { 1, -2, 6, -1, 3 };
        // printMaxSubArray(numbers);

        // Kedand algorithm numbers

        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kedans(numbers);

    }
}
