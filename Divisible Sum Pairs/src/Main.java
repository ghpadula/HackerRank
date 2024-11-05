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
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        int size = n;
        for(int i = 0;i < size;i++){
            for(int j = i + 1; j < size;j++){
                int num1 = ar.get(i);
                int num2 = ar.get(j);
                int sum = num1 + num2;
                if(sum% k == 0){
                    count++;
                }

            }
        }

        return count;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        int n = 6;
        int k = 3;
        List<Integer> arr = Arrays.asList(1,3,2,6,1,2);
        System.out.println(Result.divisibleSumPairs(n,k,arr));

    }
}
