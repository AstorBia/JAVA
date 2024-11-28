package Repositorio;

import Entidades._EntidadeBase;


import java.util.List;

public interface _RepositorioBase <T extends _EntidadeBase>{
   void Adicionar(T entidade);
   void Listar ();
   void Delete(String id);
   default T GetById(String id){
       return null;
   }
   default List<T> GetAll(){
       return List.of();
   }

}
