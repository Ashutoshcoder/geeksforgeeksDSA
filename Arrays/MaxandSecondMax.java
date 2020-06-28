package geeksforgeeksDSA.geeksforgeeksDSA.Arrays;/*
Author : Ashutosh Kumar
Date : 27/06/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,June,Saturday
Description :
*/

// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
// } Driver Code Ends


// Solution class to implement function largestAndSecondLargest
class ArrayMax{

    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        int secondMax = -1, max= arr[0];
        for(int i=1;i<sizeOfArray;i++)
        {
            if(arr[i]>max)
            {
                secondMax = max;
                max=arr[i];
            }
            else if((arr[i]>secondMax) && (max!=arr[i]))
            {
                secondMax=arr[i];
            }
        }
        if(max==secondMax)
            secondMax = -1;

        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(max);
        res.add(secondMax);

        return res;
    }
}

// { Driver Code Starts.

// Driver class
class Arrays
{

    // Driver code
    public static void main (String[] args) throws IOException
    {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        // looping through all testcases
        while(testcases-- > 0){
            int sizeOfArray = Integer.parseInt(br.readLine());

            int arr[] = new int[sizeOfArray];

            String line = br.readLine();
            String[] elements = line.trim().split("\\s+");

            for(int index = 0;index < sizeOfArray; index++){
                arr[index] = Integer.parseInt(elements[index]);
            }

            ArrayMax obj = new ArrayMax();
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = obj.largestAndSecondLargest(sizeOfArray, arr);
            System.out.println(res.get(0) + " " + res.get(1) );
        }
    }
}  // } Driver Code Ends
