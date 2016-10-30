package com.netcracker;

import java.util.Arrays;

import java.util.Random;

/**
 * Created by Lizzi on 28.10.2016.
 */
public class Maintest {
    public static void main(String[] args) {
SortingClass example=new SortingClass(5,3,3,2,2,2,3,4,4,3,234,3,2,3,2,3,2,4,43,23,4,3,2,3,4,2,3,4,2,3,4,2,4);
        long startTime=System.nanoTime();
        example.bubbleSort();
        long estimatedtime=System.nanoTime()-startTime;
        System.out.println("Время выполнения ( метод пузырька) = "+estimatedtime);

         startTime=System.nanoTime();
        example.selectionSort();
        estimatedtime=System.nanoTime()-startTime;
        System.out.println("Время выполнения ( метод выбора) = "+estimatedtime);

         startTime=System.nanoTime();
        example.methodArraySort();
         estimatedtime=System.nanoTime()-startTime;
        System.out.println("Время выполнения ( метод Arrays.sort()) = "+estimatedtime);
        Factorial factorial=new Factorial();
        startTime=System.nanoTime();
        int b=factorial.factorialLoop(10);
        estimatedtime=System.nanoTime()-startTime;
        System.out.println("n! = "+b);
        System.out.println("Время выполнения ( Факториал через цикл)) = "+estimatedtime);
         startTime=System.nanoTime();
        int b1=factorial.factorialRecursion(10);
        estimatedtime=System.nanoTime()-startTime;
        System.out.println("n! = "+b1);
        System.out.println("Время выполнения ( Факториал через рекурсию)) = "+estimatedtime);
        IntegratedLoops loop1=new IntegratedLoops();
        loop1.rectangle(10);
        System.out.println();
        loop1.triangle1(10);
        System.out.println();
        loop1.triangle2(10);
        System.out.println();
        loop1.triangle3(20);
        System.out.println();
        loop1.triangle4(10);
        System.out.println();
        loop1.triangle5(10);
        System.out.println();
        loop1.triangle6(10);
        System.out.println();
        loop1.triangle7(10);
        System.out.println();
        loop1.triangle8(10);
        System.out.println();
        loop1.triangle9(10);
int n[]=new int [100];
        for(int i=1;i<n.length;i++)
        {  n[i]=i;}
        System.out.println(Arrays.toString(n));


        int n1[]=new int [100];

        for(int i=n1.length-1;i>1;i--)
        {  n1[n1.length-i-1]=i;}
        System.out.println(Arrays.toString(n1));

       int n2[]=new int[20];

        for(int i=0;i<n2.length;i++)
        {  n2[i]= Randomizer.randomiser(10);}
        System.out.println(Arrays.toString(n2));
        int counterchet=0;
        int counternechet=0;
        for(int i=0;i<n2.length;i++)
        {   if(n2[i]%2==0)
            {counterchet+=1;}
        else
            {counternechet+=1;}
    }

        System.out.println("Количество нечетных элементов "+counternechet);
        System.out.println("Количество четных элементов "+counterchet);

        int[] n3=new int[10];
        for (int i=0;i<n3.length;i++)
        {n3[i]=Randomizer.randomiser(100);}
        System.out.println(Arrays.toString(n3));

        for (int i=0;i<n3.length;i++)
        {if(i%2!=0)
        {n3[i]=0;}}

        System.out.println(" Заменили элементы с нечетными индексами");
        System.out.println(Arrays.toString(n3));

        int[] d = new int[15];
        for (int i=0;i<d.length;i++)
        {d[i]=Randomizer.minusrandomiser(50);}
        System.out.println(Arrays.toString(d));

        int max=d[0],min=d[0],mini=0,maxi=0;
        for (int i=1;i<d.length;i++)
        {if(d[i]>=max)
        {max=d[i];maxi=i;}
       if(d[i]<=min)
       {min=d[i];mini=i;}}

        System.out.println("Минимальный элемент = "+ min+" Последний индекс вхождения = "+mini);
        System.out.println("Максимальный элемент = "+max+" Последний индекс вхождения = "+ maxi);
int[] e=new int[10];
        for (int i=0;i<e.length;i++)
        {e[i]=Randomizer.randomiser(10);}
        System.out.println(Arrays.toString(e));
        int[] e1=new int[10];
        for (int i=0;i<e1.length;i++)
        {e1[i]=Randomizer.randomiser(10);}
        System.out.println(Arrays.toString(e1));
        int are=0,are1=0;
        for (int i=0;i<e.length;i++)
        {are+=e[i];
        are1+=e1[i];}
        are/=e.length;
        are1/=e1.length;

        System.out.println("Cреднее арифм первого массива "+are);
        System.out.println("Cреднее арифм второго массива "+are1);
        if(are>are1)
            System.out.println("среднее арифм 1 массива больше");
        else if (are<are1)
            System.out.println("среднее арифм 2 массива больше");
        else if (are==are1)
            System.out.println("среднее арифм равны");



        double[] f=new double[20];
        for (int i=0;i<f.length;i++)
        {f[i]=Randomizer.minusrandomiser(1);}
        System.out.println(Arrays.toString(f));



        double num = f[0];
        int max_frq = 1;
        for (int i=0; i < f.length; i++) {
            int  frq = 1;
            for (int k = i+1; k<f.length; k++)
                if (f[i] == f[k])
                    frq += 1;
            if (frq > max_frq) {
                max_frq = frq;
                num = f[i];
            }
        }

        if (max_frq > 1)
            System.out.println(max_frq+" раз(а) встречается число "+num);
        else
            System.out.println("Все элементы уникальны!");


        int[][] a5=new int[8][8];
        int multimain=1, multiother=1;
        for(int i=0;i<8;i++)
        {for (int j=0;j<8;j++)
        {a5[i][j]=Randomizer.minusrandomiser(99);
            System.out.print(a5[i][j]+" ");
        if (i==j)
        multimain*=a5[i][j];
        if (i==8-j-1)
        multiother*=a5[i][j];}
            System.out.println();}
        System.out.println("Произвдеение по главной диагонали = "+multimain+" Произведение по побочной диагонали равно = "+multiother);
    int[][] b5=new int[8][5];
    int maxb5=0, maxib=0, maxj=0;
        for(int i=0;i<8;i++)
    {for (int j=0;j<5;j++)
    {a5[i][j]=Randomizer.minusrandomiser(99);
        System.out.print(a5[i][j]+" ");
        if (a5[i][j]>maxb5)
        { maxb5=a5[i][j];
        maxib=i;
        maxj=j;
        }}
        System.out.println();}

        System.out.println("MAx Element = "+maxb5+" max i = "+maxib+" max j= "+maxj);

        int[][] c5=new int[8][5];
        int maxstroka=1,counter=1, maxstrokai=0;
        for(int i=0;i<8;i++)
        {for (int j=0;j<5;j++) {
            c5[i][j] = Randomizer.minusrandomiser(10);
            System.out.print(c5[i][j] + " ");
            counter*=c5[i][j];
        }counter=Math.abs(counter);
            if (counter>=maxstroka)
            {maxstroka=counter;
            maxstrokai=i;}
            counter=1;
            System.out.println();}
        System.out.println("Индекс строки с максимальным по модулю произведением = "+maxstrokai);

        int d5[][]=new int[10][7];

        for(int i=0;i<10;i++)
        {for (int j=0;j<7;j++) {
            d5[i][j] = Randomizer.randomiser(100);
            System.out.print(d5[i][j] + " ");
        }
            System.out.println();}
        System.out.println("Отсортируем строки:");

        for (int k = 0; k < 10; k++)
        {
            for(int i = 0;i < 7; i++)
            {
                for (int j = 7 - 1; j > i; j--)
                    if (d5[k][j] > d5[k][j-1])
                    {
                        int tmp = d5[k][j];
                        d5[k][j] = d5[k][j-1];
                        d5[k][j-1] = tmp;
                    }

            }
        }


        for(int i=0;i<10;i++)
        {for (int j=0;j<7;j++) {

            System.out.print(d5[i][j] + " ");
        }
            System.out.println();}
      SchoolMarks schoolMarks=SchoolMarks.Five;
        startTime=System.nanoTime();
        if (schoolMarks==SchoolMarks.One)
            System.out.println("Very Bad");
        else if (schoolMarks==SchoolMarks.Two)
            System.out.println("Bad");
        else if (schoolMarks==SchoolMarks.Three)
            System.out.println("Satisfactory");
        else if (schoolMarks==SchoolMarks.Four)
            System.out.println("Good");
        else if (schoolMarks==SchoolMarks.Five)
            System.out.println("Excellent");
        estimatedtime=System.nanoTime()-startTime;
        System.out.println("Vremya vypolnenia if = "+estimatedtime);
        startTime=System.nanoTime();
        switch (schoolMarks){
            case One:System.out.println("Very Bad");
break;
            case Two:System.out.println("Bad");
                break;
            case Three:System.out.println("Satisfactory");
                break;
            case Four: System.out.println("Good");
                break;
            case Five:System.out.println("Excellent");
                break;}
        estimatedtime=System.nanoTime()-startTime;
        System.out.println("Vremya vypolnenia case = "+estimatedtime);

        int[] b6=new int[50];
for(int i=0;i<b6.length;i++)
{b6[i]=Randomizer.randomiser(10);
   }
        System.out.println(Arrays.toString(b6));
        startTime=System.nanoTime();
        for(int i=0;i<b6.length;i++)
   switch (b6[i]) {
       case 0:
           System.out.println("zero");break;
       case 1:
           System.out.println("one");break;
       case 2:
           System.out.println("two");break;
       case 3:
           System.out.println("three");break;
       case 4:
           System.out.println("four");break;
       case 5:
           System.out.println("five");break;
       case 6:
           System.out.println("six");break;
       case 7:
           System.out.println("seven");break;
       case 8:
           System.out.println("eight");break;
       case 9:
           System.out.println("nine");break;
       case 10:
           System.out.println("ten");break;
   }
        estimatedtime=System.nanoTime()-startTime;
        System.out.println("Vremya vypolnenia case = "+estimatedtime);

        startTime=System.nanoTime();
        int counter0=0,counter1=0,counter2=0,counter3=0,counter4=0,counter5=0,counter6=0,counter7=0,counter8=0,counter9=0,counter10=0;
        for(int i=0;i<b6.length;i++)
        {  if(b6[i]==0) {
            System.out.println("zero");
            counter0+=1;
        }
          else if(b6[i]==1)
        {
                    System.out.println("one");
            counter1+=1;}
            else if(b6[i]==2){
                    System.out.println("two");
            counter2+=1;}
            else if(b6[i]==3){
            counter3+=1;
                            System.out.println("three");}
            else if(b6[i]==4){
                    System.out.println("four");
            counter4+=1;}
        else if(b6[i]==5){
                    System.out.println("five");
            counter5+=1;}
        else if(b6[i]==6){
                    System.out.println("six");
            counter6+=1;}
        else if(b6[i]==7){
                    System.out.println("seven");
            counter7+=1;}
        else if(b6[i]==8){
                    System.out.println("eight");
            counter8+=1;}
        else if(b6[i]==9){
                    System.out.println("nine");
            counter9+=1;}
        else if(b6[i]==10){
            counter10+=1;
                    System.out.println("ten");}
            }
        estimatedtime=System.nanoTime()-startTime;
        System.out.println("Vremya vypolnenia if = "+estimatedtime);
        System.out.println(" zero = "+counter0+" one = "+counter1+" two = "+counter2+" three = "+counter3+" four = "+counter4+" five = "+counter5+" six = "+counter6+" seven = "+counter7+" eight = "+counter8+" nine = "+counter9+" ten = "+counter10);
   }




    enum SchoolMarks { One, Two, Three, Four,Five };
}