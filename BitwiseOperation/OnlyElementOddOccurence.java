package GeeksFORGeeks.BitwiseMagic;/*
Author : Ashutosh Kumar
Date : 27/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Monday
Description :
Only element which occurs odd no times in the array
*/

public class OnlyElementOddOccurence
{
    public static void main(String[] args)
    {
        int[] arr ={3,3,5,6,7,8,4,4,5,6,8};
        int result = 0;

        //Doing XOR of each element and even elements will cancel out each other
        // Only Odd occurring number remains

        for (int i = 0; i < arr.length; i++)
            result = result ^ arr[i];

        System.out.println(result);

    }
}
