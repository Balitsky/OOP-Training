package L3.Context;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Runtime.getRuntime().exec("cls");
        System.out.println(x);
    }
}
