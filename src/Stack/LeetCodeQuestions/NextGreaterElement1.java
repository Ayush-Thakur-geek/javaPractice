package Stack.LeetCodeQuestions;

import java.util.Arrays;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        NextGreaterElement1 n = new NextGreaterElement1();
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] res = n.nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
}

class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        int[] res = new int[nums1.length];
        for (int i = nums2.length - 1; i >= 0; i--) {
            st2.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            if (!st2.isEmpty() && st2.peek() != nums1[i]) {
                st1.push(st2.pop());
            } else if (!st2.isEmpty() && st2.peek() == nums1[i]) {
                st2.pop();
                if (st2.isEmpty()) {
                    res[i] = -1;
                } else {
                    while (!st2.isEmpty()) {
                        if (st2.peek() > nums1[i]) {
                            res[i] = st2.peek();
                            break;
                        } else {
                            st1.push(st2.pop());
                        }
                    }
                    while (!st1.isEmpty()) {
                        st2.push(st1.pop());
                    }
                    if  (st2.isEmpty()) {
                        res[i] = -1;
                    }
                }
            }
        }
        return res;
    }
}
