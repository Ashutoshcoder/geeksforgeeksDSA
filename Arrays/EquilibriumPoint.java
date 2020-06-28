package geeksforgeeksDSA.geeksforgeeksDSA.Arrays;

/*
Author : Ashutosh Kumar
Date : 28/06/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,June,Sunday
Description :
Given an array A of N positive numbers. The task is to find the first Equilibium Point in the array.
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Input:
The first line of input contains an integer T, denoting the number of test cases. Then T test cases follow. First line of each test case contains an integer N denoting the size of the array. Then in the next line are N space separated values of the array A.

Output:
For each test case in a new line print the index of the first Equilibrium Point. The output should be based on 1 based indexing. If no such point exists print -1.


*/

// { Driver Code Starts
import java.io.*;
import java.util.*;

class Equilibrium {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int t =
                Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            EquilibriumPoint obj = new EquilibriumPoint();

            System.out.println(obj.equilibriumPoint(arr, n));
        }
    }
}// } Driver Code Ends


class EquilibriumPoint {

    // Function to find equilibrium point
    // a: input array
    // n: size of array
    public static int equilibriumPoint(long arr[], int n)
    {

        // Your code here
        int leftsum=0,sum=0;

        //get total sum of the array
        for(int i=0;i<n;i++)
            sum+=arr[i];

        //then one by one subtract each element and check with left sum
        for(int i=0;i<n;i++)
        {
            //deducting from sum to consider it as a point
            sum-=arr[i];

            //check if leftsum == sum which means at that given point
            //and return as original index, not one with 0 but with 1
            if(leftsum==sum)
                return i+1;

            //as we move right, increment leftsum
            leftsum+=arr[i];
        }
        return -1;
    }
}

