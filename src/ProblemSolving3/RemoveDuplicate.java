package ProblemSolving3;

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
    public static void main(String[] args) {
        RemoveDuplicate obj = new RemoveDuplicate();

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = obj.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + result);
        System.out.print("Array: ");

        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}