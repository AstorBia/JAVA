package Repositorio;

import Entidades._EntidadeBase;

import Util.Log4jLogger;

import java.util.ArrayList;

public class _RepositorioBaseImpl <T extends _EntidadeBase> implements _RepositorioBase<T>{

    ArrayList<T> lista = new ArrayList<>();

    protected Log4jLogger logger;


    @Override
    public void adicionar(T objeto) {

    }

    @Override
    public ArrayList<T> listar() {
        return null;
    }
}
