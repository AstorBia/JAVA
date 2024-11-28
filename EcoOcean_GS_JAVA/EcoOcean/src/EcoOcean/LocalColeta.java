package EcoOcean;

import EcoOcean.Materiais.MateriaisColetados;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class LocalColeta {
    protected String nomeLocalColeta;
    protected boolean finsLucrativo;
    protected String cnpj;
    protected String endereco;
    protected String responsavelLegal;
    protected String cpf;
    protected String email;
    private List<MateriaisColetados> materiaisColetados;

    public LocalColeta(String nomeLocalColeta, boolean finsLucrativo, String cnpj, String endereco,
                       String responsavelLegal, String cpf, String email) {
        this.nomeLocalColeta = nomeLocalColeta;
        this.finsLucrativo = finsLucrativo;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.responsavelLegal = responsavelLegal;
        this.cpf = cpf;
        this.email = email;
        this.materiaisColetados = new ArrayList<>();
    }

    public static boolean validarCNPJ(String cnpj) {
        return cnpj.matches("\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}");
    }

    public static boolean validarEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    public static boolean validarCPF(String cpf) {
        return cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
    }

    public void adicionarMateriais(MateriaisColetados materiais) {
        this.materiaisColetados.add(materiais);
    }

    public List<MateriaisColetados> getMateriaisColetados() {
        return materiaisColetados;
    }

    @Override
    public String toString() {
        return "LocalColeta{" +
                "nomeLocalColeta='" + nomeLocalColeta + '\'' +
                ", finsLucrativo=" + finsLucrativo +
                ", cnpj='" + cnpj + '\'' +
                ", endereco='" + endereco + '\'' +
                ", responsavelLegal='" + responsavelLegal + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", materiaisColetados=" + materiaisColetados +
                '}';
    }

    public String getNomeLocalColeta() {
        return nomeLocalColeta;
    }

    public void setNomeLocalColeta(String nomeLocalColeta) {
        this.nomeLocalColeta = nomeLocalColeta;
    }

    public boolean isFinsLucrativo() {
        return finsLucrativo;
    }

    public void setFinsLucrativo(boolean finsLucrativo) {
        this.finsLucrativo = finsLucrativo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getResponsavelLegal() {
        return responsavelLegal;
    }

    public void setResponsavelLegal(String responsavelLegal) {
        this.responsavelLegal = responsavelLegal;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
