package geeksforgeeksDSA.geeksforgeeksDSA.Arrays;/*
Author : Ashutosh Kumar
Date : 28/06/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,June,Sunday
Description :
Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively
i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.

Note: O(1) extra space is allowed. Also, try to modify the input array as required.

Input:
First line of input contains number of test cases T. First line of test case contain an integer denoting the array size N
and second line of test case contain N space separated integers denoting the array elements.

Output:
For each testcase, in a new line, Output the modified array with alternated elements.

User Task:
The task is to complete the function rearrange() which rearranges elements and shouldn't print anything.
 Printing of the modified array will be handled by driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= T <= 100
1 <= N <= 107
1 <= arr[i] <= 107

Example:
Input:
2
6
1 2 3 4 5 6
11
10 20 30 40 50 60 70 80 90 100 110

Output:
6 1 5 2 4 3
110 10 100 20 90 30 80 40 70 50 60

Explanation:
Testcase 1: Max element = 6, min = 1, second max = 5, second min = 2, and so on... Modified array is : 6 1 5 2 4 3.
Testcase 2: Max element = 110, min = 10, second max = 100, second min = 20, and so on... Modified array is : 110 10 100 20 90 30 80 40 70 50 60.

*/

// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Rearrange {
    public static void main (String[] args)throws IOException
    {

// 		Scanner in = new Scanner(System.in);

// 		int t = in.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());


        while(t-- >0)
        {
            int n = Integer.parseInt(read.readLine());
            int[] temp= new int[n];

            String str[] = read.readLine().trim().split(" ");
            for(int i=0;i<n;i++)
                temp[i] = Integer.parseInt(str[i]);

            // StringBuffer sb = new StringBuffer();

            RearrangeAlternate obj = new RearrangeAlternate();

            obj.rearrange(temp, n);
            StringBuffer sb = new StringBuffer();
            for(int i =0; i < n; i++)
                sb.append(temp[i] + " ");
            System.out.println(sb);
        }
    }
}



// } Driver Code Ends


class RearrangeAlternate{

    // This function wants you to rearrange the temp array as required
    // and returns a StringBuffer with all elements of modified temp array
    // appended to it.
    // temp: input array
    // n: size of array
    public static void rearrange(int arr[], int n)
    {

        // Your code here
        int maxelement = arr[n-1]+1;
        int minIndex = 0, maxIndex = n-1;

        int i=0;
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            {
                arr[i]=arr[i]+((arr[maxIndex]%maxelement)*maxelement);
                maxIndex--;
            }
            else
            {
                arr[i]=arr[i]+((arr[minIndex]%maxelement)*maxelement);
                minIndex++;
            }
        }
        for(i=0;i<n;i++)
        {
            arr[i]/=maxelement;
        }
    }
}
