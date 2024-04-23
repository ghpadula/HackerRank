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

class Result
{

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar)
    {
        long result = 0;

        for (Long aLong : ar)
        {
            result += aLong;

        }


        return result;
    }


}


public class Main {
    public static void main(String[] args) throws IOException {


        List<Long> ar = Arrays.asList(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L);
        long result = Result.aVeryBigSum((List<Long>) ar);
        System.out.println(result);


    }
}
