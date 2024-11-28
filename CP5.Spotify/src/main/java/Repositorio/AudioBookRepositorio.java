package Repositorio;

import Entidades.T_AudioBook;
import Infrastrutura.DataBaseConfig;
import Servico.ValidadorEntidades;

import java.util.ArrayList;
import java.util.List;

public class AudioBookRepositorio implements _RepositorioBase<T_AudioBook>{
    List<T_AudioBook> lista = new ArrayList<>();

    @Override
    public void Adicionar(T_AudioBook audioBook) {
        if (ValidadorEntidades.validarT_AudioBook(audioBook)){
            try{
                var conn = DataBaseConfig.getConnection();
                var query = "INSERT INTO T_audioBook (id, titulo, categoria, ano_lancamento) VALUES(?,?,?,?)";
                var stmt = conn.prepareStatement(query);
                stmt.setString(1, audioBook.getIdEntidade());
                stmt.setString(2, audioBook.getTitulo());
                stmt.setString(3, audioBook.getCategoria());
                stmt.setInt(4, audioBook.getAno_lancamento());
                stmt.executeUpdate();
                stmt.close();
                conn.close();
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("Erro ao Adicionar o AudioBook");
        }
    }

    @Override
    public void Listar() {
        try{
            var conn = DataBaseConfig.getConnection();
            var query = "SELECT * FROM T_AUDIOBOOK";
            var stmt = conn.prepareStatement(query);
            var rs = stmt.executeQuery();

            while (rs.next()){
                var rsId = rs.getString("id");
                var rsTitulo = rs.getString("titulo");
                var rsCategoria = rs.getString("categoria");
                var rsano_lancamento = rs.getString("ano_lancamento");
                System.out.println("ID: " + rsId + " | Titulo: " + rsTitulo + " | Categoria: " + rsCategoria + " | Ano: " + rsano_lancamento);
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    public List<T_AudioBook> GetByCategoria(String categoria) {
        List<T_AudioBook> audioBooks = new ArrayList<>();

        try{
            var conn = DataBaseConfig.getConnection();
            var query = "SELECT * FROM T_AudioBook WHERE CATEGORIA LIKE ?";
            var stmt = conn.prepareStatement(query);
            stmt.setString(1, "%" + categoria + "%");
            var rs = stmt.executeQuery();
            if(rs.next()){
                var rsId = rs.getString("id");
                var rsTitulo = rs.getString("titulo");
                var rscategoria = rs.getString("categoria");
                var rsano_lancamento = rs.getInt("ano_lancamento");
                audioBooks.add(new T_AudioBook(rsId, rsTitulo, rscategoria, rsano_lancamento));
            }
            stmt.close();
            conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return audioBooks;
    }


    public T_AudioBook GetByAnoLancamento(int anoLancamento) {

        T_AudioBook audioBook = null;

        try{
            var conn = DataBaseConfig.getConnection();
            var query = "SELECT * FROM T_AudioBook WHERE ano_lancamento = ?";
            var stmt = conn.prepareStatement(query);
            stmt.setInt(1, anoLancamento);
            var rs = stmt.executeQuery();

            if(rs.next()){
                var rsId = rs.getString("id");
                var rsTitulo = rs.getString("titulo");
                var rscategoria = rs.getString("categoria");
                var rsano_lancamento = rs.getInt("ano_lancamento");
                audioBook = new T_AudioBook(rsId, rsTitulo, rscategoria, rsano_lancamento);
            }
            stmt.close();
            conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return audioBook;
    }

   @Override
    public List<T_AudioBook> GetAll() {
        List<T_AudioBook> audioBooks = new ArrayList<>();

        try{
            var conn = DataBaseConfig.getConnection();
            var query = "SELECT * FROM T_AudioBook";
            var stmt = conn.prepareStatement(query);
            var rs = stmt.executeQuery();

            while(rs.next()){
                var rsId = rs.getString("id");
                var titulo = rs.getString("titulo");
                var categoria = rs.getString("categoria");
                var anoLancamento = rs.getInt("anoLancamento");
                audioBooks.add(new T_AudioBook(rsId, titulo, categoria, anoLancamento));
            }

            stmt.close();
            conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
       return audioBooks;
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


