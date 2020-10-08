package com.myy.sort;

public class QuickSort {


    public void sort(int[] array, Integer low, Integer high) throws Exception {
        if (array == null || array.length == 0) {
            throw new Exception("数组为空");
        }
        if (low < high) {
            System.out.println("sort:");
            printArray(array);
            System.out.println("low:" + low + ",high:" + high);

            int pivotkey = partition(array, low, high);
            sort(array, low, pivotkey - 1);
            sort(array, pivotkey + 1, high);
        }
    }

    /**
     * 将数组根据枢轴一分为二
     * @param array
     * @param low
     * @param high
     * @return
     * @throws Exception
     */
    public int partition(int[] array, Integer low, Integer high) {
        int pivotkey = array[low];
        while (low < high) {
            while (low < high && array[high] > pivotkey) {
                high --;
            }
            change(array, low, high);

            while (low < high && array[low] < pivotkey) {
                low ++;
            }
            change(array, low, high);
        }
        return low;
    }

    private void printArray(int[] array) {
        for (int i = 0; i < array.length; i ++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private void change(int[] array, int low, int high) {
        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;
    }

    public static void main(String[] args) throws Exception {

        int[] array = new int[]{49, 38, 65, 97, 76, 13, 27, 10, 99, 55, 30};

        QuickSort sort = new QuickSort();
        sort.sort(array, 0, array.length - 1);
        System.out.println("排序后:");
        sort.printArray(array);
    }
}
