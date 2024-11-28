package Entidades;

import java.util.ArrayList;

public class T_AudioBook extends _EntidadeBase{
    private String titulo;
    private String categoria;
    private transient T_Album album;
    private int ano_lancamento;

    public T_AudioBook() {
    }

    public T_AudioBook(String idEntidade, String titulo, String categoria, T_Album album, int ano_lancamento) {
        super(idEntidade);
        this.titulo = titulo;
        this.categoria = categoria;
        this.album = album;
        this.ano_lancamento = ano_lancamento;
    }

    public T_AudioBook(String idEntidade, String titulo, String categoria, int ano_lancamento) {
        super(idEntidade);
        this.titulo = titulo;
        this.categoria = categoria;
        this.ano_lancamento = ano_lancamento;
    }

    public T_AudioBook(String titulo, String categoria, T_Album album, int anoLancamento) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.album = album;
        this.ano_lancamento = ano_lancamento;
    }

    public T_AudioBook(String titulo, String categoria, int anoLancamento, ArrayList<Object> objects) {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public T_Album getAlbum() {
        return album;
    }

    public void setAlbum(T_Album album) {
        this.album = album;
    }

    public int getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(int ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "titulo='" + titulo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", album=" + album +
                ", ano_lancamento=" + ano_lancamento +
                '}';
    }
}
