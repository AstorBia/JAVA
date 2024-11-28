package Entidades;

import java.util.List;

public class Autor extends _EntidadeBase{
    private String nome;
    private List<Album> albuns;

    public Autor() {
    }

    public Autor(String nome, List<Album> albuns) {
        this.nome = nome;
        this.albuns = albuns;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Album> getAlbuns() {
        return albuns;
    }

    public void setAlbuns(List<Album> albuns) {
        this.albuns = albuns;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", albuns=" + albuns +
                '}';
    }
}
