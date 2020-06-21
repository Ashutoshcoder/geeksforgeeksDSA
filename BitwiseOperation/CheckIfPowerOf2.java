package GeeksFORGeeks.BitwiseMagic;/*
Author : Ashutosh Kumar
Date : 27/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Monday
Description :
*/

import java.util.Scanner;

public class CheckIfPowerOf2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Time complexity is O(set bits)
        System.out.println("Enter Number");
        int number = sc.nextInt();

        // Power of 2 values have only 1 bit set and if that is switched off then number becomes 0
        if((number&(number-1)) == 0)
            System.out.println("Power of 2");
        else
            System.out.println("Not a Power of 2");

    }
}
