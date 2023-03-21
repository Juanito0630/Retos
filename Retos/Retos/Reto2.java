import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        String Doctor, Madre, Bebe;
        Double PesoBB, MesAct, MesNac, Meses, Rta1, Rta2;
        Double Dosis_Vacuna;
        Double Resultado;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nombre Doctor: ");
        Doctor=teclado.next();
        System.out.println("Nombre Madre: ");
        Madre=teclado.next();
        System.out.println("Nombre Bebe: ");
        Bebe=teclado.next();
        System.out.println("Peso Bebe: ");
        PesoBB=teclado.nextDouble();
        System.out.println("Mes Actual del Bebe: ");
        MesAct=teclado.nextDouble();
        System.out.println("Mes de Nacimiento del Bebe: ");
        MesNac=teclado.nextDouble();

        Resultado=MesAct-MesNac;
        Rta1=(Resultado+10);
        Rta2=PesoBB+15;
        Dosis_Vacuna=PesoBB+Resultado*8;

        System.out.println("Doctor: "+Doctor);
        System.out.println("Madre: "+Madre);
        System.out.println("Nombre Bebe: "+Bebe);
        System.out.println("Meses del Bebe: "+Resultado);
        System.out.println("Dosis: "+Dosis_Vacuna);
        teclado.close();
    }    
}