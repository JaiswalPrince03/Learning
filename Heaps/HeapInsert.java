package Heaps;

import java.util.Arrays;

public class HeapInsert {
    private static int[] arr;

    public static void insert(int value){
        if(arr == null) arr = new int[0];
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = value;
        upHeapify(arr.length - 1);
    }

    private static void upHeapify(int index){
        if(index == 0) return;
        int pi = (index - 1) / 2;
        if(arr[pi] > arr[index]) swap(pi, index);
        upHeapify(pi);
    }

    private static void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void delete(int index){
        if(arr == null || index >= arr.length) return;
        swap(index,arr.length - 1);
        arr = Arrays.copyOf(arr, arr.length - 1);
        downHeapify(index);
    }

    private static void downHeapify(int index){
        int li = 2 * index + 1;
        int ri = 2 * index + 2;
        int min = index;
        if(li < arr.length && arr[li] < arr[min]) min = li;
        if(ri < arr.length && arr[ri] < arr[min]) min = ri;
        if(min != index) {
            swap(min, index);
            downHeapify(min);
        }
    }

    public static void printHeap(){
        if(arr == null) return;
        int level = 0;
        int start = 0;
        while(start < arr.length){
            for(int i = start; i < start + (int)Math.pow(2, level) && i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            start += (int)Math.pow(2, level);
            level++;
        }
    }

    public static void main(String[] args) {
        int[] values = {10, 20, 30,40,50,60,70,80,90,100};
        for(int value : values){
            insert(value);
        }
        delete(3);
        printHeap();
    }
}
