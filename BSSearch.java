public class BSSearch {
    public static void main(String args[]) {
        int[] numbers = {2,3,4,5,6,7,8,9,10,12,13,23,34,55,56,77,78,86,89,92,100,102,103,155,566,785,3466};
        System.out.println(findIndex(numbers, 103));
    }
    
    // 1. Find out if a target value exists in an array and print the index of it
    private static int findIndex(int[] numbers, int targetValue) {
        // Set low and high
        int low = 0, high = numbers.length - 1;
        // Loop until low is less than or equal to high
        while (low <= high) {
            // Find mid point
            int mid = (low + high)/2;
            // Check if value at midpoint is eual to target value
            if (numbers[mid] == targetValue) {
                return mid;
            // Reset low value if value at midpoint is less than target value
            } else if (numbers[mid] < targetValue) {
                low = mid + 1;
            // Reset high value if value at midpoint is higher than target value
            } else
            high = mid - 1;
        }
        // Return -1 in the event the target value does not exist in the input provided
        return -1;
    }
}
