package geeksforgeeksDSA.geeksforgeeksDSA.Arrays;/*
Author : Ashutosh Kumar
Date : 25/06/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,June,Thursday
Description :
*/

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Array {

    public static void main (String[] args) {

        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0)
        {
            int sizeOfArray=sc.nextInt();
            int arr[]=new int[sizeOfArray];

            for(int i=0;i<sizeOfArray-1;i++)
            {
                int x;
                x=sc.nextInt();
                arr[i]=x;
            }

            int index=sc.nextInt();
            int element=sc.nextInt();

            Insert obj=new Insert();
            obj.insertAtIndex(arr,sizeOfArray,index,element);

            for(int i=0;i<sizeOfArray;i++)
            {
                System.out.print(arr[i]+" ");

            }

            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

//Complete this function, Geeks
class Insert
{
    // You need to insert the given element at the given index.
    // After inserting the elements at index, elements
    // from index onward should be shifted one position ahead
    // You may assume that the array already has sizeOfArray - 1
    // elements.
    public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        //Your code here, Geeks
        for(int i=sizeOfArray-2;i>=index;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[index]=element;
    }
}