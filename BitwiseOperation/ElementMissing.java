package GeeksFORGeeks.BitwiseMagic;/*
Author : Ashutosh Kumar
Date : 27/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Monday
Description :
Missing element in the array from [1,n+1]

*/

public class ElementMissing
{
    public static void main(String[] args)
    {
        int[] arr ={1,3,5,2};
        int result = 0;

        // XOR of all number from 1 to n+1
        for (int i = 1; i < 6; i++)
            result=result^i;

        // Now xor with array so the missing number will appear
        // Because rest of the elements will appear twice

        for (int i = 0; i < arr.length; i++)
            result=result^arr[i];

        System.out.println(result);

    }
}
