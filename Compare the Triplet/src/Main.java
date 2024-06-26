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
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b)
    {
        int alice = 0;
        int bob = 0;
        for(int i = 0; i < a.size() && i <b.size(); i++ )
        {
            if(a.get(i) > b.get(i)){
            alice++;
            }
            if(a.get(i) < b.get(i)){
            bob++;
        }
        }
       return Arrays.asList(alice, bob);
    }

}

public class Main {
    public static void main(String[] args) throws IOException {

        List<Integer> a = new ArrayList<>(Arrays.asList(17,28,30));
        List<Integer> b = new ArrayList<>(Arrays.asList(99,16,8));
        List<Integer> result = Result.compareTriplets(a, b);
        System.out.println(result);


    }
}
