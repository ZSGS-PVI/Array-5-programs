package ArraysProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class WeightBsedSort {
	 public static int calculateWeight(int num) {
	        int weight = 0;

	        if (isPerfectSquare(num)) {
	            weight += 5;
	        }
	        if (num % 4 == 0 && num % 6 == 0) {
	            weight += 4;
	        }
	        if (num % 2 == 0) {
	            weight += 3;
	        }

	        return weight;
	    }

	    public static boolean isPerfectSquare(int num) {
	        int sqrt = (int) Math.sqrt(num);
	        return sqrt * sqrt == num;
	    }

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
      System.out.println("Enter the length of the array you want:");
      int len=in.nextInt();
      
      System.out.println("Enter the values:");
      int[] array=new int[len];
      for(int i=0;i<len;i++) {
    	  array[i]=in.nextInt();
      }
      ArrayList<Pair> weightedNumbers = new ArrayList<>();
      for (int num : array) {
          int weight = calculateWeight(num);
          weightedNumbers.add(new Pair(num, weight));
      }
      
      
      Collections.sort(weightedNumbers, new Comparator<Pair>() {
          public int compare(Pair a, Pair b) {
              return b.weight - a.weight;
          }
      });
      
      for (Pair pair : weightedNumbers) {
          System.out.print("<" + pair.number + ", " + pair.weight + "> ");
      }
	}

}

class Pair {
    int number;
    int weight;

    public Pair(int number, int weight) {
        this.number = number;
        this.weight = weight;
    }
}
