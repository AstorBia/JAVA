package Repositorio;

import Entidades._EntidadeBase;

import Util.Log4jLogger;

import java.util.ArrayList;
import java.util.List;

public class _RepositorioBaseImpl <T extends _EntidadeBase> implements _RepositorioBase<T> {

    ArrayList<T> Lista = new ArrayList<>();

    protected Log4jLogger logger;

    @Override
    public void Adicionar(T entidade) {
    }

    @Override
    public void Listar() {
    }

    @Override
    public void Delete(String id) {
    }

    @Override
    public T GetById(String id) {
        return _RepositorioBase.super.GetById(id);
    }

    @Override
    public List<T> GetAll() {
        return _RepositorioBase.super.GetAll();
    }
}
