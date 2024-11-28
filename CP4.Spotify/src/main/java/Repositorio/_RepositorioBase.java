package Repositorio;

import Entidades._EntidadeBase;

import java.util.ArrayList;

public interface _RepositorioBase <T extends _EntidadeBase>{
    void adicionar(T objeto);
    ArrayList<T> listar();

}
