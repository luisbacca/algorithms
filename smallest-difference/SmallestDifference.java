package com.company;

import java.util.Arrays;

public class SmallestDifference {

    int[] smallestDifference(int[] arrayOne, int[] arrayTwo){
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int indice1,indice2;
        indice1 = indice2 = 0;
        int small, current;
        small = current = Integer.MAX_VALUE;
        int[] result = new int[2];

        while(indice1 < arrayOne.length & indice2 < arrayTwo.length){
            int num1 = arrayOne[indice1];
            int num2 = arrayTwo[indice2];
            if (num1 < num2){
                current = num2 - num1;
                indice1++;
            } else if (num1 > num2){
                current = num1 - num2;
                indice2++;
            } else {
                return new int[]{num1, num2};
            }
            if (current < small){
                small = current;
                result = new int[]{num1, num2};
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SmallestDifference smallestDifference = new SmallestDifference();
        int[] result = smallestDifference.smallestDifference(new int[]{6,12,-5,4,7,11}, new int[]{5,8,-2,10,3});
        for(int r : result){
            System.out.print(r);
            System.out.print(",");
        }
    }
}
