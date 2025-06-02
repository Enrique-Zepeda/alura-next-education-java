import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Escribe el nombre de tu pelicula:");
        String pelicula = consola.nextLine();
        System.out.print("Ahora escribe la fecha de lanzamiento:");
        int fechaLanzamiento = consola.nextInt();
        System.out.print("Que nota le das a esta pelicula:");
        double nota = consola.nextDouble();

        System.out.println("pelicula = " + pelicula);
        System.out.println("fechaLanzamiento = " + fechaLanzamiento);
        System.out.println("nota = " + nota);
    }
}
