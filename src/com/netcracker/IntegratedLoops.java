package com.netcracker;

import java.util.Arrays;

/**
 * Created by Lizzi on 28.10.2016.
 */
public class IntegratedLoops {





    public void rectangle(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print('#');


            }
            System.out.println();
        }
    }

    public void triangle1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i<=j)
                {System.out.print('#');}


            }
            System.out.println();
        }
    }

    public void triangle2(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i>=j)
                {System.out.print('#');}


            }
            System.out.println();
        }
    }
    public void triangle3(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 if((j==0)||(i==0)||(i==n-1)||(j==n-1)||(i==j)||(i==n-j-1))
                {System.out.print('#');}
else System.out.print(" ");

            }
            System.out.println();
        }
    }

    public void triangle4(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i==0)||(i==n-1)||(i==j)||(i==n-j-1))
                {System.out.print('#');}
                else System.out.print(" ");

            }
            System.out.println();
        }
    }

    public void triangle5(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i==0)||(i==n-1)||(i==j))
                {System.out.print('#');}
                else System.out.print(" ");

            }
            System.out.println();
        }
    }

    public void triangle6(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i==0)||(i==n-1)||(i==n-j-1))
                {System.out.print('#');}
                else System.out.print(" ");

            }
            System.out.println();
        }
    }

    public void triangle7(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i==0)||(i==n-1)|| (j==0)||(j==n-1))
                {System.out.print('#');}
                else System.out.print(" ");

            }
            System.out.println();
        }
    }
    public void triangle8(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i>=j)
                {System.out.print(' ');}
                else System.out.print("#");

            }
            System.out.println();
        }
    }
    public void triangle9(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i>=n-j-1)
                {System.out.print('#');}
                else System.out.print(" ");

            }
            System.out.println();
        }
    }

}
