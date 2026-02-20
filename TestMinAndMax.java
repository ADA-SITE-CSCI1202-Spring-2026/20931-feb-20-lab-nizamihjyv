import java.util.Scanner;

public class TestMinAndMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] parts = line.split(" ");

        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        int min = MinAndMaxUtils.findMin(arr);
        int max = MinAndMaxUtils.findMax(arr);

        System.out.println("Using separate methods:");
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        int[] result = MinAndMaxUtils.findMinMax(arr);

        System.out.println("\nUsing combined method:");
        System.out.println("Minimum: " + result[0]);
        System.out.println("Maximum: " + result[1]);

        sc.close();
    }
}

