import java.util.Random;
import java.util.Scanner;

public class juegoDeAdivinación {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int intentos = 0;
        int num = 0;
        System.out.println("--------- Juego de adivinansa ---------");
//        System.out.println("numeroSecreto = " + numeroSecreto);
        System.out.println("Tienes 5 intentos");
        while (intentos < 5){
            System.out.print("Ingresa un numero:");
            num = sc.nextInt();
            if (num == numeroSecreto){
                System.out.println("Ganaste");
                break;
            }
            intentos++;
            System.out.println("intentos " + intentos);
        }
    }
}
