import java.util.Arrays;
import java.util.Scanner;

/**
 * Metodai
 */
public class Metodai {

    public static int[] readGrades(int n) {
        Scanner rd = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.printf("Įveskite %d pažymius:", n);
        for (int i=0; i<n; i++) {
            int tmp = rd.nextInt();
            if(tmp > 0 && tmp < 11) {
                arr[i] = tmp;
            } else {
                System.out.println("Netinkamas pažymys, bandykite dar kartą!");
                i--;
            }
        }
        rd.close();
        return arr;
    }

    public static int randomNumbers(int a, int b) {
        return (int)((Math.random() * (b - a + 1)) + a);
    }

    public static int[] randomGrades(int n) {
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = randomNumbers(1, 10);
        }
        return arr;
    }

    public static void printGrades(int[] arr) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static double getAvg(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return (double ) sum / arr.length;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static double getMediana(int[] arr) {
        Arrays.sort(arr);
        if(arr.length % 2 == 0) {
            return (double) (arr[arr.length/2] + arr[arr.length/2 + 1]) / 2;
        } else {
            return arr[arr.length/2];
        }
    }

    public static double getPercentage(int[] arr) {
        int pos = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > 4) {
                pos++;
            }
        }
        return 100 * pos / arr.length;
    }

    public static int count(int[] arr, int n) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == n) {
                count++;
            }
        }
        return count;
    }

    public static void printHistogram(int[] arr) {
        for(int i=0; i<10; i++) {
            System.out.print(((i+1)/10<1?" ":"") + (i+1) + ":");
            int n = count(arr, i+1);
            for (int j=0; j<n; j++) {
                System.out.print("🟥");//Isveda emoji, jei neveikia, reikia pakeisti i *
            }
            System.out.println();
        }
    }

    /**
     * 
     * Saulio metodai
     * 
     */

     public static double pyth(int a, int b) {
         System.out.println(Math.sqrt((double)(a * a) + (b * b)));
         return Math.sqrt((double)(a * a) + (b * b));
     }
}