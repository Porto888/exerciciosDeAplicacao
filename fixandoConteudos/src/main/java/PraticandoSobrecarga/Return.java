package PraticandoSobrecarga;

public class Return {

    public static double area(double lado) {

        return lado * lado;
    }

    public static double area(double ladoA, double ladoB) {

        return ladoA * ladoB;
    }

    public static double area(double BMaior, double bMenor, double h) {

        return ((BMaior+bMenor)*h) / 2;
    }

    public static void xpto() {

        System.out.println("Antes");
        return;
    }

    public static double abc() {
        return 1.6;
    }

}