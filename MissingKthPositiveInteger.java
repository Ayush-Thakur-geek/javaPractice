public class MissingKthPositiveInteger {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;

        int count = 0;
        int j = 0;
        int result = 0;
        for (int i = 1;j < arr.length ;i++){
            if (i != arr[j])
                count++;
            else j++;
            if (count == k) {
                result = i;
                break;
            }
        }


//        for(int i : arr){
//            if(i <= k) k++; else break;
//        }
        System.out.println(result);
    }
}
