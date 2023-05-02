import java.util.Arrays;
import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] ar1 = new int[21];
        for(int i = 0; i < ar1.length; i++) {
            ar1[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(ar1));
        int[] ar2 = new int[20];
        for(int i = 0; i < ar2.length; i++) {
            ar2[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(ar2));

        int[] ar3 = quotientArrays(ar1, ar2);
        System.out.println(Arrays.toString(ar3));

        
    }

    public static int[] quotientArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Arrays must have the same length");
        }
        int[] quotientArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Cannot divide by zero");
            }
            quotientArr[i] = arr1[i] / arr2[i];
        }
        return quotientArr;
    }
}
