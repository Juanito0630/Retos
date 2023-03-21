import java.util.Scanner;
public class Reto5 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int Cant, Edad, ID, Factura, Total=0;
        String Nom, Apell, NombreProd;
        int PrecioPro;
        System.out.println("Cantidad de Empleados a Registrar: ");
        Cant=teclado.nextInt();
        System.out.println("Nombre Empleado: ");
        Nom=teclado.next();
        System.out.println("Apellido Empleado: ");
        Apell=teclado.next();
        System.out.println("Edad Empleado: ");
        Edad=teclado.nextInt();
        System.out.println("Numero Identificacion:");
        ID=teclado.nextInt();

        System.out.println("Registro Completado");
        System.out.println("----------------------");
        System.out.println(""+Nom);
        System.out.println(""+Apell);
        System.out.println(""+ID);
        System.out.println(""+Edad);
        System.out.println("----------------------");

        for(int i=0;i<Cant;i++){
            System.out.println("Nombre del Producto");
            NombreProd=teclado.next();
            System.out.println("Precio Producto");
            PrecioPro=teclado.nextInt();
            System.out.println("¿Desea Factura? (1. si - 2. no)");
            Factura=teclado.nextInt();
            Total=PrecioPro;
        if(Factura==1){
            System.out.println("Nombre del Producto: "+NombreProd);
            System.out.println("Precio del Producto: "+PrecioPro);
            Total=Total+PrecioPro;
        }else if(Factura==2){
            System.out.println("Gracias por su Compra");
            System.out.println("¡¡¡VUELVA PRONTO!!!");
        }
        }
        teclado.close();    
    }
}
