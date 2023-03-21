import java.util.Scanner;
public class Reto3 {
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
		Double Apuesta;
		System.out.println("-------------------------");
		System.out.println("JUEGO CARA O SELLO");
		System.out.println("-------------------------");
		System.out.println("Cuanto desea Apostar: ");
		Apuesta=Teclado.nextDouble();
        System.out.println("Escoge Cara o Sello: ");
		int Seleccion=(int)(Math.random() * 2) + 1;
		System.out.print("1.cara - 2.sello ");
		int Jugador1=Teclado.nextInt();
		System.out.print("El resultado es: ");
		switch (Seleccion) {
			case 1:
				System.out.println("Cara");
				break;
			case 2:
			    System.out.println("Sello");
				break;
		}
		switch (Jugador1) {
			case 1:
				System.out.println("Cara");
				break;
			case 2:
			    System.out.println("Sello");
				break;
		}
		if (Jugador1==Seleccion){
			System.out.println("FELICIDADES");
			Apuesta=Apuesta+Apuesta;
			System.out.println("Su Premio es:" +Apuesta);
		} else {
			System.out.println("SUERTE PARA LA PROXIMA");
			Apuesta=Apuesta-Apuesta;
			System.out.println("Has Perdido: " +Apuesta	);
		}
		Teclado.close();
	}
}