package Entidades;
import java.util.List;

public class Album extends _EntidadeBase{
    private String nomeAlbum;
    private List<AudioBook> audioBooks;

    public Album() {
    }

    public Album(String nomeAlbum, List<AudioBook> audioBooks) {
        this.nomeAlbum = nomeAlbum;
        this.audioBooks = audioBooks;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public List<AudioBook> getAudioBooks() {
        return audioBooks;
    }

    public void setAudioBooks(List<AudioBook> audioBooks) {
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
