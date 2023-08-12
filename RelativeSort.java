package com.thakur;
import java.util.*;

public class RelativeSort {
    public static void main(String[] args) {
        int[] arr1={2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2={2,1,4,3,9,6};
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    al1.add(arr1[j]);
                }
            }
        }
        for(int i:arr1) {
            if(!al1.contains(i)){
                al2.add(i);
            }
        }
        Collections.sort(al2);
        al1.addAll(al2);
        int[] arr = new int[al1.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = al1.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
