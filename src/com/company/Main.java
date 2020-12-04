package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];


        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }


        /**
           0 1 -1 -1 2 -1 6 -1 8
         1 1 1  5  4 1  3 1  2 2



         1 7 62 3 28 1 2 40 4 2 1 4 6 38 2 4 5 6 6 2


         1        -> -1
         1 1      -> -1
         1 1 1    -> -1
         1 1 1 5  -> 1 5
         1 1 1 5 4  -> 1 5 4
         1 1 1 5 4 1   ->  5 4 1
         1 1 1 5 4 1 3 ->   5 4 1 3
         1 1 1 5 4 1 3 2 ->   5 4 1 3 2
         1 1 1 5 4 1 3 2 2 ->   1 5 4 1 3 2 2

          start

          end

         */


    }


}
