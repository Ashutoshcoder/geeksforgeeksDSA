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

class GFGss {
    public static void main(String[] args) throws IOException {
        //code
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while (t-- > 0) {
            // input size of array
            String[] inputSize = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inputSize[0]);

            int[] arr = new int[n];
            String[] inputLine = br.readLine().trim().split("\\s+");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
            }

            // input elements of array
            int num = Integer.parseInt(inputSize[1]);
            int[] arr2 = new int[num];
            String[] inputLine2 = br.readLine().trim().split("\\s+");
            for (int i = 0; i < num; i++)
                arr2[i] = Integer.parseInt(inputLine2[i]);

            OperationClass obj = new OperationClass();

            //call method

        }
    }
}

class OperationClass {

}
