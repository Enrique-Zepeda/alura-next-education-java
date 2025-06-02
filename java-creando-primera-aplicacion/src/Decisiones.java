public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String plan = "plus";

        if (fechaDeLanzamiento > 2022) {
            System.out.println("Peliculas mas populares");
        }else {
            System.out.println("Peliculas retro que aun valen la pena");
        }

        if (incluidoEnElPlan && plan.equals("plus")) {
            System.out.println("Disfrute su pelicula");
        }else{
            System.out.println("Pelicula no disponible para su plan actual");
        }

    }
}
