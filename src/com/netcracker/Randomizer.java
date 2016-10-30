package com.netcracker;

import java.util.Random;

/**
 * Created by Lizzi on 29.10.2016.
 */
public class Randomizer {
    public static int randomiser(int n)
    {Random randomizer=new Random();

        return randomizer.nextInt(n);}
    public static int minusrandomiser(int n)
    {Random randomizer=new Random();

        return 2*randomizer.nextInt(n)-n;}

}
