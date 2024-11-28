package fiap.logs;

public class Endereco {
    private String logradouro;
    private String numero;
    private  String bairro;
    private String cidade;
    private transient Pessoa pessoa;

    public Endereco() {
    }

    public Endereco(String logradouro, String numero, String bairro, String cidade, Pessoa pessoa) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.pessoa = pessoa;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", pessoa=" + pessoa +
                '}';
    }
}
