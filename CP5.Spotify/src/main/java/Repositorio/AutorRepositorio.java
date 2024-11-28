package Repositorio;

import Entidades.T_Autor;
import Infrastrutura.DataBaseConfig;
import Servico.ValidadorEntidades;

import java.util.ArrayList;
import java.util.List;

public class AutorRepositorio implements _RepositorioBase<T_Autor>{
    @Override
    public void Adicionar(T_Autor autor) {
        if (ValidadorEntidades.validarT_Autor(autor)) {
            try {
                var conn = DataBaseConfig.getConnection();
                var query = "INSERT INTO T_autor (id, nome) VALUES(?,?)";
                var stmt = conn.prepareStatement(query);
                stmt.setString(1, autor.getIdEntidade());
                stmt.setString(2, autor.getNome());
                stmt.executeUpdate();
                stmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Erro ao adicionar o Autor");
        }

    }

    @Override
    public void Listar() {
        try {
            var conn = DataBaseConfig.getConnection();
            var query = "SELECT * FROM T_autor";
            var stmt = conn.prepareStatement(query);
            var rs = stmt.executeQuery();

            while (rs.next()) {
                var rsId = rs.getString("id");
                var rsNome = rs.getString("nome");
                System.out.println("ID: " + rsId + " | Nome: " + rsNome);
            }
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void Delete(String id) {

    }

    @Override
    public T_Autor GetById(String id) {
        T_Autor autor = null;
        try {
            var conn = DataBaseConfig.getConnection();
            var query = "SELECT * FROM T_Autor WHERE id = ?";
            var stmt = conn.prepareStatement(query);
            stmt.setString(1, id);

            var rs = stmt.executeQuery();
            if (rs.next()) {
                var rsId = rs.getString("id");
                var nome = rs.getString("nome");
                autor = new T_Autor(rsId, nome);
            }

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return autor;
    }

    @Override
    public List<T_Autor> GetAll() {
        List<T_Autor> autor = new ArrayList<>();

        try{
            var conn = DataBaseConfig.getConnection();
            var query = "SELECT * FROM T_Autor";
            var stmt = conn.prepareStatement(query);
            var rs = stmt.executeQuery();

            while(rs.next()){
                var rsId = rs.getString("id");
                var nome = rs.getString("nome");
                autor.add(new T_Autor(rsId, nome));
            }

            stmt.close();
            conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return autor;
    }
}

