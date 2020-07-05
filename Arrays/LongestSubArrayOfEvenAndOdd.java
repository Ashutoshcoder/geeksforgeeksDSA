package geeksforgeeksDSA.geeksforgeeksDSA.Arrays;

/*
Author : Ashutosh Kumar
Date : 01/07/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,July,Wednesday
Description :
You are given an array of size n. Find the maximum possible length of a subarray such that
 its elements are arranged alternately either as even and odd or odd and even .

Input Format:
The first line of input contains T denoting the number of testcases. T testcases follow.
 Each testcase contains two lines of input. The first line contains n.
 The second line contains the elements of the array.

Output Format:
For each testcase, in a new line, print the maximum length of the subarray.

Your Task:
This is a function problem. You don't need to take any input. Just complete the function maxEvenOdd()
that returns the maximum length.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= T <= 100
1 <= n <= 103
1 <= Ai <= 103

Example:
Input:
3
5
10 12 14 7 8
2
4 6
3
1 2 3

Output:
3
1
3

Example:
Testcase 1: The max length of subarray is 3 and the subarray is {14 7 8}.
Here the array starts as an even element and has odd and even elements alternately.
Testcase 2: The array contains {4 6}. So, we can only choose 1 element as that will be
the max length subarray.
Testcase 3: The subarray with max length 3 is {1 2 3}. It starts with an odd element and
has even and odd elements alternately.

*/

// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String str[] = read.readLine().trim().split(" ");
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);

            System.out.println(new LongSubOfEvenOdd().maxEvenOdd(arr, n));

        }
    }
}   // } Driver Code Ends


//User function Template for Java

// User class to complete
class LongSubOfEvenOdd
{
    // Complete the below function
    // arr[]: input array
    // n: size of array
    public static int maxEvenOdd(int arr[], int n)
    {
        // your code here
        int res=1;
        int current = 1;
        for(int i=1;i<n;i++)
        {
            if((arr[i]%2==0 && arr[i-1]%2==1) || (arr[i]%2==1 && arr[i-1]%2==0))
            {
                current++;
                res=Math.max(res,current);
            }
            else
                current = 1;

            //reset current for new subarray
            //Kadane algorithms for either you can start a new subarray
            //Or you can extend the previous subarray
        }
        return res;
    }
}
