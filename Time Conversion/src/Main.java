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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String time24 = s;
        int lenght = time24.length();
        if (s.substring(s.length() - 2).equals("AM")) {
            time24 = time24.replace("AM","");
            if (s.substring(0,2).equals("12")) {
                time24 = time24.replace("12","00");
            }
        }
        if (s.substring(s.length() - 2).equals("PM")) {
            int hora = Integer.parseInt(s.substring(0, 2));
            if(hora != 12){
                hora += 12;
            }

            String hora24 = String.format("%02d", hora);
            time24 = hora24 + time24.substring(2);
            time24 = time24.replace("PM","");
        }




            return time24;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        String time = "12:45:54PM";
        System.out.println(Result.timeConversion(time));

    }
}
/*public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
 */