package GeeksFORGeeks.BitwiseMagic;/*
Author : Ashutosh Kumar
Date : 28/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Tuesday
Description :
*/

public class MaximumANDValue
{
    // Utility function to check number of elements
    // having set msb as of pattern
    static int checkBit(int pattern, int arr[], int n)
    {
        int count = 0;

        // Checking every number and getting the count of numbers which have that bit set.
        for (int i = 0; i < n; i++)
            if ((pattern & arr[i]) == pattern)
                count++;
        return count;
    }

    // Function for finding maximum and value pair
    static int maxAND (int arr[], int n)
    {
        int res = 0, count,shiftingOneBit;
        // iterate over total of 30bits
        // from msb to lsb

        for (int bit = 31; bit >= 0; bit--)
        {
            shiftingOneBit = (1 << bit);
            // find the count of element
            // having set msb
            count = checkBit(res | shiftingOneBit, arr, n);

            // if count >= 2 set particular
            // bit in result
            if ( count >= 2 )
                res |= shiftingOneBit;
        }
        return res;
    }

    // driver function
    public static void main(String argc[])
    {
        int arr[] = {4, 8, 6, 2};
        int n = arr.length;
        System.out.println("Maximum AND Value = " +
                maxAND(arr, n));
    }
}
