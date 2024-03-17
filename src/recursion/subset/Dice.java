package recursion.subset;

public class Dice {
    public static void main(String[] args) {
        int t = 4;
        roll("", t);
    }
    public static void roll(String p, int up) {
        if (up == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 4; i++) {
            if (up - i >= 0) {
                roll(p+i, up-i);
            } else {
                break;
            }
        }
    }
}
