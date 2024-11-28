package Operacional;

import Entidades.T_Album;
import Entidades.T_AudioBook;
import Entidades.T_Autor;
import Repositorio.AudioBookRepositorio;
import Repositorio.AudioBookRepositorio;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuOperacoes {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789#@$%&*";
    private SecureRandom random = new SecureRandom();

    Scanner scanner = new Scanner(System.in);

    public T_Autor cadastrarAutor(){
        T_Autor autor = new T_Autor();

        System.out.println("Digite o nome do Autor: ");
        autor.setNome(scanner.nextLine());

        int idLength = 5;
        StringBuilder idBuilder = new StringBuilder(idLength);
        for (int i = 0; i < idLength; i++) {
            int index = random.nextInt(CHARACTERS.length());
            idBuilder.append(CHARACTERS.charAt(index));
        }
        autor.setIdEntidade(idBuilder.toString()); // Definindo o ID gerado
        return autor;
    }

    public T_Album cadastrarAlbum() {
        T_Album album = new T_Album();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do album: ");
        album.setNomeAlbum(scanner.nextLine());

        int idLength = 5;
        StringBuilder idBuilder = new StringBuilder(idLength);
        for (int i = 0; i < idLength; i++) {
            int index = random.nextInt(CHARACTERS.length());
            idBuilder.append(CHARACTERS.charAt(index));
        }
        album.setIdEntidade(idBuilder.toString());

        return album;
    }

    public T_AudioBook cadastrarAudioBook() {
        T_AudioBook audioBook = new T_AudioBook();

        System.out.println("Digite o Título: ");
        audioBook.setTitulo(scanner.nextLine());
        System.out.println("Digite a Categoria: ");
        audioBook.setCategoria(scanner.nextLine());
        System.out.println("Digite o Ano de Lançamento: ");
        audioBook.setAno_lancamento(scanner.nextInt());
        scanner.nextLine();

        int idLength = 9;
        StringBuilder idBuilder = new StringBuilder(idLength);
        for (int i = 0; i < idLength; i++) {
            int index = random.nextInt(CHARACTERS.length());
            idBuilder.append(CHARACTERS.charAt(index));
        }
        audioBook.setIdEntidade(idBuilder.toString()); // Definindo o ID gerado
        return audioBook;


    }

    public void buscarCategoria(){
        AudioBookRepositorio audioBookRepositorio = new AudioBookRepositorio();
        System.out.println("Digite o nome da CATEGORIA: ");
        String categoria = scanner.nextLine();

        if (categoria == null || categoria.isEmpty()) {
            System.out.println("Categoria Inválida ou Inexistente!");
            return;
        }

        List<T_AudioBook> audioBooks = new ArrayList<>();

        for (T_AudioBook book : audioBookRepositorio.GetByCategoria(categoria)) {
            if (book.getCategoria() != null && book.getCategoria().equalsIgnoreCase(categoria)) {
                audioBooks.add(book);
            }
        }
        if (audioBooks.isEmpty()) {
            System.out.println("Nenhum audio book encontrado para a categoria " + categoria);

        }else{
            System.out.println(">> Audio Book na Categoria: " +categoria+ ":");
            for (T_AudioBook book : audioBooks){
                System.out.println(book.getTitulo());
            }
        }
    }


    public void buscarAnoLancamento(){
        AudioBookRepositorio audioBookRepositorio = new AudioBookRepositorio();

        System.out.println(" Informe o Ano de lançamento que deseja consultar");
        int ano_lancamento = scanner.nextInt();
        scanner.nextLine();

        T_AudioBook audioBook = audioBookRepositorio.GetByAnoLancamento(ano_lancamento);

        if (audioBook == null) {
            System.out.println("Nenhum audio book encontrado!");

        }else{
            System.out.println("Ano de Lançamento do audio book" + ano_lancamento);
            System.out.println(">> Titulo: " + audioBook.getTitulo());
        }
    }







}
