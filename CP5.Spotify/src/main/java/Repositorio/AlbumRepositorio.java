package Repositorio;


import Entidades.T_Album;
import Infrastrutura.DataBaseConfig;
import Servico.ValidadorEntidades;

import java.util.ArrayList;
import java.util.List;

public class AlbumRepositorio implements _RepositorioBase<T_Album> {


    @Override
    public void Adicionar(T_Album album) {
        if (ValidadorEntidades.validarT_Album(album)) {
            try {
                var conn = DataBaseConfig.getConnection();
                var query = "INSERT INTO T_Album (id, nomeAlbum) VALUES(?,?)";
                var stmt = conn.prepareStatement(query);
                stmt.setString(1, album.getIdEntidade());
                stmt.setString(2, album.getNomeAlbum());
                stmt.executeUpdate();
                stmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("Erro ao adicionar Album");
        }

    }

    @Override
    public void Listar() {
        try{
            var conn = DataBaseConfig.getConnection();
            var query = "SELECT * FROM T_Album";
            var stmt = conn.prepareStatement(query);
            var rs = stmt.executeQuery();

            while (rs.next()){
                var rsId = rs.getString("id");
                var nomeAlbum = rs.getString("nomeAlbum");
                System.out.println("ID: " + rsId + "| Nome: " + nomeAlbum);
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public T_Album GetById(String id) {

        T_Album album = null;

        try{
            var conn = DataBaseConfig.getConnection();
            var query = "SELECT * FROM T_Autor WHERE id = ?";
            var stmt = conn.prepareStatement(query);
            stmt.setString(1, id);
            var rs = stmt.executeQuery();

            if(rs.next()){
                var nomeAlbum = rs.getString("nomeAlbum");
                album = new T_Album(id, nomeAlbum);
            }
            rs.close();
            stmt.close();
            conn.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return album;
    }

    @Override
    public List<T_Album> GetAll() {
        List<T_Album> albuns = new ArrayList<>();

        try{
            var conn = DataBaseConfig.getConnection();
            var query = "SELECT * FROM T_Album";
            var stmt = conn.prepareStatement(query);
            var rs = stmt.executeQuery();

            while(rs.next()){
                var rsId = rs.getString("id");
                var nomeAlbum = rs.getString("nomeAlbum");
                albuns.add(new T_Album(rsId, nomeAlbum));
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return albuns;
    }


    @Override
    public void Delete(String id) {
        try{
            var conn = DataBaseConfig.getConnection();
            var query = "DELETE FROM T_AudioBook WHERE id = ?";
            var stmt = conn.prepareStatement(query);
            stmt.setString(1, id);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}

