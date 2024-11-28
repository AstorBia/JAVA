package Repositorio;

import Entidades.Album;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlbumRepositorio extends _RepositorioBaseImpl{

    public AlbumRepositorio() {}

    List<Album> lista = new ArrayList();

    // ADICIONA
    public void adicionar(Scanner scanner, List<Album> lista){
        System.out.println("Insira o Nome do Album: ");
        String nomeAlbum = scanner.next();

        lista.add(new Album(nomeAlbum, new ArrayList<>()));
    }

    // LISTA
    public void listar(List<Album> listaAlbum){
        System.out.println("== Lista de Albuns ==");
        for (Album album: listaAlbum){
            System.out.println("Nome do Album: "+album.getNomeAlbum());
        }
    }

    // BUSCA
    public List<Album> findByAlbum(String nomeAlbum){
        return lista;
    }

}
