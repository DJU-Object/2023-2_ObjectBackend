package 최소최대;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int []numList = new int[n];

        for (int i = 0; i < n; i++) {
            numList[i] = sc.nextInt();
        }
        int max = numList[0];
        int min = numList[0];


        for (int i = 0; i < n; i++) {
            int num = numList[i];
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        System.out.println(min + " " + max);

    }
}
