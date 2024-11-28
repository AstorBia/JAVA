package Entidades;

import java.util.List;

public class T_Autor extends _EntidadeBase{
    private String nome;
    private List<T_Album> albuns;

    public T_Autor() {
    }

    public T_Autor(String idEntidade, String nome) {
        super(idEntidade);
        this.nome = nome;
    }

    public T_Autor(String idEntidade, String nome, List<T_Album> albuns) {
        super(idEntidade);
        this.nome = nome;
        this.albuns = albuns;
    }

    public T_Autor(String nome, List<T_Album> albuns) {
        this.nome = nome;
        this.albuns = albuns;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<T_Album> getAlbuns() {
        return albuns;
    }

    public void setAlbuns(List<T_Album> albuns) {
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
