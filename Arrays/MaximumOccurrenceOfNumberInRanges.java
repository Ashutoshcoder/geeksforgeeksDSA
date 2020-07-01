package geeksforgeeksDSA.geeksforgeeksDSA.Arrays;// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class ArrayOccur {

    public static void main (String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int L[] = new int[n];
            int R[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                L[i]=Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int maxx = Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
                R[i]=Integer.parseInt(inputLine[i]);
                if(R[i] > maxx){
                    maxx=R[i];
                }
            }

            MaxOccur obj = new MaxOccur();

            System.out.println(obj.maxOccured(L, R, n, maxx));
        }
    }

}



// } Driver Code Ends


// L[] and R[] are input ranges
// n : size of array
// maxx: maximum element in R[]
// arr[]: declared globally with size equal to 1000000
class MaxOccur{

    public static int maxOccured(int L[], int R[], int n, int maxx)
    {
        int arr[]=new int[maxx+2];

        //intialize with 0
        for(int i=0;i<arr.length;i++)
            arr[i]=0;

        //Have elements update themselves according to the range
        int i=0;
        for(i=0;i<n;i++)
        {

            arr[L[i]]++;
            arr[R[i]+1]--;
        }

        //calculate pre-sum
        int maxi=arr[0],res=0;
        for(i=1;i<arr.length;i++)
        {
            arr[i]+=arr[i-1];

            //get index of the maximum occuring element
            if(arr[i]>maxi)
            {
                maxi=arr[i];
                res=i;
            }
        }
        return res;
    }

}

// { Driver Code Starts.
// } Driver Code Ends