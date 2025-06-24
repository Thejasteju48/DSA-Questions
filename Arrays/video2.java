import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class video2 {
    //Left rotate array by one place
    public static int[] leftrotate1(int arr[])
    {
        int val = arr[0];
        int i;
        for( i=0;i<arr.length-1;i++)
        {
            arr[i] = arr[i+1];
        }
        arr[i] = val;
        return arr;
    }

    //Left rotate array by Dth place
    //Brute force
    public static int[] leftrotateD(int arr[],int d)
    {
        d = d%arr.length;
        int temp[] = new int[d];
        for(int i=0;i<d;i++)
        {
            temp[i] = arr[i];
        }
        int i;
        for(i=d;i<arr.length;i++)
        {
            arr[i-d]= arr[i];
        }
        int j=0;
        for(i=arr.length-d;i<arr.length;i++){
            arr[i] = temp[j];//temp[i-(n-d)]
            j++;
        }
        return arr;
    }

    //Optimal solution
    public static int[] leftrotateopt(int []arr,int d)
    {
        d = d%arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
        return arr;
    }
    public static int[] reverse(int arr[],int low,int high)
    {
         while (low<=high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
         }
         return arr;
    }

    //Move all zeroes to end of array
    //Brute force
    public static int []movezero(int arr[])
    {
        int temp[] = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                temp[j++] = arr[i];
            }
        }
        for(int i=0;i<j;i++)
        {
            arr[i] = temp[i];
        }
        for(int i =j;i<arr.length;i++)
        {
            arr[i] =0;
        }
        return arr;

    }
    
    //Optimal solution
    public static int[] movezeroend(int arr[])
    {
        int j=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                j = i;
                break;
            }
        }
        for(int i=j+1;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }

    //Union of two sorted arrays
    //Brute force approach
    public static int[] union(int arr1[],int arr2[])
    {
        Set<Integer> st = new HashSet<Integer>();
        for(int i=0;i<arr1.length;i++)
        {
            st.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            st.add(arr2[i]);
        }
        int Union[] = new int[st.size()];
        int i =0;
        for(int val:st)
        {
            Union[i++] = val;
        }
        return Union;
    }
    //Optimal solution
    public static List<Integer> union2(int arr1[],int arr2[])
    {
        List<Integer> result = new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                if(result.isEmpty()||result.get(result.size()-1)!=arr1[i])
                {
                    result.add(arr1[i]);
                }
                i++;
            }
            else if(arr2[j]<arr1[i])
            {
                    if(result.isEmpty()||result.get(result.size()-1)!=arr2[j])
                    {
                        result.add(arr2[j]);
                    }
                j++;
            }
                else{
                if(result.isEmpty()||result.get(result.size()-1)!=arr1[i])
                {
                    result.add(arr1[i]);
                }
                i++;j++;
                }
        }
            while (i < arr1.length) {
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
            }
            while (j < arr2.length) {
                if (result.isEmpty() || result.get(result.size() - 1) != arr2[j]) {
                    result.add(arr2[j]);
                }
                j++;
            }
         return result;   
        }
        public static List<Integer> intersection1(int a[],int b[])
        {
            List<Integer> list = new ArrayList<>();
            int visited[] = new int[b.length];
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<b.length;i++)
                {
                    if(a[i]==b[j] && visited[j]==0)
                    {
                        list.add(a[i]);
                        visited[j] = 1;
                        break;
                    }
                    else if(b[j]>a[i])
                    {
                        break;
                    }
                }
            }
            return list;
        }
       
         //Optimal solution
            // Function to find the intersection of two sorted arrays
         public static List<Integer> intersection(int[] arr1, int[] arr2) {
                List<Integer> result = new ArrayList<>();
                int i = 0, j = 0;
        
                // Traverse both arrays
                while (i < arr1.length && j < arr2.length) {
                    // If elements are equal, add to result and move both pointers
                    if (arr1[i] == arr2[j]) {
                        // Avoid duplicates in the result
                        if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                            result.add(arr1[i]);
                        }
                        i++;
                        j++;
                    }
                    // If arr1 element is smaller, move i
                    else if (arr1[i] < arr2[j]) {
                        i++;
                    }
                    // If arr2 element is smaller, move j
                    else {
                        j++;
                    }
                }
        
                return result;
            }
    public static void main(String args[])
    {
       // int arr[] ={1,0,2,3,2,0,0,4,5,1};
        //leftrotate(arr);
       // leftrotateD(arr, 2);
       //leftrotateopt(arr,10);
         //movezero(arr);
         //movezeroend(arr);
         int arr1[] = {1,1,2,3,4,5};
         int arr2[] = {2,3,4,4,5,6};
         /*int arr[] = union(arr1, arr2);
    
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }*/
        //List<Integer> list =  union2(arr1, arr2);
        //List<Integer> list = intersection1(arr1, arr2);
        List<Integer> list = intersection(arr1, arr2);
        for (int num : list) {
            System.out.print(num + " ");
        }
    }

}
