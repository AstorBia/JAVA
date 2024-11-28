package Entidades;

import java.util.ArrayList;

public class AudioBook extends _EntidadeBase{
    private String titulo;
    private String categoria;
    private transient Album album;
    private int anoLancamento;

    public AudioBook() {
    }

    public AudioBook(String titulo, String categoria, Album album, int anoLancamento) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.album = album;
        this.anoLancamento = anoLancamento;
    }

    public AudioBook(String titulo, String categoria, int anoLancamento, ArrayList<Object> objects) {
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

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public double getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "titulo='" + titulo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", album=" + album +
                ", anoLancamento=" + anoLancamento +
                '}';
    }
}
