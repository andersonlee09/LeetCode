/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/11/18 12:35
 * @purpose null
 * @ModifiedRecords null
 */
public class QuickSort {
    public int partition(int[] nums, int left, int right) {
        int temp = nums[left];
        while (left < right) {
            while (left < right && nums[right] >= temp) right--;
            nums[left] = nums[right];
            while (left < right && nums[left] <= temp) left++;
            nums[right] = nums[left];
        }
        nums[left] = temp;
        return left;
    }

    public void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int prov = partition(nums, left, right);
            quickSort(nums, left, prov - 1);
            quickSort(nums, prov + 1, right);
        }
    }

}
