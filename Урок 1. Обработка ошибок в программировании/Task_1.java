import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Task_1 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] ar1 = new int[20];
        for(int i = 0; i < ar1.length; i++) {
            ar1[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(ar1));
        int[] ar2 = new int[20];
        for(int i = 0; i < ar2.length; i++) {
            ar2[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(ar2));

        int[] ar3 = differenceArrays(ar1, ar2);
        System.out.println(Arrays.toString(ar3));
        
        
    }

    public static int[] differenceArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Arrays must have the same length");
            return null;
        }
        int[] diffArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            diffArr[i] = arr1[i] - arr2[i];
        }
        return diffArr;
    }
}
