import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class longksumsubarr {
   public static int longestsum(int nums[],int k){
         Map<Integer, Integer> map = new HashMap<>();
         int sum =0;
         int maxLen = 0;
         for(int i=0;i<nums.length;i++){
              sum+=nums[i];
              if(sum==k){
                maxLen = i+1;
              }
              if(map.containsKey(map.get(sum-k))){
                maxLen = Math.max(maxLen, i-map.get(sum-k));
              }

              if(!map.containsKey(map.get(sum))){
                map.put(sum, i); 
              }
         }
         return maxLen;
   }

   public static void main(String[] args) {
         int nums[] = {1, 2, 3, -2, 5}; // Example array
         int k = 5; // Target sum
         System.out.println("The length of the longest subarray with sum " + k + " is: " + longestsum(nums, k)); // Output the length of the longest subarray
   }
    
}