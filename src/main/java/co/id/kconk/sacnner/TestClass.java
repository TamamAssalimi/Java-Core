package co.id.kconk.sacnner;

import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine();
        /**
        * nextLine() & next() have different Function
        **/
        String s = scanner.nextLine();
        scanner.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
