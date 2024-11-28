package org.example.Entidade;

import java.util.List;

public class T_ARTISTA {
    private int id;
    private String nome;
    private String genero;

    private List<T_MUSICA> listaMusica;

    public T_ARTISTA() {
    }

    public T_ARTISTA(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public T_ARTISTA(int id, String nome, String genero) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
    }

    public T_ARTISTA(int id, String nome, String genero, List<T_MUSICA> listaMusica) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.listaMusica = listaMusica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<T_MUSICA> getListaMusica() {
        return listaMusica;
    }

    public void setListaMusica(List<T_MUSICA> listaMusica) {
        this.listaMusica = listaMusica;
    }

    @Override
    public String toString() {
        return "T_ARTISTA{" +
                "id =" + id +
                ", nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", listaMusica=" + listaMusica +
                '}';
    }
}
