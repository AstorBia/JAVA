package fiap.logs;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;
    private String[] telefone;
    private ArrayList<Endereco> endereco;


    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String[] telefone, ArrayList<Endereco> endereco) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.endereco = endereco;
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

    public ArrayList<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(ArrayList<Endereco> endereco) {
        this.endereco = endereco;
    }
}
