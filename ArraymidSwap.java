
import java.util.*;
public class ArraymidSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int midIndex = n / 2;
        System.out.println("Middle element: " + arr[midIndex]);
        System.out.println("First element: " + arr[0]);
        System.out.println("Last element: " + arr[n - 1]);
    }
}
