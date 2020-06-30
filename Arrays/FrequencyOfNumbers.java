package geeksforgeeksDSA.geeksforgeeksDSA.Arrays;/*
Author : Ashutosh Kumar
Date : 27/06/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,June,Saturday
Description :

Given an array A[] of N positive integers which can contain integers from 1 to N where elements can be repeated or can be absent from the array. Your task is to count the frequency of all elements from 1 to N.

Input :
The first line of input contains an integer T denoting the number of test cases. For each test case, the first line contains an integer N denoting the size of the array. The second line contains N space-separated integers denoting the elements of the array.

Output :
For each test case, output N space-separated integers denoting the frequency of each element from 1 to N.


*/

// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFGggg {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");

            for(int i=0; i<n; i++){
                arr[i]=Integer.parseInt(inputLine[i]);
            }

            Frequency obj = new Frequency();
            obj.frequencycount(arr, n);

            for(int i=0; i<n; i++)
                System.out.print(arr[i] + " " );
            System.out.println();
        }
    }
}



// } Driver Code Ends


class Frequency{
    public static void frequencycount(int arr[], int n)
    {
        // code here
        int count=1;
        for(int i=0;i<n;i++)
        {
            arr[i]-=1;
            arr[arr[i]%n]+=n;
        }
        for(int i=0;i<n;i++)
            arr[i]/=n;
    }
}

