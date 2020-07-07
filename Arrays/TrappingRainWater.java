package geeksforgeeksDSA.geeksforgeeksDSA.Arrays;/*
Author : Ashutosh Kumar
Date : 29/06/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,June,Monday
Description :
Given an array arr[] of N non-negative integers representing the height of
blocks at index i as Ai where the width of each block is 1.
Compute how much water can be trapped in between blocks after raining.
The structure is like below:
|  |
|_|
We can trap 2 units of water in the middle gap.



Input:
The first line of input contains an integer T denoting the number of test cases.
The description of T test cases follows. Each test case contains an integer N denoting
the size of the array, followed by N space-separated numbers to be stored in the array.

Output:
Output the total unit of water trapped in between the blocks.

User Task:
The task is to complete the function trappingWater() which returns the total amount of
water that can be trapped.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= T <= 100
3 <= N <= 107
0 <= Ai <= 108

Example:
Input:
2
4
7 4 0 9
3
6 9 9

Output:
10
0

Explanation:
Testcase 1: Water trapped by the block of height 4 is 3 units,
block of height 0 is 7 units. So, the total unit of water trapped is 10 units.

*/

// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Arrayz {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Trap obj = new Trap();

            System.out.println(obj.trappingWater(arr, n));
        }
    }
}

// } Driver Code Ends


class Trap{

    // function to find the trapped water in between buildings
    // arr: input array
    // n: size of array
    static int trappingWater(int arr[], int n)
    {

        // Your code here
        //creating precomputed array for each of the left and right side bar
        int left[] = new int[n];
        int right[] = new int[n];

        left[0]=arr[0];
        for(int i=1;i<n;i++)
            left[i]=Math.max(arr[i],left[i-1]);

        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
            right[i]=Math.max(arr[i],right[i+1]);

        //calculating maximum water that can be stored
        int res=0;
        //leaving 1st and last bar because they can't trap water
        for(int i=1;i<n-1;i++)
            res+=Math.min(left[i],right[i]) - arr[i];

        return res;
    }
}

