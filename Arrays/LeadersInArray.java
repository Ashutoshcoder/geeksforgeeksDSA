package geeksforgeeksDSA.geeksforgeeksDSA.Arrays;/*
Author : Ashutosh Kumar
Date : 28/06/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,June,Sunday
Description :
Given an array A of positive integers. Your task is to find the leaders in the array.

Note: An element of array is leader if it is greater than or equal to all the elements to its right side.
Also, the rightmost element is always a leader.

Input:
The first line of input contains an integer T denoting the number of test cases.
The description of T test cases follows.
The first line of each test case contains a single integer N denoting the size of array.
The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
For each testcase, in a new line, the leaders will be printed.

User Task:
The task is to complete the function leader() which returns an array of leaders in same order
as they appear in the array. The printing is automatically done by driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= T <= 100
1 <= N <= 107
0 <= Ai <= 107

Example:
Input:
4
6
16 17 4 3 5 2
5
1 2 3 4 0
5
7 4 5 7 3
3
4 1 4

Output:
17 5 2
4 0
7 7 3
4 4

*/

// { Driver Code Starts
import java.io.*;
import java.util.*;

class Arraysss {

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

            Leader obj = new Leader();

            StringBuffer str = new StringBuffer();
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = obj.leaders(arr, n);

            for(int i=0; i<res.size(); i++){
                str.append(res.get(i)+" ");
            }
            System.out.println(str);
        }

    }
}
// } Driver Code Ends


class Leader{

    // This functions find the leaders in the array and returns
    // arraylist containing the leaders
    // arr: input array
    // n: size of array
    static ArrayList<Integer> leaders(int arr[], int n){

        // Your code here


        /******************
         * You just need to complete this
         * function and return the vector
         * containing the leaders.
         * ***************/

        ArrayList<Integer> leaders = new ArrayList<Integer>();
        leaders.add(arr[n-1]);
        int current_leader = arr[n-1];

        for(int i=n-2;i>-1;i--)
        {
            if(arr[i]>=current_leader)
            {
                leaders.add(arr[i]);
                current_leader = arr[i];
            }
        }

        Collections.reverse(leaders);

        return leaders;
    }

}

