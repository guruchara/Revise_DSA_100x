import java.util.Scanner;

import javax.print.event.PrintEvent;

import java.util.*;

public class secondLarget {

    public static int secondLargetNumber(int arr[]) {

        Arrays.sort(arr);

        if (arr.length < 3) {
            return arr[0];
        }
        return arr[arr.length - 2];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int x = secondLargetNumber(arr);

        System.out.println("value" + " " + x);
    }
}