package Operacional;

import Entidades.T_Album;
import Entidades.T_AudioBook;
import Entidades.T_Autor;
import Repositorio.AlbumRepositorio;
import Repositorio.AudioBookRepositorio;
import Repositorio.AutorRepositorio;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private Object scanner;

    public void mostraMenu(Scanner scanner){

        AutorRepositorio autorRepositorio = new AutorRepositorio();
        AlbumRepositorio albumRepositorio = new AlbumRepositorio();
        AudioBookRepositorio audioBookRepositorio = new AudioBookRepositorio();
        MenuOperacoes menuOperacoes = new MenuOperacoes();

        int escolha;

        while(true){

        System.out.println("Escolha a opção desejada!");

        System.out.println("""
                1 - Adicionar novo AUTOR
                2 - Adicionar novo ÁLBUM
                3 - Adicionar novo AUDIO BOOK
                4 - Listar todos os Autores, Álbuns, Audio Books
                5 - Buscar Audio Book por Categoria
                6 - Buscar Album por Ano de Lançamento
                7 - EXCLUIR AUDIO BOOK
                8 - SAIR DA LIVRARIA
                """);

        escolha = scanner.nextInt();
        scanner.nextLine();

        switch (escolha) {
            case 1:
                System.out.println(">> ADICIONE NOVO AUTOR <<");
                T_Autor novoAutor = menuOperacoes.cadastrarAutor();
                autorRepositorio.Adicionar(novoAutor);
                break;

            case 2:
                System.out.println(">> ADICIONE NOVO ÁLBUM <<");
                T_Album novoAlbum = menuOperacoes.cadastrarAlbum();
                albumRepositorio.Adicionar(novoAlbum);
                break;

            case 3:
                System.out.println(">> ADICIONE NOVO AUDIO BOOK <<");
                T_AudioBook novoAudioBook = menuOperacoes.cadastrarAudioBook();
                audioBookRepositorio.Adicionar(novoAudioBook);
                break;

            case 4:
                System.out.println(">> LISTA DOS AUTORES E AUDIO BOOK <<");
                System.out.println("\nAutores");
                autorRepositorio.Listar();
                System.out.println("\n Audio Books");
                audioBookRepositorio.Listar();
                break;

            case 5:
                 System.out.println(">> BUSCAR AUDIO BOOKS POR CATEGORIA <<");
                 System.out.println(">> INFORME A CATEGORIA <<");
                 menuOperacoes.buscarCategoria();
                break;

            case 6:
                System.out.println(">> BUSCAR ALBUM POR ANO DE LANÇAMENTO <<");
                System.out.println(">> INFORME O ANO DE LANÇAMENTO << ");
                menuOperacoes.buscarAnoLancamento();
                break;

            case 7:
                System.out.println(">> EXCLUIR AUDIO BOOK <<");
                System.out.println(">> INFORME O ID DO AUDIO BOOK A SER EXCLUIDO: ");
                String rsId = scanner.nextLine();
                audioBookRepositorio.Delete(rsId);
                return;

            case 8:
                System.out.println("==== SAIR DA LIVRARIA ====");
                return;
            default:
                System.out.println("!!! OPÇÃO INVÁLIDA !!!");

            }
        }
    }
}
