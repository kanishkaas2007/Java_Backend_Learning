package ProblemSolving2;

public class InsertPos {
    public static void main(String[] args) {

        int nums[] = {1,3,5,6};
        int target = 5;
        int start = 0;
        int end = nums.length - 1;
        int ans = nums.length;

        while(start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] == target) {
                ans = mid;
                break;
            }

            else if(nums[mid] < target) {
                start = mid + 1;
            }

            else {
                ans = mid;
                end = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
