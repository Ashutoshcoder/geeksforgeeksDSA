package GeeksFORGeeks.BitwiseMagic;/*
Author : Ashutosh Kumar
Date : 27/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Monday
Description : 2 numbers in Array are odd occurring
*/

public class TwoOddOccuringNumber
{
    public static void main(String[] args)
    {
        int[] arr ={3,3,4,6,7,8,4,4,5,4,8,7};

        // Two variables for 2 Odd Occurring numbers
        int result = 0,result2 =0,xor=0;

        //XOR of all elements of the array which leaves us with the xor of 2 odd occurring numbers
        for (int value : arr) xor = xor ^ value;

        // Getting the last set bit using the method
        // 1st turning the last set bit off using xor-1, and then negating it
        // Then again AND with original turns the only rightmost set bit on and therefore it is
        // the only set bit
        int lastSetBit = xor & (~(xor-1));

        for (int i = 0; i < arr.length; i++)
        {
            if((arr[i] & lastSetBit) !=0)
                result=result^arr[i];
            else
                result2=result2^arr[i];
        }

        System.out.println(result+" and "+result2);
    }
}
