package Servico;

import Entidades.Album;
import Entidades.AudioBook;
import Entidades.Autor;

public class ValidadorEntidades {

    AudioBook audioBook;
    Album album;
    Autor autor;

    public ValidadorEntidades() {
        this.audioBook = audioBook;
        this.album = album;
        this.autor = autor;
    }

    private boolean ValidadorEntidade(AudioBook audioBook) {
        System.out.println(">> Audio Book NÃO Cadastrado <<");
        return false;
    }

    private boolean ValidadorEntidade(Album album) {
        System.out.println(">> Album NÃO Cadastrado <<");
        return false;
    }

    private boolean ValidadorEntidade(Autor autor) {
        System.out.println(">> Autor NÃO Cadastrado <<");
        return false;
    }

}
