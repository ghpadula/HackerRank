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
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        if(m > s.size()){
            return  count;
        }
        for(int i = 0;i <= s.size() - m;i++){
            int sum = 0;
            for(int j = i;j<i+m;j++){
                sum += s.get(j);
            }

            if (sum == d){
                count++;

            }
        }


        return count;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        int d = 3;
        int m = 2;
        List<Integer> arr = Arrays.asList(1, 2, 1, 3, 2);
        System.out.println(Result.birthday(arr,d,m));

    }
}
