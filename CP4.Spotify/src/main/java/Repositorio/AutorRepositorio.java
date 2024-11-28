package Repositorio;

import Entidades.Autor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AutorRepositorio extends _RepositorioBaseImpl{

    public AutorRepositorio(){}

    List<Autor> listaAutor = new ArrayList();

    public void adicionar (Scanner scanner, List<Autor> lista){
        System.out.println("Digite o Nome do Autor: ");
        String nome = scanner.nextLine();

        lista.add(new Autor(nome, new ArrayList<>()));

    }

    public void listar(List<Autor> listaAutor) {
            System.out.println("== Lista de Autor ==");
            for (Autor autor: listaAutor){
                System.out.println("Nome do Autor: "+autor.getNome());
            }
    }
}
