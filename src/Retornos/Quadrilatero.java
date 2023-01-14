package Retornos;

public class Quadrilatero {
    public static double area(double lado){
        return lado*lado;
    }
    public static double area(double ladoA,double ladoB){
        return ladoA*ladoB;
    }
    public static double area(double baseMaior, double baseMenor, double altura){
        return ((baseMaior+baseMenor)*altura)/2;
    }
    public static float area(float diagonalMaior, float diagonalMenor){
        return (diagonalMaior*diagonalMenor)/2;
    }
    public static void xpot(){
        System.out.println("Antes ");
        return;
    }
    public static double abc(){
        return 1.6;
    }
}
