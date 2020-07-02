package geeksforgeeksDSA.geeksforgeeksDSA.Arrays;
/*
Author : Ashutosh Kumar
Date : 27/06/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,June,Saturday
Description :
*/

// { Driver Code Starts
import java.io.*;
import java.util.*;


// } Driver Code Ends


class Reverse{

    // Function to reverse array in group of k
    public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> mv, int n, int k)
    {
        // add your code here
        int low=0,high=0,temp;
        for(low=0;low<n;low+=(k+1)/2)
        {
            high=Math.min(low+k-1,n-1);
            while(low<high)
            {
                temp=mv.get(low);
                mv.set(low,mv.get(high));
                mv.set(high,temp);
                low++;
                high--;
            }
        }
        return mv;
    }

}



// { Driver Code Starts.

class GFG {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            String inputLine1[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine1[0]);
            int k = Integer.parseInt(inputLine1[1]);

            ArrayList<Integer> mv = new ArrayList<>();

            String inputLine2[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                mv.add(Integer.parseInt(inputLine2[i]));
            }

            Reverse obj = new Reverse();

            mv = obj.reverseInGroups(mv, n, k);

            StringBuffer str = new StringBuffer();

            for(int i=0; i<n; i++){
                str.append(mv.get(i) + " ");
            }
            System.out.println(str);
        }
    }
}

// } Driver Code Ends
