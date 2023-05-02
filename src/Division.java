public class Division {
    public void ingresar(){
        System.out.println("---------------------------------------------------------");
        System.out.println("                      D I V I S I O N                    ");
        System.out.println("\n");
        System.out.println("La division de los enteros es = "+operacionSuma(5,5));
        System.out.println("La division de los doubles es = "+operacionSuma(5.5543,6.7654));
        System.out.println("La division de los float es = "+operacionSuma(6.87f,2.44f));
        System.out.println("----------------------------------------------------------");

    }
    public int operacionSuma(int a,int b){
        return a/b;
    }
    public double operacionSuma(double a,double b){
        return  a/b;
    }
    public float operacionSuma(float a, float b){
        return a/b;
    }

}
