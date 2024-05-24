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
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        for (int i = 0;i < n;i++){
            for (int j = 0; j < n;j++){
                if(j < n -1 - i){
                    System.out.print(" ");
                }
                else{System.out.print("#");}
            }
            System.out.println("");
        }
    }
}



public class Main {
    public static void main(String[] args) throws IOException {
        int n = 6;
        Result.staircase(n);


    }
}
