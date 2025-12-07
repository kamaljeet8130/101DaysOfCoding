package coding101days.day29;

public class Day29MergeSort {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int[] merged = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) merged[k++] = arr[i++];
            else merged[k++] = arr[j++];
        }

        while (i <= m) merged[k++] = arr[i++];
        while (j <= r) merged[k++] = arr[j++];

        for (int x = 0; x < merged.length; x++) {
            arr[l + x] = merged[x];
        }
    }
}
