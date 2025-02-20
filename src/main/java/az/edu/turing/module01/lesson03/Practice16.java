package az.edu.turing.module01.lesson03;

import java.util.Scanner;

public class Practice16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        int a = scanner.nextInt();
        if (a < 0) {
            System.out.println("negative number");
        } else if (a > 0) {
            System.out.println("positive number");
        } else {
            System.out.println("number is zero");

        }

    }
}

