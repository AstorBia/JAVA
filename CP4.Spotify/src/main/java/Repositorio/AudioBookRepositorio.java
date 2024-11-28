package Repositorio;

import Entidades.Album;
import Entidades.AudioBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AudioBookRepositorio extends _RepositorioBaseImpl{

    List<AudioBook> audioBooks = new ArrayList<>();

    public AudioBookRepositorio() {}

    //adicionar
    public void adicionar (Scanner scanner, List<AudioBook> lista){
        System.out.println("Insira o Título do Audio Book: ");
        String titulo = scanner.nextLine();

        System.out.println("Insira a Categoria do Audio Book: ");
        String categoria = scanner.nextLine();

        System.out.println("Qual o Ano de Lançamento do Audio Book? ");
        int anoLancamento = scanner.nextInt();

        audioBooks.add(new AudioBook(titulo, categoria, anoLancamento, new ArrayList<Object>()));
        System.out.println("Informações adicionadas: "+ titulo + categoria + anoLancamento);
    }

    //listar
     public void listar(List<AudioBook> audioBooks){
        System.out.println("== Lista de Audio Book ==");
        for (AudioBook audioBook : audioBooks) {
            System.out.println("Tiulo: " + audioBook.getTitulo());
            System.out.println("Categoria: "+audioBook.getCategoria());
            System.out.println("Ano Lançamento: "+audioBook.getAnoLancamento());
        }
    }


    // buscar

    public List<AudioBook> findByAudioBook(String categoria, int anoLancamento) {
        List<AudioBook> resultado = new ArrayList<>();

        for (AudioBook audioBook : audioBooks) {
            if ((categoria == null || categoria.isEmpty() || audioBook.getCategoria().equalsIgnoreCase(categoria)) &&
                    (anoLancamento == -1|| audioBook.getAnoLancamento() == anoLancamento)) {
                    resultado.add(audioBook);
            } // O -1 é pq se trata de uma variavel INT que será anulada se a busca for por categoria
        }
        return resultado;
    }

}
