package geeksforgeeksDSA.geeksforgeeksDSA.Arrays;/*
Author : Ashutosh Kumar
Date : 01/07/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,July,Wednesday
Description :
Given an array arr[] of N integers arranged in a circular fashion.
Your task is to find the maximum contiguous subarray sum.

Input:
The first line of input contains a single integer T which denotes the number of test cases.
The first line of each test case contains a single integer N which denotes the total number of elements.
The second line of each test case contains N space-separated integers denoting the elements of the array.

Output:
For each test case print the maximum sum obtained by adding the consecutive elements.

User Task:
the task is to complete the function circularSubarraySum() which finds the circular subarray with maximum sum.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= T <= 101
1 <= N <= 106
-106 <= Arr[i] <= 106

Example:
Input:
3
7
8 -8 9 -9 10 -11 12
8
10 -3 -4 7 6 5 -4 -1
8
-1 40 -14 7 6 5 -4 -1

Output:
22
23
52

Explanation:
Testcase 1: Starting from the last element of the array, i.e, 12, and moving in a circular fashion,
we have max subarray as 12, 8, -8, 9, -9, 10, which gives maximum sum as 22.

*/

// { Driver Code Starts
import java.io.*;
import java.util.*;

class Arrayx {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());// input size of array
            int arr[] = new int[n];
            String inputLine2[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
            }

            Kadane obj = new Kadane();

            System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
        }
    }
}


// } Driver Code Ends


class Kadane{

    // Function to find circular subarray with maximum sum
    // a: input array
    // n: size of array
    static int circularSubarraySum(int arr[], int n)
    {

        // Your code here

        int normalMaxSum = kadane(arr,n);

        //if normalMaxsum < 0 which means that we have all the elements as -ve
        //which means that gives us the circular sum

        if(normalMaxSum <0)
            return normalMaxSum;

        int totalSum = 0;

        for(int i=0;i<n;i++)
        {
            totalSum+=arr[i];
            arr[i]=-arr[i];
        }

        //instead of creating a separate function we can use the kadane approach
        //for finding the minimum sum subarray by negating each element

        // To find the circular sum subarray we need to find the total sum and subtract
        // minimum sum subarray from the total, so we negate the elements and add it to total sum

        int circularMaxSum = totalSum + kadane(arr,n);

        return Integer.max(normalMaxSum,circularMaxSum);
    }

    static int kadane(int arr[], int n)
    {
        int maxSum = arr[0];
        int res = arr[0];

        for(int i=1;i<n;i++)
        {
            maxSum = (maxSum+arr[i])>arr[i]?(maxSum+arr[i]):arr[i];
            res = res>maxSum?res:maxSum;
        }

        return res;
    }
}

