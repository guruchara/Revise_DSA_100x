import java.util.*;

public class threeLargest {

    public static void three(int arr[]) {

        Arrays.sort(arr);
        for (int i = arr.length - 3; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            // System.out.println(arr[i]);
        }

        three(arr);

    }

}