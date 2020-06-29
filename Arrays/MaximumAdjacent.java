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


//User function Template for Java

// Solution class to implement function largestAndSecondLargest
class StrongestNeighbour{

    // Function to find maximum of all adjacents
    static void maximumAdjacent(int sizeOfArray, int arr[])
    {

        /*********************************
         * Your code here
         * Function should print max adjacents for all pairs
         * Use string buffer for fast output
         * ***********************************/
        for(int i=0;i<sizeOfArray-1;i++)
        {
            System.out.print(Math.max(arr[i],arr[i+1])+" ");
        }


    }
}




// { Driver Code Starts.

// Driver class
class Arrayss {

    // Driver code
    public static void main (String[] args) throws IOException{
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

            StrongestNeighbour obj = new StrongestNeighbour();
            obj.maximumAdjacent(sizeOfArray, arr);

            System.out.println();
        }
    }
}


// } Driver Code Ends
