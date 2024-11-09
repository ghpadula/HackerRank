import javax.swing.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
        int test = arr.get(n - 1);

        for (int j = n - 2; j >= 0; j--) {
            if (test < arr.get(j)) {
                arr.set(j + 1, arr.get(j));
                printArray(arr);
            } else {
                arr.set(j + 1, test);
                printArray(arr);
                return;
            }
        }
        if (arr.get(0) > test) {
            arr.set(0, test);
            printArray(arr);
        }
    }

    public static void printArray(List<Integer> arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> arr = Arrays.asList(2,4,6,8,3);
        int n = arr.size();
        Result.insertionSort1(n,arr);

    }
}
