package Leetcode;

public class reversePreffix {
    public static void main(String[] args) {
        String word="xyxzxe";
        char ch='z';
        System.out.println(rev(word, ch));
    }
    static String rev(String word, char ch) {
        StringBuilder s=new StringBuilder();
        int i=0;
        for (i=0;i<word.length();i++) {
            if (word.charAt(i)==ch) {
                break;
            } else if (i==word.length()-1 && word.charAt(i)==ch) {
                return word;
            }
        }
        for (int j=i;j>=0;j--) {
            s.append(word.charAt(j));
        }
        return s.toString();
    }
}
