package GeeksFORGeeks.Recursion;/*
Author : Ashutosh Kumar
Date : 01/05/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,May,Friday
Description : Prints nth Fibonacci Element
*/

public class Fibonacci
{
    public static void main(String[] args)
    {
        System.out.println(fibo(5));
    }

    static int fibo(int n)
    {
        if(n==0)
            return 0;

        if(n==1)
            return 1;

        return fibo(n-1)+fibo(n-2);
    }
}
