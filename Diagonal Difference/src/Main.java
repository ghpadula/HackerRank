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
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr)
    {

        int size = arr.size();
        int right = 0;
        int left = 0;

        for (int i = 0; i < size; i++)
        {
            right += arr.get(i).get(i);
            left += arr.get(i).get(size - i - 1);




        }

        return Math.abs(right - left);
    }


    }




public class Main {
    public static void main(String[] args) throws IOException {
        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(11, 2, 4),
                Arrays.asList(4, 5, 6),
                Arrays.asList(10, 8, -12)
        );
        int result = Result.diagonalDifference(arr);
        result = Math.abs(result);


        System.out.println(result);


    }
}
