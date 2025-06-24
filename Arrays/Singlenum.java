public class Singlenum{
    public static int singlenum(int nums[]) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation to find the single number
        }
        return result; // The single number is returned
    }
    public static void main(String[] args) {
        int nums[] = {4, 1, 2, 1, 2}; // Example array with a single number
        System.out.println("The single number is: " + singlenum(nums)); // Output the single number
    }
}
