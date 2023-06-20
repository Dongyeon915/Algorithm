package chapter01.nextExamplePack;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Example2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(data, " ");
        int r = Integer.parseInt(tokenizer.nextToken());
        int c = Integer.parseInt(tokenizer.nextToken());
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            data = scanner.nextLine();
            tokenizer = new StringTokenizer(data, " ");
            for (int j = 0; j < c; j++) {
                arr[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }
        System.out.println();
    }
}
