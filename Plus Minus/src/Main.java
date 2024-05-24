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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int length = arr.size();
        int zero = 0;
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < length; i++) {
            int index = arr.get(i);
            if(index == 0){
                zero++;
            }
            else if(index < 0){
                negative ++;
            }
            else{
                positive ++;
            }
        }
        System.out.printf("%.6f\n%.6f\n%.6f\n", (double) positive / length, (double) negative/length, (double) zero/length);

    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}