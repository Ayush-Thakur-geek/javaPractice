package com.thakur;

public class RotationArr {
    public static void main(String[] args) {
        int[] nums = {4,5,6,0,1,2,3};
        int target = 4;
        System.out.println(searchTarget(nums,target));
    }
    static int searchTarget(int[] nums, int target) {
        int pivot=searchPivot(nums);
        if (pivot==-1) {
            return BinarySearch(nums,target,0,nums.length-1);
        }
        if (target==nums[pivot]) {
            return pivot;
        }
        if (target>=nums[0]) {
            return BinarySearch(nums,target,0,pivot-1);
        }
        return BinarySearch(nums,target,pivot+1, nums.length);
    }
    static int BinarySearch(int[] nums,int target,int start,int end) {
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (target<nums[mid]) {
                end=mid-1;
            } else if (target>nums[mid]) {
                start=mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    static int searchPivot(int[] nums) {
        int start=0,end=nums.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (mid<end && nums[mid]>nums[mid+1]) {
                return mid;
            }
            if (mid>start && nums[mid]<nums[mid-1]) {
                return mid-1;
            }
            if (nums[mid]<=nums[start]) {
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return -1;
    }



//    static int searchPivotForDuplicates(int[] nums) {
//        int start=0,end=nums.length-1;
//        while (start<=end) {
//            int mid=start+(end-start)/2;
//            if (mid<end && nums[mid]>nums[mid+1]) {
//                return mid;
//            }
//            if (mid>start && nums[mid]<nums[mid-1]) {
//                return mid-1;
//            }
//            // when nums[mid] = nums[start] = nums[end]
//            if (nums [start]== nums[mid] && nums[start] == nums[end]) {
//                // Check whether start is pivot or not.
//                if (nums[start] > nums[start + 1]) {
//                    return start;
//                }
//                // Check whether end is pivot or not.
//                if (nums[end] < nums[end - 1]) {
//                    return end - 1;
//                }
//                start++;
//                end--;
//            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//
//        }
//        return -1;
//    }
}


