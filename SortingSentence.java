package com.thakur;

public class SortingSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String[] s1=s.split(" ");
        String[] s3=new String[s1.length];
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<s1.length;i++) {
            String s2=s1[i];
            char j=s2.charAt(s2.length()-1);
            int l=Character.getNumericValue(j);
            s3[l-1]=s2;
            
        }
        for (int k=0;k<s3.length;k++) {
            sb.append(s3[k]+" ");
        }
        System.out.println((sb.toString()).trim());
    }
}
