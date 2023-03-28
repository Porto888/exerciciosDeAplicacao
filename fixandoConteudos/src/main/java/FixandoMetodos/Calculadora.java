package FixandoMetodos;

public class Calculadora {

	public static void soma(double numero1, double numero2) {

		double resultado = numero1 + numero2;
		System.out.println("O resultado da operaçã é " + numero1 + " mais " + numero2 + " é " + resultado);

	}

	public static void subtracao(double numero1, double numero2) {

		double resultado = numero1 - numero2;
		System.out.println("O resultado da operaçã é " + numero1 + " menos " + numero2 + " é " + resultado);

	}

	public static void divisao(double numero1, double numero2) {

		double resultado = numero1 / numero2;
		System.out.println("O resultado da operaçã é " + numero1 + " dividido por " + numero2 + " é " + resultado);

	}

	public static void multiplicação(double numero1, double numero2) {

		double resultado = numero1 * numero2;
		System.out.println("O resultado da operaçã é " + numero1 + " vezes " + numero2 + " é " + resultado);
	}
}