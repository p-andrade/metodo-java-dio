package Retornos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercícios de Retornos: ");

        double areaQuadrado = Quadrilatero.area(4);
        System.out.println("Área do Quadrado é " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(4d,6d);
        System.out.println("Área do Retângulo é " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(10,8,6);
        System.out.println("Área do Trápezio é " + areaTrapezio);

        double areaLosangulo = Quadrilatero.area(6f,4f);
        System.out.println("Área do Losangulo é " + areaLosangulo);
    }
}
