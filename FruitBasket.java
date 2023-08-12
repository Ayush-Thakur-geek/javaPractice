package com.thakur;
import java.util.*;

public class FruitBasket {
    public static void main(String[] args) {
        int[] fruits = {3,3,3,3,3,3};
        int count=2;
        ArrayList<Integer> l=new ArrayList<>();
        if (fruits.length<2) {
            System.out.println(fruits.length);
        }
        for (int i=0;i<fruits.length-2;i++) {
            while (fruits[i]==fruits[i+1] && i< fruits.length-2) {
                i++;
                count++;
            }
            for (int j=i+2;j<fruits.length;j++) {
                if (fruits[j]==fruits[i] || fruits[j]==fruits[i+1]) {
                    count++;
                } else {
                    break;
                }
            }
            l.add(count);
            count=2;
        }
        if (l.size()==0) {
            System.out.println(count);
        } else {
            int max=l.get(0);
            for (int i=1;i<l.size();i++) {
                if (l.get(i)>max) {
                    max=l.get(i);
                }
            }
            System.out.println(max);
        }
    }
}
