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
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int lowRecord = scores.get(0);
        int highRecord = scores.get(0);
        int high = 0, low = 0;

        for(int i = 0;i < scores.size();i++){
            int score = scores.get(i);
            if (score > highRecord){
                high++;
                highRecord = score;
            }
            if (score < lowRecord){
                low++;
                lowRecord = score;
            }
        }
        List<Integer> records = new ArrayList<>();
        records.add(high);
        records.add(low);

        return records;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers = Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42);
        System.out.println(Result.breakingRecords(numbers));


    }
}
