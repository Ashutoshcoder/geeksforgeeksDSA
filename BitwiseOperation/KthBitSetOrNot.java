package GeeksFORGeeks.BitwiseMagic;/*
Author : Ashutosh Kumar
Date : 27/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Monday
Description : To check if the kth bit is set in a number
*/

import java.util.Scanner;

public class KthBitSetOrNot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int number = sc.nextInt();

        System.out.println("Enter Bit To Check");
        int k = sc.nextInt();

        // Shifting 1 by k-1 bits and then doing "and" with number to check if it's 1 or not
        if((number & (1 << k-1)) != 0)
            System.out.println("Yes Kth bit is set");
        else
            System.out.println("No Kth bit is not set");
    }
}
