import java.util.Scanner;

class Array{
  // To find largest element of Array
    public int largestelement(int A[])
    {
        int large = A[0];
        for(int i =1;i<A.length;i++)
        {
            if(A[i]>large)
            {
                large = A[i];
            }
        }
        return large;
    }
    public int secondlargestelement(int A[])
    {
        int large = A[0];
        int slarge = Integer.MIN_VALUE;
        for(int i =1;i<A.length;i++)
        {
            if(A[i]>large)
            {
                slarge = large;
                large = A[i];
            }
            if(A[i]>slarge && A[i]<large)
            {
                slarge = A[i];
            }
        }
        return slarge;
    }
    public int removeduplicate(int A[])
    {
        int i =0;
        for(int j =1;j<A.length;j++)
        {
            if(A[j]!=A[i])
            {
                A[i+1] = A[j];
                i++;
            }
        }
        return i+1;
    }
}
 public class video1{
         public static void main(String args[])
         {
            Scanner sc = new Scanner(System.in);
            Array a = new Array();
            System.out.println("Enter the size of array");
            int n = sc.nextInt();
            int A[] = new int[n];
            System.out.println("Enter the elements of Array");
            for(int i =0;i<A.length;i++)
            {
                A[i] = sc.nextInt();
            }
            int m;
            int choice;
            do {
                  System.out.println("1.To find largest element in an Array\n2.To find secondlargest element in an Array\n3.To remove duplicates from Array\n4.To exit");
                  System.out.println("Enter your choice");
                  choice = sc.nextInt();
                  switch (choice) {
                    case 1:              
                            System.out.println("The largest element in a given array is "+a.largestelement(A));
                        break;
                    case 2:
                            System.out.println("The secondlargest element in a given array is "+a.secondlargestelement(A));
                            break;
                    case 3:
                          m= a.removeduplicate(A);
                           for(int i =0;i<m;i++)
                           {
                            System.out.println(A[i]);
                           }
                           break;
                    case 4:
                            break;
                    default:
                        break;
                  }
            } while (choice!=4);
         }
}
