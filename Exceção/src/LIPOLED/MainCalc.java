package LIPOLED;

import java.util.Scanner;

public class MainCalc {

	Scanner scan = new Scanner(System.in);

	int a = 1;

	Calculadora c1 = new Calculadora();
	
	while (a == 1) {
		a = 0;
		System.out.println("num");
		float num = scan.nextFloat();
		System.out.println("den");
		float den = scan.nextFloat();

		try {
			c1.divisao(num, den);
			System.out.println(c1.divisao(num, den));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			a = 1;

		}
	}
}

