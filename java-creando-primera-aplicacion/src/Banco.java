import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        System.out.println("----------- B A N C O -----------");
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        double saldo = 1599.50;

        do{
            System.out.println("** M E N U **");
            System.out.println("1. Consultar saldo ");
            System.out.println("2. Retirar");
            System.out.println("3. Depositar");
            System.out.println("9. Salir");
            System.out.print("Ingresa una opcion:");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println(saldo);
                    break;
                case 2:
                    System.out.print("Cuanto desea retirar: ");
                    double retirar = sc.nextDouble();
                    if (retirar > saldo){
                        System.out.println("Saldo insuficiente");
                    }else {
                        saldo -= retirar;
                        System.out.println("Retiro hecho con exito");
                    }
                    break;
                case 3:
                    System.out.print("Cuanto desea depositar: ");
                    double depositar = sc.nextDouble();
                    saldo += depositar;
                    System.out.println("Deposito hecho con exito");
                    break;
                case 9:
                    System.out.println("Saliendo de la app");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }while(opc != 9);
    }
}
