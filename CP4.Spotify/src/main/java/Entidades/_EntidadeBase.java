package Entidades;

public class _EntidadeBase {
    private int idEntidade;

    public _EntidadeBase() {
    }

    public _EntidadeBase(int idEntidade) {
        this.idEntidade = idEntidade;
    }

    public int getIdEntidade() {
        return idEntidade;
    }

    public void setIdEntidade(int idEntidade) {
        this.idEntidade = idEntidade;
    }

    @Override
    public String toString() {
        return "_EntidadeBase{" +
                "idEntidade=" + idEntidade +
                '}';
    }
}
