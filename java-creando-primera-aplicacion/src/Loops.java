import java.text.DecimalFormat;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingresa una nota: ");
            nota += sc.nextInt();
        }
        System.out.println("nota = " + df.format(nota/3));
    }
}
