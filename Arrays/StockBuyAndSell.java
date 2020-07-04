package geeksforgeeksDSA.geeksforgeeksDSA.Arrays;/*
Author : Ashutosh Kumar
Date : 30/06/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,June,Tuesday
Description :
The cost of stock on each day is given in an array A[] of size N.
Find all the days on which you buy and sell the stock so that in between those days your profit is maximum.

Input:
First line contains number of test cases T.
First line of each test case contains an integer value N denoting the number of days,
followed by an array of stock prices of N days.

Output:
For each testcase, output all the days with profit in a single line.
And if there is no profit then print "No Profit".

User Task:
The task is to complete the function stockBuySell() which takes an array price[]
and N as a parameter and finds the days of buying and selling stock and print them.
The newline is automatically added by the driver code.

Expected Time Complexity : O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= T <= 100
2 <= N <= 103
0 <= Ai <= 104

Example
Input:
5
7
100 180 260 310 40 535 695
10
23 13 25 29 33 19 34 45 65 67
5
4 2 2 2 4
5
5 5 5 5 5
9
57 69 12 59 5 9 29 29 99

Output:
(0 3) (4 6)
(1 4) (5 9)
(3 4)
No Profit
(0 1) (2 3) (4 8)

Explanation:
Testcase 1: We can buy stock on day 0, and sell it on 3rd day, which will give us maximum profit. Now, we buy stock on day 4 and sell it on day 6.
Testcase 2: We can buy stock on day 1, and sell it on 4th day, which will give us maximum profit. Now, we buy stock on day 5 and sell it on day 9.
Testcase 3: We can buy stock on day 3, and sell it on 4th day, which will give us maximum profit.
Testcase 4: We cannot sell any stock that will give us profit as the price remains same.
Testcase 5: Buy on day 0 and sell on day 1. Then buy on day 2 and sell on day 3. Next, buy on day 4 and sell on day 8.

Note: Output format is as follows - (buy_day sell_day) (buy_day sell_day)
For each input, output should be in a single line.

*/

// { Driver Code Starts
import java.io.*;
import java.util.*;

class Interval {
    int buy;
    int sell;
}

class GFGs {

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

            Stock obj = new Stock();

            obj.stockBuySell(arr, n);
            System.out.println();
        }
    }
}
// } Driver Code Ends



class Stock{

    // Function to find the buy and sell days and print them
    static void stockBuySell(int price[], int n)
    {

        ArrayList<Interval> abc = new ArrayList<Interval>();

        // Your code here, if only 1 stock price is there
        if(n==1)
            return;

        //how many pairs of the stocks buy and sell can be done, count for those pairs
        int count=0;

        //traverse through the array
        int i=0;
        while(i<n)
        {
            //find local minima, and should run less than n-1, because we are comparing
            //with the next element
            //price of next element should be greater than current element to continue, unless we are
            //getting the greater element we keep moving ahead to find local minima
            while(i<n-1 && price[i+1]<=price[i])
                i++;

            //if we reach to the end then we understand that we need to sell
            //at last index now
            if(i==n-1)
                break;

            //because we are having pairs of element, type of Interval array for buy and sell
            Interval Interv = new Interval();
            //store the index of minima
            Interv.buy=i++;

            //similarly find local maxima,keep going until we get the current price greater than the
            //previous price
            while(i<n && price[i]>=price[i-1])
                i++;

            //store the index of minima
            Interv.sell=i-1;

            abc.add(Interv);
            count++;
        }

        //if there re no pairs for buy and sell
        if(count==0)
            System.out.print("No Profit");
        else
        {
            for(i=0;i<count;i++)
            {
                System.out.print("("+abc.get(i).buy+" "+abc.get(i).sell+") ");
            }
        }


    }

}



