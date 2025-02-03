import java.util.Arrays;

class Main {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] common = new int[A.length];
        int count = 0;
        for (int i = 0; i < A.length; i++) {

            int[] subArrayA = Arrays.copyOfRange(A, 0, i + 1);
            int[] subArrayB = Arrays.copyOfRange(B, 0, i + 1);

            for (int j = 0; j < subArrayA.length; j++) {

                for (int x = 0; x < subArrayB.length; x++) {
                    if (subArrayA[j] == subArrayB[x]) {
                        count++;
                    }
                }
            }
            common[i] = count;
            count = 0;
        }

        System.out.println(Arrays.toString(common));
        return common;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] A = {1, 2, 3, 4};
        int[] B = {2, 1, 0, 4};
        main.findThePrefixCommonArray(A, B);
    }
}