package org.example.Repositorios;

import org.example.Entidade.T_MUSICA;

import java.util.List;

public interface _CrudRepositorio <T> {
    void Insert (T entity);
    void Update(T entity, int id);

    void Insert(T_MUSICA musica);

    void Update(T_MUSICA entity, int id);

    void Delete(int id);
    T GetById(int id);
    List<T> GetAll();
}

// esta certo ter dois Insert e update???

