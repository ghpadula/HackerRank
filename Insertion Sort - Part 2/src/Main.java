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
     * Complete the 'insertionSort2' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort2(int n, List<Integer> arr) {
        for(int i = 1;i < n;i++){

            int key = arr.get(i);
            int j = i -1;

            for(;j>=0;j--){

                if(arr.get(j) > key){
                    arr.set(j+1,arr.get(j));

                }
                else{
                    break;
                }

            }
            arr.set(j+1,key);
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
        int n = 6;
        List<Integer> arr = Arrays.asList(1, 4, 3, 5, 6, 2);
        Result.insertionSort2(n,arr);
    }
}
