package Servico;

import Entidades.T_Album;
import Entidades.T_AudioBook;
import Entidades.T_Autor;

public class ValidadorEntidades {

    T_AudioBook audioBook;
    T_Album album;
    T_Autor autor;

    public ValidadorEntidades() {
        this.audioBook = audioBook;
        this.album = album;
        this.autor = autor;
    }

    public static boolean validarT_AudioBook(T_AudioBook audioBook) {
        if (audioBook == null) {
            System.out.println("Erro: Audio book não pode ser nulo.");
            return false;
        }
        if (audioBook.getTitulo() == null || audioBook.getTitulo().isEmpty()) {
            System.out.println("Erro: O título do audio book é obrigatório.");
            return false;
        }
        if (audioBook.getCategoria() == null || audioBook.getCategoria().isEmpty()) {
            System.out.println("Erro: A categoria do audio booké obrigatória.");
            return false;
        }
        if (audioBook.getAno_lancamento() == 0) {
            System.out.println("Erro: O ano de lançamento do audio book é obrigatório.");
            return false;
        }
        return true;
    }


    public static boolean validarT_Album(T_Album album) {
        if (album == null) {
            System.out.println("Erro: Álbum não pode ser nulo.");
            return false;
        }
        if (album.getNomeAlbum() == null || album.getNomeAlbum().isEmpty()) {
            System.out.println("Erro: O nome do álbum é obrigatório.");
            return false;
        }
        return true;
    }

    public static boolean validarT_Autor(T_Autor autor) {
        if (autor == null) {
            System.out.println("Erro: Autor não pode ser nulo.");
            return false;
        }
        if (autor.getNome() == null || autor.getNome().isEmpty()) {
            System.out.println("Erro: O nome do autor é obrigatório.");
            return false;
        }
        return true;
    }


}
