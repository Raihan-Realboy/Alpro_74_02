package ch05;

import java.util.Scanner;

public class Soal_7A {

    public static void main(String[] args) {
	
	// Algoritma Euclidean

        int a, b, c;
        Scanner ras = new Scanner(System.in);
		System.out.print("a : ");
        a = ras.nextInt();
		
		System.out.print("b : ");
		b = ras.nextInt();

        c = a % b;

        while (c != 0){

            a = b;
            b = c;
            c = b % c;
        }

        System.out.println("FPB = " + b);

    }

}