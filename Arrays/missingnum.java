// Time Complexity: O(n)
public class missingnum {
  
  public static int missingnum(int nums[]){
    int n = nums.length;
    int total = n * (n + 1) / 2; // Sum of first n natural numbers
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += nums[i]; // Calculate the sum of the array elements
    }           
    return total - sum; // The missing number is the difference between the total and the sum
  }
  public static void main(String[] args) {
    int nums[] = {0, 1, 2, 3, 5}; // Example array with a missing number
    System.out.println("The missing number is: " + missingnum(nums)); // Output the missing number
  }
    
}