import java.util.ArrayList;

public class LongestSubSequence {
    public static void main(String args[]){
        System.out.println(findLIS(new int[]{1,2,2,3,1,6}));

    }
    private static int rank(int[] a, int low, int high, int value)
    {
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if      (value < a[mid]) high = mid - 1;
            else if (value > a[mid]) low = mid + 1;
            else return mid;
        }
        return low;
    }
    private static int findLIS(int[] s)
    {
        int len = 0;
        int[] temp = new int[s.length];
        int k = 0;
        temp[k] = s[k]; len++;
        for (int i = 1; i < s.length; i++)
        {
            if (s[i] > temp[k])
            {
                k++; temp[k] = s[i];
                len++;
            }
            else
            {
                int low = 0; int high = k;
                int ix = rank(temp, low, high, s[i]);
                temp[ix] = s[i];
            }
        }
        return len;
    }
}
