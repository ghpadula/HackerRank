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
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int total = 0;
        int size = bill.size();
        for (int i = 0; i<size;i++){
            total += bill.get(i);
            //System.out.println(total);
        }
        total -= bill.get(k);
        int conta = total/2;
        if (conta == b){
            System.out.println("Bon Appetit");
        }
        else{
            int x = b - conta;
            System.out.println(x);
        }






    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> list = Arrays.asList(3, 10, 2, 9);
        int b1 = 7;
        int k1 = 1;
        Result.bonAppetit(list,k1,b1);

    }
}
