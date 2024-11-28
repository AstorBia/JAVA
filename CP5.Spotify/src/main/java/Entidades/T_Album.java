package Entidades;
import java.util.List;

public class T_Album extends _EntidadeBase{
    private String nomeAlbum;
    private List<T_AudioBook> audioBooks;

    public T_Album() {
    }

    public T_Album(String idEntidade, String nomeAlbum, List<T_AudioBook> audioBooks) {
        super(idEntidade);
        this.nomeAlbum = nomeAlbum;
        this.audioBooks = audioBooks;
    }

    public T_Album(String idEntidade, String nomeAlbum) {
        super(idEntidade);
        this.nomeAlbum = nomeAlbum;
    }

    public T_Album(String nomeAlbum, List<T_AudioBook> audioBooks) {
        this.nomeAlbum = nomeAlbum;
        this.audioBooks = audioBooks;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public List<T_AudioBook> getAudioBooks() {
        return audioBooks;
    }

    public void setAudioBooks(List<T_AudioBook> audioBooks) {
        this.audioBooks = audioBooks;
    }

    @Override
    public String toString() {
        return "Album{" +
                "nomeAlbum='" + nomeAlbum + '\'' +
                ", audioBooks=" + audioBooks +
                '}';
    }
}
