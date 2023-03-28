package PraticandoSobrecarga;

public class CalculadoraGeometrica {

	public static void area(double lado) {

		System.out.println("Área do quadrado é: " + lado * lado);
	}

	public static void area(double ladoA, double ladoB) {

		System.out.println("Área do retângulo é: " + ladoA * ladoB);
	}

	public static void area(double B, double b, double h) {

		System.out.println("Área do trapézio é: " + ((B + b) * h) / 2);
	}

	public static void area(float diagonal1, float diagonal2) {

		System.out.println("Área do losango é: " + (diagonal1 * diagonal2) / 2);
	}

}

