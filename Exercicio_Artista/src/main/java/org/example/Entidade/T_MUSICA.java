package org.example.Entidade;

public class T_MUSICA {
    int idMusica;
    String nome;
    int duracao;

    public T_MUSICA() {
    }

    public T_MUSICA(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public T_MUSICA(int idMusica, String nome, int duracao) {
        this.idMusica = idMusica;
        this.nome = nome;
        this.duracao = duracao;
    }

    public int getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(int idMusica) {
        this.idMusica = idMusica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "T_MUSICA{" +
                "id_musica=" + idMusica +
                ", nome='" + nome + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}
