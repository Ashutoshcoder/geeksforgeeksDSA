package geeksforgeeksDSA.geeksforgeeksDSA.Arrays;/*
Author : Ashutosh Kumar
Date : 27/06/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,June,Saturday
Description :
*/

// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


// } Driver Code Ends


class Difference{

    // Function to find minimum adjacent difference
    // arr[]: input array
    // n: size of array
    public static int minAdjDiff(int arr[], int n)
    {

        // Your code here
        int min=Math.abs(arr[1]-arr[0]),diff=0;

        for(int i=1;i<n;i++)
        {
            diff=Math.abs(arr[i-1]-arr[i]);
            if(diff<min)
                min=diff;
        }
        int finaldif=Math.abs(arr[n-1]-arr[0]);
        if(finaldif<min)
        {
            min=finaldif;
        }
        return min;
    }
}


// { Driver Code Starts.


class GFGGG {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases

        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i]=Integer.parseInt(inputLine[i]);
            }

            Difference obj = new Difference();

            System.out.println(obj.minAdjDiff(arr, n));
        }
    }
}
// } Driver Code Ends
