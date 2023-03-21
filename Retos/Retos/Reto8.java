import java.util.Scanner;
public class Reto8{
    public static void main(String[] args) {
        String Nombre, Apellido, Doc, Correo, Aux;
        int Edad, NumDoc, Estrato, Cant, Tel;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Escribe la cantidad de Aprendices a registrar:");
        Cant=teclado.nextInt();
        for (int i=0;i<Cant;i++){
        System.out.println("Elige tu Tipo de Documento: (TI)(CC)");
        Doc=teclado.next();
        System.out.println("Escribe tu Numero de Documento:");
        NumDoc=teclado.nextInt();
        System.out.println("Escribe tu Nombre:");
        Nombre=teclado.next();
        System.out.println("Escribe tu Apellido:");
        Apellido=teclado.next();
        System.out.println("Digita tu Edad:");
        Edad=teclado.nextInt();
        System.out.println("Escribe tu Correo:");
        Correo=teclado.next();
        System.out.println("Digita tu Numero Telefonico:");
        Tel=teclado.nextInt();
        System.out.println("Escribe el Auxilio que necesitas:");
        Aux=teclado.next();
        System.out.println("Digita tu Estrato (1 - 6)");
        Estrato=teclado.nextInt();
        if(Estrato==1){
            System.out.println("El aprendiz: "+Nombre);
            System.out.println("De Documento " +Doc+ " Numero "+NumDoc);
            System.out.println("Edad: " +Edad+ "Años");
            System.out.println("Se ha Registrado Correctamente, se le estara informando por el correo "+Correo+" o al telefono "+Tel);
        }else if(Estrato==2){
            System.out.println("El aprendiz: "+Nombre);
            System.out.println("De Documento " +Doc+ " Numero "+NumDoc);
            System.out.println("Edad: " +Edad+ "Años");
            System.out.println("Se ha Registrado Correctamente, se le estara informando por el correo "+Correo+" o al telefono "+Tel);
            }else if(Estrato==3){
            System.out.println("El aprendiz: "+Nombre);
            System.out.println("De Documento " +Doc+ " Numero "+NumDoc);
            System.out.println("Edad: " +Edad+ "Años");
            System.out.println("Se ha Registrado Correctamente, se le estara informando por el correo "+Correo+" o al telefono "+Tel);
            }else if(Estrato==4){
                System.out.println("El Aprendiz " +Nombre+ " " +Apellido+ " No ha podido ser Registrado para: "+Aux);
            }else if(Estrato==5){
                System.out.println("El Aprendiz " +Nombre+ " " +Apellido+ " No ha podido ser Registrado para: "+Aux);
            }else if(Estrato==6){
                System.out.println("El Aprendiz " +Nombre+ " " +Apellido+ " No ha podido ser Registrado para: "+Aux);
            }
        }
        teclado.close();
    }
}