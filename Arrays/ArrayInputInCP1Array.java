package geeksforgeeksDSA.geeksforgeeksDSA.Arrays;/*
Author : Ashutosh Kumar
Date : 02/07/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,July,Thursday
Description :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFGsss {
    public static void main(String[] args) throws IOException
    {
        //code
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        //Inputting the testcases
        while (t-- > 0) {
            // input size of array
            int  inputSize = Integer.parseInt(br.readLine());

            int[] arr = new int[inputSize];
            String[] inputLine = br.readLine().trim().split("\\s+");
            for (int i = 0; i < inputSize; i++) {
                arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
            }

            OperationClass obj = new OperationClass();

            //call method

        }
    }
}


