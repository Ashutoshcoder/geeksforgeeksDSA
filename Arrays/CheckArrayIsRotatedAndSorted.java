package geeksforgeeksDSA.geeksforgeeksDSA.Arrays;

/*
Author : Ashutosh Kumar
Date : 02/07/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,July,Thursday
Description :
Given an array arr[] of N distinct integers, check if this array is Sorted
(non-increasing or non-decreasing) and Rotated counter-clockwise.
Note that input array may be sorted in either increasing or decreasing order, then rotated.
A sorted array is not considered as sorted and rotated, i.e., there should be at least one rotation.

Input:
The first line of input contains number of testcases T.
Each testcase contains 2 lines, the first line contains N,
the number of elements in array, and second line contains N space separated elements of array.

Output:
Print "Yes" if the given array is sorted and rotated, else Print "No", without Inverted commas.

User Task:
The task is to complete the function checkRotatedAndSorted() which checks if an array is sorted
and rotated clockwise.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= T <= 100
1 <= N <= 106
1 <= A[i] <= 106

Example:
Input:
5
4
3 4 1 2
3
1 2 3
4
10 20 30 14
5
30 20 10 50 35
5
30 20 10 50 25

Output:
Yes
No
No
Yes
No

Explanation:
Testcase 1: The array is sorted (1, 2, 3, 4) and rotated twice (3, 4, 1, 2).
Testcase 2: The array is sorted (1, 2, 3) is not rotated.
Testcase 3: The array is sorted (10, 20, 30, 14) is not sorted and rotated as 14 is greater than 10
*/

// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;


// } Driver Code Ends


class SortedRotated{

    // Function to check if array is sorted and rotated
    // arr[]: input array
    // num: size of array
    public static boolean checkRotatedAndSorted(int arr[], int num)
    {
        //if array is size is 0 or 1 then return false
        if(num==0 || num==1)
            return false;

        //if array size is 2, then after rotation also the differnce of max and min element position will
        //always be 1, so in this case it is always true
        if(num == 2)
            return true;

        // Your code here
        int miniI=0,maxI=0, miniE=arr[0], maxE=arr[0];

        //loop to get maximum element index, minimum element index
        for(int i=1;i<num;i++)
        {
            if(arr[i] < miniE)
            {
                miniE= arr[i];
                miniI = i;
            }
            //equal to in the case of the maximum element is repeated twice or more
            if(arr[i] >= maxE)
            {
                maxE=arr[i];
                maxI = i;
            }


        }

        // if minimum element is at 0th position or last index,
        // sorted but array is not rotated
        if((miniI == 0 && maxI == num-1) || (miniI == num-1 && maxI == 0))
            return false;

        //array is not sorted, if minimum and max are not together after rotation
        if(Math.abs(miniI-maxI) != 1)
            return false;

        //check for ascending order
        if(maxI < miniI)
        {
            //now move until you traverse through the whole array cirucularly
            int i = miniI;
            while(i != maxI)
            {
                //getting current element
                int current = arr[i];

                //determining next element, which is have we reached
                //the end of the array, then move to 0th position
                int next = ((i+1) == num)?arr[0]:arr[i+1];

                //if in any case we find that the array is not sorted then
                if(current > next)
                    return false;

                //incrementing i based on the condition
                i = ((i+1)==num)?0:(i+1);
            }
        }
        //check for descending order
        if(maxI > miniI)
        {
            int i = maxI;
            //moving circular to reach until mininum element
            while(i != miniI)
            {
                //getting current element
                int current = arr[i];

                //determining next element, which is have we reached
                //the end of the array, then move to 0th position for circular rotation
                int next = ((i+1) == num)?arr[0]:arr[i+1];

                //if we find that we have any break in the order then return false
                if(current < next)
                    return false;

                //incrementing i based on the condition
                i = ((i+1)==num)?0:(i+1);
            }
        }

        //if we are statisfied that all conditions are fulfilled then return true;
        return true;
    }



}




// { Driver Code Starts.

class Rotate {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine()); // input size of array
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split("\\s+");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
            }

            SortedRotated obj = new SortedRotated();

            if(!(obj.checkRotatedAndSorted(arr, n)))
                System.out.println("No"); // print the result
            else
                System.out.println("Yes");
        }
    }
}
// } Driver Code Ends
