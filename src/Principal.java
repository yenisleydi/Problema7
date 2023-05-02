import java.util.Scanner;

public class Principal {
    public void ingresar(){
        System.out.println("---------------------------------------------------------");
        System.out.println("                          S U M A S                       ");
        System.out.println("\n");
        System.out.println("La suma de los enteros es = "+operacionSuma(5,5));
        System.out.println("La suma de los doubles es = "+operacionSuma(5.5543,6.7654));
        System.out.println("La suma de los float es = "+operacionSuma(6.8f,2.4f));
        System.out.println("La suma de los String es = "+operacionSuma("5", "7"));
        System.out.println("----------------------------------------------------------");
        System.out.println("\n");
    }
    public int operacionSuma(int a,int b){
        return a+b;
    }
    public double operacionSuma(double a,double b){
        return  a+b;
    }
    public float operacionSuma(float a, float b){
        return a+b;
    }
    public String operacionSuma(String a, String b){
        return a+b;
    }
}
