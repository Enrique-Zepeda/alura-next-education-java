import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limiteTarjeta = 0, opc = 0, valorProducto = 0;
        String producto;
        String ultimaClave = "";
        HashMap<String, Integer> productos = new HashMap<>();
        System.out.println("App de compras");
        System.out.print("Escriba el limite de la tarjeta:");
        limiteTarjeta = sc.nextInt();
        sc.nextLine();

        do{
            System.out.print("Escriba descripcion de la compra:");
            producto = sc.nextLine();
            System.out.print("Escriba el valor del producto: ");
            valorProducto = sc.nextInt();
            sc.nextLine();
            limiteTarjeta -= valorProducto;
            ultimaClave = producto;
            productos.put(producto,valorProducto);
            if (limiteTarjeta < 0) {
                productos.remove(ultimaClave);
                limiteTarjeta += valorProducto;
                System.out.println("Saldo suficiente");
                break;
            }
            System.out.println("Compra realizada");
            System.out.print("Escriba 0 para salir o 1 para continuar: ");
            opc = sc.nextInt();
            sc.nextLine();
        }while(opc != 0);


        System.out.println("Compras Realizadas");
        System.out.println("-----------------------------------------------------");
        // Convertir a lista de entradas
        List<Map.Entry<String, Integer>> listaOrdenada = new ArrayList<>(productos.entrySet());

        // Ordenar por valor (de menor a mayor)
        listaOrdenada.sort(Map.Entry.comparingByValue());

        // Imprimir en orden
        System.out.println("Productos ordenados por precio:");
        for (Map.Entry<String, Integer> entrada : listaOrdenada) {
            System.out.println(entrada.getKey() + " cuesta " + entrada.getValue());
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Tu saldo es:" + limiteTarjeta);
    }
}
