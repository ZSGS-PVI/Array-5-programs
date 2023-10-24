package ArraysProblems;

import java.util.Arrays;



import java.util.*;
import java.lang.*;
import java.util.Scanner;
public class AlternateSort {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6,7};
        int n = input.length;

        int[] output = new int[n];
        
        int oddIndex = 0;
        int evenIndex = n -1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                output[i] = input[oddIndex];
                oddIndex++;
            } else {
                output[i] = input[evenIndex];
                evenIndex--;
            }
        }

        for (int i = n-1; i>=0; i--) {
       
          System.out.print(output[i]+" ");
         
        }
      
    }
}

