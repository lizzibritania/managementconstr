package com.netcracker;

/**
 * Created by Lizzi on 28.10.2016.
 */
public class Factorial {


    public static int factorialLoop(int n)
    { int factorial=1;
        for (int i=1;i<n+1;i++)
    {
        factorial*=i;
    }
        return factorial;

    }
    public static int factorialRecursion(int n)
    {     int factorial;

        if (n == 1)
            return 1;
        factorial = factorialRecursion(n - 1) * n;
        return factorial;
    }



}

