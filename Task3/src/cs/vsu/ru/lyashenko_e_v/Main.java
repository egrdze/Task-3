package cs.vsu.ru.lyashenko_e_v;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        if (test.testProgram()) {
            System.out.println(("Test error"));
            System.exit(1);
        } else {
            System.out.println("All done");
        }

        double x = getPoint("X");
        double y = getPoint("Y");
        printColor(x, y);
    }

    static double getPoint(String pt) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите " + pt + ": ");
        return scan.nextDouble();
    }

    static void printColor(double x, double y) {
        Picture program = new Picture();
        System.out.println("(" + x + ", " + y + ") -> " + program.getColor(x, y));
    }


}


