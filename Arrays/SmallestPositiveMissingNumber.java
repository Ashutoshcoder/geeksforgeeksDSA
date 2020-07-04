package geeksforgeeksDSA.geeksforgeeksDSA.Arrays;/*
Author : Ashutosh Kumar
Date : 29/06/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,June,Monday
Description :
You are given an array arr[] of N integers including 0.
The task is to find the smallest positive number missing from the array.
Note: Expected solution in O(n) time using constant extra space
(don't use hash maps or sorting algorithms in your solution).

Input:
First line consists of T test cases. First line of every test case consists of N,
denoting the number of elements in array. Second line of every test case consists of elements in array.

Output:
Single line output, print the smallest positive number missing.

User Task:
The task is to complete the function missingNumber() which returns the smallest
positive missing number in the array.

Constraints:
1 <= T <= 100
1 <= N <= 106
-106 <= arr[i] <= 106

Example:
Input:
2
5
1 2 3 4 5
5
0 -10 1 3 -20
Output:
6
2

Explanation:
Testcase 1: Smallest positive missing number is 6.
Testcase 2: Smallest positive missing number is 2.
*/

// { Driver Code Starts
import java.util.*;


// } Driver Code Ends


class Missing{

    // function to find first positive missing number
    static int missingNumber(int arr[], int size)
    {

        // Your code here
        // You can add utility functions (if required)

        //phase 1 :
        //check if 1 exists or not, if it does not exist straight away return that
        boolean oneExists = false;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==1)
                oneExists= true;
        }
        // if one does not exists then it is the smallest number missing
        if(!(oneExists))
            return 1;

        // preprocessing array which means converting all the values
        // which are > than the size are actually hindering
        // that number which is absent due to their presence
        // or a negative number is taking that place which should be the positive number
        // so we need to find that index actually
        for(int i=0;i<size;i++)
        {
            if(arr[i]<=0 || arr[i]>size)
                arr[i]=1;
        }

        //phase 2 : At this point, we don't have any negative number, large number, no zero
        //Now we are invalidating all the indexes which are present in the array
        for(int i=0;i<size;i++)
        {
            int index=Math.abs(arr[i]);
            //The reason to take Math.abs is because if same number is to be invalidated
            // again and again then -ve and -ve will make +ve, so absolute is important
            if(index==size)
                arr[0] = (-1)*(Math.abs(arr[0]));
            else
                arr[index] = (-1)*(Math.abs(arr[index]));

            //handling edge case of n when there is an element which is n > size so we are
            // invalidating 0th position since 0 is already removed
        }

        //Now returning the element which is missing using invalidation technique and index
        for(int i=1;i<size;i++)
        {
            if(arr[i]>0)
                return i;
        }

        //for last element
        if(arr[0]>0)
            return size;

        //if all conditions fail that means it has all positive numbers in ascending order

        return size+1;


    }

}


// { Driver Code Starts.

class Main
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            Missing obj = new Missing();
            int missing = obj.missingNumber(arr,n);
            System.out.println(missing);
        }
    }
}

// } Driver Code Ends
