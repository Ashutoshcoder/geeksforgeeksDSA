package GeeksFORGeeks.BitwiseMagic;/*
Author : Ashutosh Kumar
Date : 27/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Monday
Description : To Count no of set bits in a number
*/

import java.util.Scanner;

public class CountNoOfSetBits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Time complexity is O(set bits)
        System.out.println("Enter Number");
        int number = sc.nextInt(),count=0;

        // moving loop by every time setting one bit off
        // Right most bit is set off using the number "and" number-1 statement until number becomes 0
        while (number!=0)
        {
            number=(number & (number-1));
            count++;
        }
        System.out.println(count);
    }
}
