package Java3L1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Java3L1Main {
    public static void main(String[] args){
        // 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа)
        String[] stringArr = {"apple", "banana", "cucumber", "tomato", "orange"};
        System.out.println("Task one");
        System.out.println(Arrays.toString(stringArr));
        swapArrayElements(stringArr, 0, 3);
        System.out.println(Arrays.toString(stringArr));

        // 2. Написать метод, который преобразует массив в ArrayList
        System.out.println("Task two");
        Integer[] intArr = {1, 2, 3, 5};
        System.out.println(Arrays.toString(intArr));
        List<Integer> list = arrToArrayList(intArr);
        System.out.println(list);
    }
    private static <E>  void swapArrayElements(E[] arr, int firstIndex, int secondIndex){
        E buffer = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = buffer;
    }
    private static <T> ArrayList arrToArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }
}
