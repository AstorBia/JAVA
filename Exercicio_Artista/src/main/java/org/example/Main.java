package org.example;

import org.example.Entidade.T_ARTISTA;
import org.example.Entidade.T_MUSICA;
import org.example.Repositorios.ArtistaRepositorio;
import org.example.Repositorios.MusicaRepositorio;

import java.util.ArrayList;
import java.util.List;


public class Main {
    List<T_MUSICA> musicas = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Insert no Oracle");

        var artistaRepositorio = new ArtistaRepositorio();
        var musicaRepositorio = new MusicaRepositorio();

        var artista = new T_ARTISTA( "Tracy Chapman 2", "Soul");
        var musica = new T_MUSICA("Across the lines", 3);



//        artistaRepositorio.Insert(artista);
//        musicaRepositorio.Insert(musica);
//        artistaRepositorio.Update(artista, 1);
//          artistaRepositorio.Delete(2);
//        System.out.println(artistaRepositorio.GetAll());
        System.out.println(musicaRepositorio.GetAll());
    }
}