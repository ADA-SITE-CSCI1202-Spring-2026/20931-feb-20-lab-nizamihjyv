import java.util.Scanner;

public class TestMinAndMax{

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            // Read one full line
            String line = sc.nextLine();

            // Split numbers by spaces
            String[] parts = line.split(" ");

            int[] arr = new int[parts.length];

            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }

            System.out.println("Minimum: " + MinAndMaxUtils.findMin(arr));
            System.out.println("Maximum: " + MinAndMaxUtils.findMax(arr));

            int[] result = MinAndMaxUtils.findMinMax(arr);
            System.out.println("Both together: Min = " + result[0] + ", Max = " + result[1]);
        }
    }
}
