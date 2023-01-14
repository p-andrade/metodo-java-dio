package Sobrecarga;

public class Quadrilatero {
    public static void area(double lado){
        System.out.println("Área do quadrado é " + (lado * lado));
    }
    public static void area(double ladoA, double ladoB){
        System.out.println("Área do retângulo é "+ (ladoA * ladoB));
    }
    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trápezio é " + ((baseMaior + baseMenor)*altura)/2);
    }
    public static void area(float diagonalMaior, float diagonalMenor){
        System.out.println("Área do losangulo é " + ((diagonalMaior*diagonalMenor)/2));
    }
}
