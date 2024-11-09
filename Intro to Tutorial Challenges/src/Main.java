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
     * Complete the 'introTutorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER V
     *  2. INTEGER_ARRAY arr
     */

    public static int introTutorial(int V, List<Integer> arr) {
    for(int i = 0;i<arr.size();i++){
        if(arr.get(i) == V){
            return i;
        }
    }

        return V;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        int v = 12;
        List<Integer> arr = Arrays.asList(1,4,5,7,9,12);
        System.out.println(Result.introTutorial(v,arr));

    }
}
