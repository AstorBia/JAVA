package Entidades;

import Repositorio.AlbumRepositorio;
import Repositorio.AudioBookRepositorio;
import Repositorio.AutorRepositorio;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private Object scanner;

    public void mostraMenu(Scanner scanner, List<Album> albuns, List<Autor> autores, List<AudioBook> books){

        AutorRepositorio autorRepositorio = new AutorRepositorio();
        AlbumRepositorio albumRepositorio = new AlbumRepositorio();
        AudioBookRepositorio audioBookRepositorio = new AudioBookRepositorio();


        int escolha;

        while(true){

        System.out.println("Escolha a opção desejada!");

        System.out.println("""
                1 - Adicionar novo AUTOR
                2 - Adicionar novo ÁLBUM
                3 - Adicionar novo AUDIO BOOK
                4 - Listar todos os Autores, Álbuns, Audio Books
                5 - Buscar por Categoria
                6 - Buscar por Ano de Lançamento
                7 - SAIR DO SISTEMA
                """);

        escolha = scanner.nextInt();
        scanner.nextLine();

        switch (escolha) {
            case 1:
                System.out.println(">> ADICIONE NOVO AUTOR <<");
                autorRepositorio.adicionar(scanner, autores);
                break;
            case 2:
                System.out.println(">> ADICIONE NOVO ÁLBUM <<");
                albumRepositorio.adicionar(scanner, albuns);
                break;
            case 3:
                System.out.println(">> ADICIONE NOVO AUDIO BOOK <<");
                audioBookRepositorio.adicionar(scanner, books);
                break;
            case 4:
                System.out.println(">> LISTA DOS AUTORES, ÁLBUNS E AUDIO BOOKS <<");
                autorRepositorio.listar(autores);
                albumRepositorio.listar(albuns);
                audioBookRepositorio.listar();
                break;
            case 5:
                System.out.println(">> BUSCA POR CATEGORIA <<");
                System.out.println(">> INFORME A CATEGORIA: ");
                String categoria = scanner.nextLine();
                List<AudioBook> porCategoria = audioBookRepositorio.findByAudioBook(categoria, -1);
                for (AudioBook audioBook : porCategoria) {
                    System.out.println(audioBook);
                }
                break;

            case 6:
                System.out.println(">> BUSCA POR ANO DE LANÇAMENTO <<");
                System.out.println(">> INFORME O ANO DE LANÇAMENTO: ");
                int anolancamento = scanner.nextInt();
                scanner.nextLine();  // Limpar o buffer do scanner
                List<AudioBook> anoLanc = audioBookRepositorio.findByAudioBook("", anolancamento);
                for (AudioBook audioBook : anoLanc) {
                    System.out.println(audioBook);
                }
                break;
            case 7:
                System.out.println("==== SAIR DO SISTEMA ====");
                return;
            default:
                System.out.println("!!! OPÇÃO INVÁLIDA !!!");

            }
        }
    }
}
