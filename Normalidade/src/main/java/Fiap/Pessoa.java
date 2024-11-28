package Fiap;

import java.util.ArrayList;
import java.util.Arrays;

public class Pessoa {
    private String nome;
    private int idade;
    private String[] telefone;
    private ArrayList<Endereco> enderecos;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String[] telefone, ArrayList<Endereco> enderecos) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.enderecos = enderecos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String[] getTelefone() {
        return telefone;
    }

    public void setTelefone(String[] telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", telefone=" + Arrays.toString(telefone) +
                ", enderecos=" + enderecos +
                '}';
    }
}

// referencia citrica
//