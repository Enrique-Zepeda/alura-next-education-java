package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.model.Episodio;
import com.aluracursos.screenmatch.model.Pelicula;
import com.aluracursos.screenmatch.model.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("SpiderMan",2002);
        miPelicula.setDuracionEnMinutos(121);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(9.8);
        miPelicula.evalua(10);
        System.out.println("Total Evaluaciones:" + miPelicula.getTotalDeLasEvaluaciones());
        System.out.println("Media:" + miPelicula.calculaMedia());
//        System.out.println(miPelicula.getNombre());
        System.out.println("*****************************");

        Serie casaDragon = new Serie("La casa del dragon",2022);

        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Cars",2006);
        otraPelicula.setDuracionEnMinutos(117);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("-----------------------------");
        System.out.println("Tiempo necesario para ver tus titulos favoritos "+calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);
        Episodio episodio = new Episodio();
        episodio.setNombre("La casa Targaryen");
        episodio.setNumero(1);
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);

        var peliculaDeBruno = new Pelicula("El señor de los anilos",2001);
        peliculaDeBruno.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.getFirst().getNombre());
        System.out.println("Lista de peliculas: " + listaDePeliculas);

        System.out.println(listaDePeliculas.toString());
        System.out.println("toString de la pelicula" + listaDePeliculas.get(0).toString());


    }
}
