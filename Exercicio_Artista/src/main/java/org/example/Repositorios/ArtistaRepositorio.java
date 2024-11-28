package org.example.Repositorios;

import org.example.Entidade.T_ARTISTA;
import org.example.Entidade.T_MUSICA;
import org.example.Infrastructure.DataBaseConfig;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArtistaRepositorio implements _CrudRepositorio<T_ARTISTA>{
    @Override
    public void Insert(T_ARTISTA artista) {
        try {
            var conn = DataBaseConfig.getConnection();
            var query = "INSERT INTO T_ARTISTA (nome, genero) VALUES (?,?)";
            var stmt = conn.prepareStatement(query);
            stmt.setString(1, artista.getNome());
            stmt.setString(2, artista.getGenero());

            stmt.executeUpdate();
            stmt.close();
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void Update(T_ARTISTA entity, int id) {
        try{
            var conn = DataBaseConfig.getConnection();
            var query = "UPDATE T_ARTISTA SET NOME= ?, GENERO = ? WHERE ID_ARTISTA= ?";
            var stmt = conn.prepareStatement(query);
            stmt.setString(1, entity.getNome());
            stmt.setString(2, entity.getGenero());
            stmt.setInt(3, id);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public void Insert(T_MUSICA musica) {
    }

    @Override
    public void Update(T_MUSICA entity, int id) {
    }

    @Override
    public void Delete(int id) {
        try {

            var conn = DataBaseConfig.getConnection();
            var query = "DELETE FROM T_ARTISTA WHERE ID = ?";
            var stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public T_ARTISTA GetById(int id) {
        Optional<T_ARTISTA> artista = Optional.empty();

        try{
            var conn = DataBaseConfig.getConnection();
            var query = "SELECT * FROM T_ARTISTA WHERE ID = ?";
            var stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            // rs = resultado
            var rs = stmt.executeQuery();
            if(rs.next()){
                var rsId = rs.getInt("ID");
                var nome = rs.getString("NOME");
                var genero = rs.getString("GENERO");
                artista = Optional.of(new T_ARTISTA(nome, genero));
            }

            rs.close();
            stmt.close();
            conn.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println(id);
    }

    @Override
    public List<T_ARTISTA> GetAll() {
            List<T_ARTISTA> artista = new ArrayList<>();
            try {

                var conn = DataBaseConfig.getConnection();
                var query = "SELECT * FROM ARTISTA ORDER BY ID";
                var stmt = conn.prepareStatement(query);
                var rs = stmt.executeQuery();
                while (rs.next()) {
                    var rsId = rs.getInt("ID");
                    var nome = rs.getString("NOME");
                    var genero = rs.getString("GENERO");
                    artista.add(new T_ARTISTA(rsId, nome, genero));
                }
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();

            }
        return artista;
    }
}


