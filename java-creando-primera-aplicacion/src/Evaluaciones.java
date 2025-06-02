import java.text.DecimalFormat;
import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double nota = 0;
        double mediaEvaluaciones = 0;
        int contador = 0;

        while (nota != -1){
            System.out.print("Ingresa una nota: ");
            nota = sc.nextInt();
            if (nota != -1) {
                mediaEvaluaciones += nota;
                contador++;
            }

        }

        System.out.println("nota = " + df.format(mediaEvaluaciones/contador));
    }
}
