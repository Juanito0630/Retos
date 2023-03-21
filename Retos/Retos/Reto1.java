import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double C = 0;
        double K = 0;
    System.out.print("Por favor escriba los grados en Celsius: ");
    C = input.nextDouble();
    K = (C+273.15);
    System.out.print("Los grados en Kelvin son: " +K);
input.close();
    }    
}