import javax.swing.*;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;

public class Main {
    public static void main(String[] args) {


       Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Input value Side A");
        a = scan.nextInt();

        System.out.println("Input value Side B");
        b = scan.nextInt();

        System.out.println("Input value Side C");
        c = scan.nextInt();

        // Check for invalid triangle conditions
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Invalid triangle: Sides must be positive integers.");
        }

        if (a+b <= c || b+c <= a|| b+c <= a ) {
            System.out.println("Invalid triangle: The sum of any two sides must be greater than the third side.");
        }

        // Check for triangle type
        if (a == b && b == c) {

            System.out.println("This is an Equilateral triangle.");
        } else if (a == b || b == c || a == c) {
            System.out.println("This is an Isosceles triangle.");;
        } else {
            System.out.println("This is a Scalene triangle.");
        }


    //  Checking if three sides can form a valid triangle
        if ((a + b > c) && (a + c > b) && (b + c > a)){
            System.out.println("Can be form tringle");}
        }





}