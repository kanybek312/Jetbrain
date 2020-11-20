package Jetbrain.Math;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double d;
        double x1;
        double x2;
        if (a != 0){
        d = Math.sqrt(Math.pow(b, 2) - (4) * (a) * (c));
        x1 = (-b + d) / (2 * a);
        x2 = (-b - d) / (2 * a);

        if ( x1 < x2) {
            System.out.println(x1);
            System.out.println(x2);
        } else {
            System.out.println(x2);
            System.out.println(x1);
        }
        }
    }
}
