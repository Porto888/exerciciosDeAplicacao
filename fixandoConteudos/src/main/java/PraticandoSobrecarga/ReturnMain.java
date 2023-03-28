package PraticandoSobrecarga;

public class ReturnMain {


	public static void main(String[] args) {
		
		
        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Return.area(9);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Return.area(55,25);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Return.area(9,9,9);
        System.out.println("Área do trapézio:" + areaTrapezio);


	}

}
