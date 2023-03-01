/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cat.ferreria.m05sort;

import java.util.Arrays;

/**
 *
 * @author rvallez2
 */
public class Main {
        
    public static void main(String[] args) {
            int[] a = {50,26,7,9,15,27};

            System.out.println("Array inicial: " + Arrays.toString(a));
            Selectionsort.selectionSort(a);
            System.out.println("Bubble Sort: " + Arrays.toString(a));
            
            
            int[] b = {100,50,70,0,20,40,30,10,90,60,80};
            System.out.println("Array inicial: " + Arrays.toString(b));
            Quicksort.quicksort(b,0,b.length-1);
            System.out.println("Quick Sort: " + Arrays.toString(b));
    }
        
        
  
}
