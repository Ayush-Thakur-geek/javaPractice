package com.thakur;

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class SpecialFibo
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner inp = new Scanner(System.in);
        int T = inp.nextInt();
        while(T >= 0)
        {
            int a = inp.nextInt(), b = inp.nextInt(), n = inp.nextInt();

            System.out.println(fibo(n, a, b));

            T--;
        }
    }
    public static int fibo(int n, int a, int b)
    {
        if(n == 0)
            return a;
        else if(n == 1)
            return b;
        else if (n == 2)
            return a^b;

        return fibo(n % 3, a, b);
    }
}
