package EcoOcean;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class EmpresaCompradora {
    private String nomeEmpresaCompradora;
    private String cnpj;
    private String responsavelLegal;
    private String cpf;
    private String email;
    private List<MateriaisComprados> materiaisComprados;

    public EmpresaCompradora(String nomeEmpresaCompradora, String cnpj, String responsavelLegal, String cpf, String email) {
        this.nomeEmpresaCompradora = nomeEmpresaCompradora;
        this.cnpj = cnpj;
        this.responsavelLegal = responsavelLegal;
        this.cpf = cpf;
        this.email = email;
        this.materiaisComprados = new ArrayList<>();
    }

    public void adicionarMateriaisComprados(MateriaisComprados materialComprado) {
        this.materiaisComprados.add(materialComprado);
    }

    public static boolean validarCNPJ(String cnpj) {
        return cnpj.matches("\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}");
    }

    public static boolean validarCPF(String cpf) {
        return cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
    }

    public static boolean validarEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    @Override
    public String toString() {
        return "EmpresaCompradora{" +
                "nomeEmpresaCompradora='" + nomeEmpresaCompradora + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", responsavelLegal='" + responsavelLegal + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", materiaisComprados=" + materiaisComprados +
                '}';
    }

    public void setNomeEmpresaCompradora(String nomeEmpresaCompradora) {
        this.nomeEmpresaCompradora = nomeEmpresaCompradora;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public void setMateriaisComprados(List<MateriaisComprados> materiaisComprados) {
        this.materiaisComprados = materiaisComprados;
    }

    public String getNomeEmpresaCompradora() {
        return nomeEmpresaCompradora;
    }

    public List<MateriaisComprados> getMateriaisComprados() {
        return materiaisComprados;
    }
}
