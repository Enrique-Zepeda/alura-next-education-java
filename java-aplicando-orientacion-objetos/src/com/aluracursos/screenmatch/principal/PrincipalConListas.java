package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.model.Pelicula;
import com.aluracursos.screenmatch.model.Serie;
import com.aluracursos.screenmatch.model.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("SpiderMan",2002);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Cars",2006);
        otraPelicula.evalua(6);
        var peliculaDeBruno = new Pelicula("El señor de los anilos",2001);
        peliculaDeBruno.evalua(10);
        Serie casaDragon = new Serie("La casa del dragon",2022);

        Pelicula p1 = peliculaDeBruno;

        List<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(casaDragon);

        for (Titulo item: lista){
            System.out.println("Titulo:" + item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 3) {
//            Pelicula pelicula = (Pelicula) item;
            System.out.println("Clasificacion:" + pelicula.getClasificacion());
            }

        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");
        System.out.println("listaDeArtistas no ordenada = " + listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("listaDeArtistas ordenada = " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("lista Ordenada = " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("lista ordenada por fecha = " + lista);
    }
}
