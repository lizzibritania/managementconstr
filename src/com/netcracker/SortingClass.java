package com.netcracker;
import java.util.Arrays;
/**
 * Created by Lizzi on 28.10.2016.
 */
public class SortingClass {
    int[] n;

    public SortingClass(int... n) {
        this.n = n;
    }


    public void methodArraySort(){
    Arrays.sort(n);

    }

    public void bubbleSort()
    {

        for(int i = n.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

            if( n[j] > n[j+1] ){
                int tmp = n[j];
                n[j] = n[j+1];
               n[j+1] = tmp;
            }
        }
    }


    }

    @Override
    public String toString() {
        return "SortingClass{" +
                "n=" + Arrays.toString(n) +
                '}';
    }

    public  void selectionSort(){

        for (int i = 0; i < n.length; i++) {

            int min = n[i];
            int min_i = i;

            for (int j = i+1; j < n.length; j++) {

                if (n[j] < min) {
                    min = n[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = n[i];
                n[i] = n[min_i];
                n[min_i] = tmp;
            }
        }
    }
}
