package org.example.Repositorios;

import org.example.Entidade.T_MUSICA;
import org.example.Infrastructure.DataBaseConfig;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MusicaRepositorio implements _CrudRepositorio{

   @Override
    public void Insert(T_MUSICA musica) {
        try{
            var conn = DataBaseConfig.getConnection();
            var query = "INSERT INTO T_MUSICA (nome, duracao) VALUES (?,?)";
            var stmt  = conn.prepareStatement(query);
            stmt.setString(1, musica.getNome());
            stmt.setInt(2, musica.getDuracao());
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void Update(T_MUSICA entity, int id) {
        try{
            var conn = DataBaseConfig.getConnection();
            var query = "UPDATE T_MUSICA SET NOME = ?, DURACAO = ? WHERE id = ?";
            var stmt = conn.prepareStatement(query);
            stmt.setString(1, entity.getNome());
            stmt.setInt(2, entity.getDuracao());
            stmt.setInt(3, id);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }


    }

    @Override
    public void Delete(int id) {
        try{
            var conn = DataBaseConfig.getConnection();
            var query = "DELETE FROM T_MUSICA WHERE id = ?";
            var stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public Object GetById(int id) {
        Optional<T_MUSICA> musica = Optional.empty();
        try{
            var conn = DataBaseConfig.getConnection();
            var query = "SELECT * FROM T_MUSICA WHERE ID = ?";
            var stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            var rs = stmt.executeQuery();
            if(rs.next()){
                var rsId = rs.getInt("ID");
                var nome = rs.getString("NOME");
                var duracao = rs.getInt("DURACAO");
                musica = Optional.of(new T_MUSICA(nome, duracao));
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
    public List<T_MUSICA> GetAll() {
        List<T_MUSICA> musica = new ArrayList<>();
        try{
            var conn = DataBaseConfig.getConnection();
            var query = "SELECT * FROM T_MUSICA ORDER BY ID";
            var stmt = conn.prepareStatement(query);
            var rs = stmt.executeQuery();
            while (rs.next()){
                var rsId = rs.getInt("ID");
                var nome = rs.getString("NOME");
                var duracao = rs.getInt("DURACAO");
                musica.add(new T_MUSICA(rsId, nome, duracao));
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return musica;
    }
}
