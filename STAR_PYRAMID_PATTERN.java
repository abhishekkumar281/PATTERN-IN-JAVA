package PATTERN_IN_JAVA;

import java.io.*;

public class STAR_PYRAMID_PATTERN {
    public static void main(String[] args) {
        int number = 5;
        int m = 1;
        int n;

        do {
            n = 1;

            do {
                System.out.print(" ");

            }
            while (++n <= number - m + 1);
            n = 1;

            do {
                System.out.print("*");
            }
            while (++n <= m * 2 - 1);
            System.out.println();

        }
        while (++m <= number);
        m = number - 1;

        do {
            n = 1;

            do {
                System.out.print(" ");

            } while (++n <= number - m + 1);

            n = 1;

            do {
                System.out.print("*");

            } while (++n <= m * 2 - 1);
            System.out.println();

        }
        while (--m > 0);
    }
}
