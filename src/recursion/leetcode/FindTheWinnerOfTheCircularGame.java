package recursion.leetcode;

public class FindTheWinnerOfTheCircularGame {
    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(s.findTheWinner(5, 2));
    }
}

class Sol {
    public int findTheWinner(int n, int k) {
        return winner(n, k) + 1;
    }
    private int winner(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (winner(n-1 , k)+k)%n;
    }
}
