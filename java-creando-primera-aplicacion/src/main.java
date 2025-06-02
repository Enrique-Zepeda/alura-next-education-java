import java.text.DecimalFormat;

public class main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Bienvenido a Screen Match");
        System.out.println("Pelicula: Matrix");
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        System.out.println("fechaDeLanzamiento = " + fechaDeLanzamiento);
        System.out.println("incluidoEnElPlan = " + incluidoEnElPlan);
        System.out.println("notaDeLaPelicula = " + notaDeLaPelicula);

        double media = (8.2 + 6.0 + 9.0) / 3;

        System.out.println("La media es = " + df.format( media));

        String sinopsis = """
        Matrix es una paradoja
        La mejor película del fin del milenio
        Fue lanzada en:  """ + fechaDeLanzamiento + """
        
        Con la media de:  """ + df.format(media);

        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);
        float cambiar = (float) media;
        char change = (char) (media/2);
        System.out.println("clasificacion = " + clasificacion);

    }
}
