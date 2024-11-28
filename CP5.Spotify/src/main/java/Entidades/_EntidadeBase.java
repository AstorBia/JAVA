package Entidades;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class _EntidadeBase {
    private static final Logger log = LogManager.getLogger(_EntidadeBase.class);
    private String idEntidade;

    public _EntidadeBase() {
    }

    public _EntidadeBase(String idEntidade) {
        this.idEntidade = idEntidade;
    }

    public String getIdEntidade() {
        return idEntidade;
    }

    public void setIdEntidade(String idEntidade) {
        this.idEntidade = idEntidade;
    }

    @Override
    public String toString() {
        return "_EntidadeBase{" +
                "idEntidade=" + idEntidade +
                '}';
    }
}
