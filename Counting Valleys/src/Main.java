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
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        int count = 0;
        int valley = 0;
        int test = 0;
        for(int i = 0;i<steps;i++){
            test = count;
            if(path.charAt(i) == 'U'){count++;}
            else{count--;}
            if(count == 0 && test <= -1 ){
                valley ++;
            }


        }
        return valley;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(Result.countingValleys(8,"UDDDUDUU"));
    }

}
