import java.util.*;
public class q12descending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) nums[i] = sc.nextInt();
        Arrays.sort(nums);
        for (int i = 3; i >= 0; i--) System.out.print(nums[i] + " ");
    }
}