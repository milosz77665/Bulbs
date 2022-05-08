import java.util.Arrays;

public class Bulbs {
    public static int solution(int[] A) {
        String[] B = new String[A.length];
        int result = 0;

        for (int el = 0; el < A.length; el++) {
            B[A[el] - 1] = "on";
            int count = 0;
            int count2 = 0;
            for (int i = 0; i < B.length; i++) {
                if (B[i] == "on" || B[i] == "shine") {
                    count++;
                } else {
                    break;
                }
            }

            for (int j = 0; j < count; j++) {
                B[j] = "shine";
            }

            for (int z = 0; z < B.length; z++) {
                if (B[z] == "shine") {
                    count2++;
                }
            }
            if (count2 == el + 1) {
                result++;
            }
            System.out.println(Arrays.toString(B));
        }
        return result;
    }

    public static void main(String args[]) {
        int[] A = {1, 6, 2, 4, 3, 5};
        System.out.println(solution(A));
    }

}


