package Leetcode;

public class CountAndSay {
    public static void main(String[] args) {
        String n = "4";
        StringBuilder sb = new StringBuilder();
        if (n.length() > 1) {
            int i = 1;
            int j = n.length()-1;
            int count = 1;
            while (i < j) {
                if (n.charAt(i) == n.charAt(i-1)) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(n.charAt(i-1));
                    count = 1;
                }
                if (i == j-1) {
                    if (n.charAt(i) == n.charAt(j)) {
                        count++;
                        sb.append(count);
                        sb.append(n.charAt(j));
                    } else {
                        sb.append(count);
                        sb.append(n.charAt(i));
                        sb.append(1);
                        sb.append(n.charAt(j));
                    }
                }
                i++;
            }
        }
//        sb = sb.reverse();
        System.out.println(sb.toString());
    }
}
