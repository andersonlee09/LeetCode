/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/17 15:34
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee088_Merge { // 合并num2 到 num1 内
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int porM = m - 1, porN = n - 1, len = nums1.length - 1;
        while (porN >= 0 && porM >=0) {
            if (nums1[porM] > nums2[porN]) {
                nums1[len--] = nums1[porM];
                porM--;
            } else  {
                nums1[len--] = nums2[porN];
                porN--;
            }
        }
        while (porM >=0) {
            nums1[len--] = nums1[porM];
            porM--;
        }
        while (porN >= 0) {
            nums1[len--] = nums2[porN];
            porN--;
        }
    }
}
