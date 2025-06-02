import java.text.DecimalFormat;
import java.util.Scanner;

public class conversiónDeTemperaturas {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Conversion de temperaturas");
        var consola = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en grados celsius: ");
        double celcius = consola.nextDouble();
        double temperaturaFahrenheit = (celcius * 1.8) + 32;
        System.out.println("La temperatura en grados Fahrenheit es: = " + df.format(temperaturaFahrenheit));
        int tempInt = (int) temperaturaFahrenheit;
        System.out.println("La temperatura en grados Fahrenheit(INT) es: = " + tempInt);

    }
}
